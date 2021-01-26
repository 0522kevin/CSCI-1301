import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        //creates scanner object called scan
        Scanner scan = new Scanner (System.in);

        //declares variables needed for this assignment
        String desiredFinalGrade;
        String answer;

        int weightExam1;
        int weightExam2;
        int weightFinalExam;
        int weightLabs;
        int weightProjects;
        int weightParticipation;
        int weightQuizzes;
        int totalGradeWeight;
        int totalKnownGradeWeight = 0;

        double scoreExam1;
        double scoreExam2;
        double scoreFinalExam;
        double scoreLabs;
        double scoreProjects;
        double scoreParticipation;
        double scoreQuizzes;
        double currentScore;
        double avgToFinalLetterGrade;

        //asks the user to input the desired final letter grade
        System.out.println("Grading Scale:");
        System.out.println("A     90 - 100");
        System.out.println("B     80 - 89");
        System.out.println("C     70 - 79");
        System.out.println("D     60 - 69");
        System.out.println("F     below 60");
        System.out.print("What letter grade do you want to achieve for the course?");
        desiredFinalGrade = scan.next();

        //if desired final letter grade does not equal A or a
        if(!desiredFinalGrade.equalsIgnoreCase("a")) {
            //if desired final letter grade does not equal B or b
            if(!desiredFinalGrade.equalsIgnoreCase("b")) {
                //if desired final letter grade does not equal C or c
                if(!desiredFinalGrade.equalsIgnoreCase("c")) {
                    //if desired final letter grade does not equal D or d
                    if(!desiredFinalGrade.equalsIgnoreCase("d")) {
                        //if desired final letter grade does not equal F or f
                        if(!desiredFinalGrade.equalsIgnoreCase("f")) {
                            //the program is shut down
                            System.out.println("The input is invalid.");
                            System.exit(-1);
                        }
                    }
                }
            }
        }

        //asks the user to input the weights for assignments
        //stores the input immediately to the correct variable
        System.out.println("Enter percentage weights below.");
        System.out.print("Exam 1:             ");
        weightExam1 = scan.nextInt();
        System.out.print("Exam 2:             ");
        weightExam2 = scan.nextInt();
        System.out.print("Final Exam:         ");
        weightFinalExam = scan.nextInt();
        System.out.print("Labs:               ");
        weightLabs = scan.nextInt();
        System.out.print("Projects:           ");
        weightProjects = scan.nextInt();
        System.out.print("Participation:      ");
        weightParticipation = scan.nextInt();
        System.out.print("Quizzes:            ");
        weightQuizzes = scan.nextInt();

        //sums up the weights for assignments
        totalGradeWeight = weightExam1 + weightExam2 + weightFinalExam + weightLabs + weightProjects + weightParticipation + weightQuizzes;

        //if the total grade weight does not equal 100
        if(totalGradeWeight != 100) {
            //the program is shut down
            System.out.println("Weights don't add up to 100, program exiting...");
            System.exit(-1);
        }

        System.out.print("Do you know your exam 1 score?");
        //stores the user's answer in the answer variable
        answer = scan.next();
        //if answer equals y or yes
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.print("Score received on exam 1:");
            scoreExam1 = scan.nextDouble();
            //totalKnownGradeWeight adds itself to weightExam1 because the program knows that the user knows
            //the grade for exam 1
            totalKnownGradeWeight += weightExam1;
            System.out.print("Do you know your exam 2 score?");
            answer = scan.next();
            if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                System.out.print("Score received on exam 2:");
                scoreExam2 = scan.nextDouble();
                totalKnownGradeWeight += weightExam2;
                System.out.print("Do you know your final exam score?");
                answer = scan.next();
                if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                    System.out.print("Score received on final exam:");
                    scoreFinalExam = scan.nextDouble();
                    totalKnownGradeWeight += weightFinalExam;
                }
                else {
                    //if the user does not know the score for an assignment the program stores 0 in its place
                    //by storing 0, the variable does not affect the score calculation
                    scoreFinalExam = 0;
                }
            }
            else {
                scoreExam2 = 0;
                scoreFinalExam = 0;
            }
        }
        else {
            scoreExam1 = 0;
            scoreExam2 = 0;
            scoreFinalExam = 0;
        }

        System.out.print("Do you know your lab average?");
        answer = scan.next();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.print("Average lab grade:");
            scoreLabs = scan.nextDouble();
            totalKnownGradeWeight += weightLabs;
        }
        else {
            scoreLabs = 0;
        }

        System.out.print("Do you know your project average?");
        answer = scan.next();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.print("Average project grade:");
            scoreProjects = scan.nextDouble();
            totalKnownGradeWeight += weightProjects;
        }
        else {
            scoreProjects = 0;
        }

        System.out.print("Do you know your participation average?");
        answer = scan.next();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.print("Average participation grade:");
            scoreParticipation = scan.nextDouble();
            totalKnownGradeWeight += weightParticipation;
        }
        else {
            scoreParticipation = 0;
        }

        System.out.print("Do you know your quiz average?");
        answer = scan.next();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.print("Average quiz grade:");
            scoreQuizzes = scan.nextDouble();
            totalKnownGradeWeight += weightQuizzes;
        }
        else {
            scoreQuizzes = 0;
        }

        //calculates the current grade using the algorithm provided
        currentScore = (weightExam1 * scoreExam1 + weightExam2 * scoreExam2 + weightFinalExam * scoreFinalExam +
                weightLabs * scoreLabs + weightParticipation * scoreParticipation + weightProjects * scoreProjects +
                weightQuizzes * scoreQuizzes) / totalKnownGradeWeight;

        //formats currentScore to have two decimal places
        //then prints the current score
        currentScore = Math.round(currentScore * 100.00) / 100.00;
        System.out.println("Current grade score:" + currentScore);

        //uses multi-branch if-else statements to determine what the student's letter grade is
        if(currentScore >= 90 && currentScore <= 100){
            System.out.println("Your current letter grade:A");
        }
        else if(currentScore >= 80 && currentScore < 90){
            System.out.println("Your current letter grade:B");
        }
        else if(currentScore >= 70 && currentScore < 80){
            System.out.println("Your current letter grade:C");
        }
        else if(currentScore >= 60 && currentScore < 70){
            System.out.println("Your current letter grade:D");
        }
        else if(currentScore >= 0 && currentScore < 60){
            System.out.println("Your current letter grade:F");
        }

        //if totalKnownGradeWeight does not equal 100
        //or when the student does not know all the grades
        if(totalKnownGradeWeight != 100) {
            if(desiredFinalGrade.equalsIgnoreCase("a")) {
                //algorithm provided by the worksheet
                avgToFinalLetterGrade = (9000 - currentScore * totalKnownGradeWeight) / (100 - totalKnownGradeWeight);
                //formats avgToFinalLetterGrade to have two decimal places
                avgToFinalLetterGrade = Math.round(avgToFinalLetterGrade * 100.00) / 100.00;
                //if avgToFinalLetterGrade is equal or smaller to 0
                //it means that the student will achieve the desired final grade no matter what
                if(avgToFinalLetterGrade <= 0) {
                    System.out.println("You will receive at least a grade of A.");
                }
                //if avgToFinalLetterGrade is greater than 100
                //there is no way the student can achieve the desired final grade
                else if(avgToFinalLetterGrade > 100) {
                    System.out.println("Unfortunately, a grade of A is not possible.");
                }
                else {
                    //prints out the avgToFinalLetterGrade
                    System.out.println("In order to receive a grade of A,\nyou need to score an average greater than \nor equal to " + avgToFinalLetterGrade +
                            " in the rest of the grade items.");
                }
            }
            else if(desiredFinalGrade.equalsIgnoreCase("b")) {
                avgToFinalLetterGrade = (8000 - currentScore * totalKnownGradeWeight) / (100 - totalKnownGradeWeight);
                avgToFinalLetterGrade = Math.round(avgToFinalLetterGrade * 100.00) / 100.00;
                if(avgToFinalLetterGrade <= 0) {
                    System.out.println("You will receive at least a grade of B.");
                }
                else if(avgToFinalLetterGrade > 100) {
                    System.out.println("Unfortunately, a grade of B is not possible.");
                }
                else {
                    System.out.println("In order to receive a grade of B,\nyou need to score an average greater than \nor equal to " + avgToFinalLetterGrade +
                            " in the rest of the grade items.");
                }
            }
            else if(desiredFinalGrade.equalsIgnoreCase("c")) {
                avgToFinalLetterGrade = (7000 - currentScore * totalKnownGradeWeight) / (100 - totalKnownGradeWeight);
                avgToFinalLetterGrade = Math.round(avgToFinalLetterGrade * 100.00) / 100.00;
                if(avgToFinalLetterGrade <= 0) {
                    System.out.println("You will receive at least a grade of C.");
                }
                else if(avgToFinalLetterGrade > 100) {
                    System.out.println("Unfortunately, a grade of C is not possible.");
                }
                else {
                    System.out.println("In order to receive a grade of C,\nyou need to score an average greater than \nor equal to " + avgToFinalLetterGrade +
                            " in the rest of the grade items.");
                }
            }
            else if(desiredFinalGrade.equalsIgnoreCase("d")) {
                avgToFinalLetterGrade = (6000 - currentScore * totalKnownGradeWeight) / (100 - totalKnownGradeWeight);
                avgToFinalLetterGrade = Math.round(avgToFinalLetterGrade * 100.00) / 100.00;
                if(avgToFinalLetterGrade <= 0) {
                    System.out.println("You will receive at least a grade of D.");
                }
                else if(avgToFinalLetterGrade > 100) {
                    System.out.println("Unfortunately, a grade of D is not possible.");
                }
                else {
                    System.out.println("In order to receive a grade of D,\nyou need to score an average greater than \nor equal to " + avgToFinalLetterGrade +
                            " in the rest of the grade items.");
                }
            }
            //since it's impossible to get a grade lower than F, any student will at least get a grade of F
            else if(desiredFinalGrade.equalsIgnoreCase("f")) {
                System.out.println("You will receive at least a grade of F.");
            }
        }
        //when the student has inputted all the grades
        //or when totalKnownGradeWeight equals 100
        //all grades are finalized, therefore there is nothing more the student can do
        //so we do not need to calculate avgToFinalLetterGrade
        else {
            if(desiredFinalGrade.equalsIgnoreCase("a")){
                if(currentScore >=90 && currentScore <= 100) {
                    System.out.println("Congratulations! You received the A that you wanted!");
                }
                else {
                    System.out.println("Unfortunately, a grade of A is not possible.");
                }
            }
            if(desiredFinalGrade.equalsIgnoreCase("b")) {
                if(currentScore >= 80 && currentScore < 90) {
                    System.out.println("Congratulations! You received the B that you wanted!");
                }
                else {
                    System.out.println("Unfortunately, a grade of B is not possible.");
                }
            }
            if(desiredFinalGrade.equalsIgnoreCase("c")) {
                if(currentScore >= 70 && currentScore < 80) {
                    System.out.println("Congratulations! You received the C that you wanted!");
                }
                else {
                    System.out.println("Unfortunately, a grade of C is not possible.");
                }
            }
            if(desiredFinalGrade.equalsIgnoreCase("d")) {
                if(currentScore >= 60 && currentScore < 70) {
                    System.out.println("Congratulations! You received the D that you wanted!");
                }
                else {
                    System.out.println("Unfortunately, a grade of D is not possible.");
                }
            }
            if(desiredFinalGrade.equalsIgnoreCase("f")) {
                if(currentScore < 60 && currentScore >= 0) {
                    System.out.println("Congratulations! You received the F that you wanted!");
                }
            }
        }

        //closes Scanner object to avoid warning
        scan.close();
    }

}
