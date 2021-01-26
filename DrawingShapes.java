import java.util.Scanner;

public class DrawingShapes {
    public static void main(String[] args) {
        //creates Scanner object called scan
        Scanner scan = new Scanner(System.in);

        //creates variables that are needed for all cases
        String userInput;
        int shapeLength;

        //asks the user to input what shape to print
        System.out.println("Enter a shape: r t h o p");
        userInput = scan.next();

        //if the user inputs anything other than r, t, h, o, or p
        //the program will automatically close
        if(!userInput.equals("r")) {
            if(!userInput.equals("t")) {
                if(!userInput.equals("h")) {
                    if(!userInput.equals("o")) {
                        if(!userInput.equals("p")) {
                            System.out.println("Invalid shape");
                            System.out.println("Goodbye!");
                            System.exit(-1);
                        }
                    }
                }
            }
        }

        //if the user wants to print a rectangle
        if(userInput.equals("r")) {
            //asks the user to input the length of the rectangle
            System.out.println("Enter a length");
            shapeLength = scan.nextInt();

            //if the user wants the length to be 1 or less
            //the program automatically closes
            if(shapeLength <= 1) {
                System.out.println("Length must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(-1);
            }

            //asks the user to input the height of the rectangle
            System.out.println("Enter a height");
            int shapeHeight = scan.nextInt();

            //if the user wants the height to be 1 or less
            //the program automatically closes
            if(shapeHeight <= 1) {
                System.out.println("Height must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(-1);
            }

            System.out.println("Below is a " + shapeLength + " by " + shapeHeight + " rectangle of *");

            //creates a for loop where for each row * based on shapeLength
            //the for loop will repeat for shapeHeight times
            for(int i = 0; i < shapeHeight; i++) {
                for(int j = 0; j < shapeLength; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        //if the user wants to print a triangle
        if(userInput.equals("t")) {
            //creates variables that are only needed for printing triangle
            int baseWidthCount = 1;
            int currentWidthCount = 1;

            //asks the user to input the length of the triangle
            System.out.println("Enter a length");
            shapeLength = scan.nextInt();

            //if the user want the triangle's length to be 1 or less
            //the program will automatically quit
            if(shapeLength <= 1) {
                System.out.println("Length must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(-1);
            }

            System.out.println("Below is a triangle with two side lengths of " + shapeLength +  " *");

            //calculates what the width of the triangle would be
            for(int i = 0; i < shapeLength  - 1; i++) {
                baseWidthCount += 2;
            }

            //prints the triangle with nested for loops
            for(int i = 1; i < shapeLength + 1; i++) {
                //print blank spaces based on what the width of the triangle is
                for(int x = 0; x < baseWidthCount/2 - currentWidthCount/2; x++) {
                    System.out.print(" ");
                }

                //prints * currentWidthCount times
                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }

                //currentWidthCount adds 2 to itself for every for loop iteration because * needs to be printed 2 more times for each line
                currentWidthCount += 2;
                System.out.println("");
            }
        }

        //if the user wants to print a hexagon
        if(userInput.equals("h")) {
            //asks the user to input the length of each sides of a hexagon
            System.out.println("Enter a length");
            shapeLength = scan.nextInt();

            //the program will automatically close
            //if the user wants the hexagon's length to be 1 or less
            if(shapeLength <= 1) {
                System.out.println("Length must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(-1);
            }

            //declares and initializes the variables that are only needed for this shape
            //shapeLength is the default for these variables
            int middleWidthCount = shapeLength;
            int currentWidthCount = shapeLength;

            System.out.println("Below is a hexagon with side lengths of " + shapeLength + " *");

            //calculates the length of middle of a hexagon
            //this point will be the base of printing the hexagon
            for(int i = 0; i < shapeLength - 1; i++) {
                middleWidthCount += 2;
            }

            //this for loop will print the first half of the hexagon
            for(int i = 0; i < shapeLength; i++) {
                //prints spaces based on middleWidthCount
                for(int x = 0; x < middleWidthCount/2 - currentWidthCount/2; x++) {
                    System.out.print(" ");
                }

                //prints * by currentWidthCount times
                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }

                //adds 2 to itself because * has to be printed 2 more times each line
                currentWidthCount += 2;
                System.out.println("");
            }

            //subtracts 2 because the line has to decrease from the middle
            //and subtract 2 more because the last for loop ended with currentWidthCount += 2
            currentWidthCount -= 4;

            //will print spaces appropriately based on currentWidthCount
            for(int i = 0; i < shapeLength - 1; i++) {
                for(int x = 0; x < middleWidthCount/2 - currentWidthCount/2; x++) {
                    System.out.print(" ");
                }

                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }

                //subtract 2 from currentWidthCount every line because the next line has to print two less *
                currentWidthCount -= 2;
                System.out.println("");
            }
        }

        //if the user wants to print an octagon
        if(userInput.equals("o")) {
            //asks the user to enter the length of octagon
            System.out.println("Enter a length");
            shapeLength = scan.nextInt();

            //if the user wants the length of octagon to be 1 or less than 1
            //the program will automatically close
            if(shapeLength <= 1) {
                System.out.println("Length must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(-1);
            }

            //declares and initializes variables that are only needed to print octagons
            int middleWidthCount = shapeLength;
            int currentWidthCount = shapeLength;

            System.out.println("Below is an octagon with side lengths of " + shapeLength + " *");

            //finds the width of the middle of an octagon
            for(int i = 0; i < shapeLength - 1; i++) {
                middleWidthCount += 2;
            }

            //prints from the beginning and before the square part
            for(int i = 0; i < shapeLength - 1; i++) {
                //prints spaces based on currentWidthCount and middleWidthCount
                for(int x = 0; x < middleWidthCount/2 - currentWidthCount/2; x++) {
                    System.out.print(" ");
                }

                //prints *
                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }

                //adds 2 to currentWidthCount to itself
                currentWidthCount += 2;
                System.out.println("");
            }

            //prints the square part
            for (int i = 0; i < shapeLength; i++) {
                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            //removes 2 from currentWidthCount because it needs to decrease from this point
            currentWidthCount -= 2;

            //prints the decreasing part of an octagon
            for(int i = 0; i < shapeLength - 1; i++) {
                for(int x = 0; x < middleWidthCount/2 - currentWidthCount/2; x++) {
                    System.out.print(" ");
                }

                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }

                //subtracts 2 from every currentWidthCount
                currentWidthCount -= 2;
                System.out.println("");
            }
        }

        //if the user wants to print a pentagon
        if(userInput.equals("p")) {
            int baseWidthCount = 1;
            int currentWidthCount = 1;

            System.out.println("Enter a length");
            shapeLength = scan.nextInt();

            //the program will automatically close if the user wants the pentagon's length to be 1 or less
            if(shapeLength <= 1) {
                System.out.println("Length must be greater than 1");
                System.out.println("Goodbye!");
                System.exit(-1);
            }

            System.out.println("Below is a pentagon with 4 side lengths of " + shapeLength + " *");

            //calculates the width of the base of pentagon
            for(int i = 0; i < shapeLength  - 1; i++) {
                baseWidthCount += 2;
            }

            //prints the pentagon
            for(int i = 0; i < shapeLength - 1; i++) {
                //prints space before * for each line
                for(int x = 0; x < baseWidthCount/2 - currentWidthCount/2; x++) {
                    System.out.print(" ");
                }

                //prints * for each line
                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }

                //currentWidthCount adds 2 to itself
                currentWidthCount += 2;
                System.out.println("");
            }

            for(int i = 0; i < shapeLength; i++) {
                for(int j = 0; j < currentWidthCount; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        //closes Scanner object to avoid warning
        scan.close();
    }
}
