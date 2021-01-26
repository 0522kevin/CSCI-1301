import java.util.Scanner;

public class StringFun {
    public static void main(String[] args) {
        //creates Scanner object called scan
        Scanner scan = new Scanner(System.in);

        //declares variables that are needed for all the commands in this program
        String userInput;
        String userCommand;
        int inputLength;

        //asks the user to input the string which will be manipulated throughout the program
        System.out.println("Enter the string to be manipulated");
        userInput = scan.nextLine();

        //initializes the variable
        //this way the program does not have to call the length() method everytime
        inputLength = userInput.length();

        //do while loop so the body executes at least once
        do {
            System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
            userCommand = scan.nextLine();

            //if the user wants to reverse the string
            if(userCommand.equalsIgnoreCase("reverse")) {
                //this variable is only needed for this command
                //this variable will disappear once the program escapes this if statement
                String temporaryHolder;

                for(int i = 0; i < inputLength/2; i++) {
                    //stores the first character on a temporary variable
                    temporaryHolder = userInput.substring(i, i + 1);
                    //inserts the string from behind to the front
                    userInput = userInput.substring(0, i) + userInput.substring(inputLength - 1 - i, inputLength - i) + userInput.substring(i + 1);
                    //inserts the string stored in the variable to the back
                    userInput = userInput.substring(0, inputLength - 1 - i) + temporaryHolder + userInput.substring(inputLength - i);
                    //as i increases, the string stored and concatenated moves toward the center
                }
                //prints the reversed string
                System.out.println("The new sentence is: " + userInput);
            }

            //if the user wants to replace the first occurrence of a character
            if(userCommand.equalsIgnoreCase("replace first")) {
                //declares variables that are only needed for this command
                String oldCharacter;
                String newCharacter;
                //these variables are declared AND initialized
                int replaceCount = 0;
                int letterCheck = 0;

                System.out.println("Enter the character to replace");
                oldCharacter = scan.nextLine();

                System.out.println("Enter the new character");
                newCharacter = scan.nextLine();

                //this for loop checks if the character which the user wants to replace exists in the string
                for(int x = 0; x < inputLength; x++) {
                    if(userInput.substring(x, x + 1).equals(oldCharacter)) {
                        letterCheck++;
                    }
                }

                //if the character exists in the string
                if(letterCheck != 0) {
                    for(int i = 0; i < inputLength; i++) {
                        //this boolean expression means if the character hasn't been replaced
                        if(replaceCount != 1) {
                            //this boolean expression checks if each character is the one that needs to be replaced
                            if(userInput.substring(i, i + 1).equals(oldCharacter)) {
                                //replaces old character to the new character
                                userInput = userInput.substring(0, i) + newCharacter + userInput.substring(i + 1);
                                replaceCount++;
                            }
                        }
                        //if the character has been replaced
                        if(replaceCount == 1){
                            i = inputLength;
                        }
                    }

                    //prints out the result of the replacement
                    System.out.println("The new sentence is: " + userInput);
                }
                //if the character that needs to be replaced does not exist in the string
                else {
                    System.out.println("The letter was not found in the word");
                }
            }

            //if the user wants to replace the last occurrence of a character
            if(userCommand.equalsIgnoreCase("replace last")) {
                //these variables are only needed for this command
                String oldCharacter;
                String newCharacter;
                int replaceCount = 0;
                int letterCheck = 0;

                System.out.println("Enter the character to replace");
                oldCharacter = scan.nextLine();

                System.out.println("Enter the new character");
                newCharacter = scan.nextLine();

                //again, this checks if the old character exists in the string
                for(int x = 0; x < inputLength; x++) {
                    if(userInput.substring(x, x + 1).equals(oldCharacter)) {
                        letterCheck++;
                    }
                }

                if(letterCheck != 0) {
                    //this for loop starts from the end because we need to replace the last occurrence
                    for(int i = inputLength - 1; i >= 0; i--) {
                        if(replaceCount != 1) {
                            if(userInput.substring(i, i + 1).equals(oldCharacter)) {
                                userInput = userInput.substring(0, i) + newCharacter + userInput.substring(i + 1);
                                replaceCount++;
                            }
                        }
                        if(replaceCount == 1){
                            i = -1;
                        }
                    }

                    System.out.println("The new sentence is: " + userInput);
                }
                else {
                    System.out.println("The letter was not found in the word");
                }
            }

            //if the user wants to remove a character from the string
            if(userCommand.equalsIgnoreCase("remove")) {
                //these variables are only needed for this command
                String characterToBeRemoved;
                String temporaryHolder = "";
                int nthCharacterInstance;
                int removeCharacterCount = 0;
                int indexCount = -1;

                System.out.println("Enter the character to remove");
                characterToBeRemoved = scan.nextLine();

                System.out.println("Enter the " + characterToBeRemoved + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
                nthCharacterInstance = scan.nextInt();

                //recalculate the length to avoid error
                //not necessary
                inputLength = userInput.length();

                //calls another line to avoid an error where the next line is called twice
                //pushes the cursor to the next sentence
                scan.nextLine();

                for(int i = 0; i < inputLength; i++) {
                    //indexCount counts the index of the character that needs to be removed
                    //thus it needs to be -1 before the loop for it to correctly count the index
                    indexCount++;
                    if(characterToBeRemoved.equals(userInput.substring(i, i + 1))) {
                        //counts how many same characters there are that need to be removed
                        removeCharacterCount++;
                        //if the program finds the character it needs to remove, it escapes the for loop
                        if(removeCharacterCount == nthCharacterInstance) {
                            i = inputLength;
                        }
                    }
                    //evaluated at the end of the loop
                    //if the user wants to remove more characters than there are, the program will not remove any
                    else if((i == inputLength - 1) && (removeCharacterCount < nthCharacterInstance)) {
                        removeCharacterCount = 0;
                        i = inputLength;
                    }
                }

                //if the program successfully found the character to remove
                if(removeCharacterCount != 0) {
                    for(int i = 0; i < inputLength; i++) {
                        if(i != indexCount) {
                            //the string temporaryHolder stores the characters that does not equal characterToBeRemoved
                            temporaryHolder = temporaryHolder + userInput.substring(i, i + 1);
                        }
                    }
                    userInput = temporaryHolder;
                    //trim the string to get rid of excess space in the string
                    userInput = userInput.trim();
                    System.out.println("The new sentence is: " + userInput);
                }
                //if there are no character to remove
                //either the character does not exist
                //or the numbers of character in the string is lower than the character the user wants to remove
                else {
                    System.out.println("Error: the letter you are trying to remove does not exist");
                }
                //recalculate inputLength for future use
                inputLength = userInput.length();

            }

            if(userCommand.equalsIgnoreCase("remove all")) {
                String characterToBeRemoved;
                String temporaryHolder = "";
                int removeCharacterCount = 0;

                System.out.println("Enter the character to remove");
                characterToBeRemoved = scan.nextLine();

                //checks if te character the user wants to remove exists in the string
                for(int i = 0; i < inputLength; i++) {
                    if(characterToBeRemoved.equals(userInput.substring(i, i + 1))) {
                        removeCharacterCount++;
                    }
                }

                if(removeCharacterCount != 0) {
                    for(int i = 0; i < inputLength; i++) {
                        if(!userInput.substring(i, i + 1).equals(characterToBeRemoved)) {
                            //the string temporaryHolder stores the characters that does not equal characterToBeRemoved
                            temporaryHolder = temporaryHolder + userInput.substring(i, i + 1);
                        }
                    }
                    userInput = temporaryHolder;
                    userInput = userInput.trim();
                    System.out.println("The new sentence is: " + userInput);
                }
                else {
                    System.out.println("Error: the letter you are trying to remove does not exist");
                }
                inputLength = userInput.length();
            }

        }while(!userCommand.equals("Quit"));

    }
}
