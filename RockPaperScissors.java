import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pointsToWin;
        int userWinCount = 0;
        int computerWinCount = 0;

        String computerMove;
        String userMove;

        System.out.print("Points to win: ");
        pointsToWin = scan.nextInt();

        while(pointsToWin != userWinCount && pointsToWin != computerWinCount) {
            System.out.print("Rock, paper, or scissors? ");
            userMove = scan.next();

            while(!userMove.equalsIgnoreCase("rock") &&
                    !userMove.equalsIgnoreCase("paper") &&
                    !userMove.equalsIgnoreCase("scissors")) {
                System.out.println("Wrong input. Try again.");
                System.out.print("Rock, paper, or scissors? ");
                userMove = scan.next();
            }

            computerMove = ComputerOpponent.getMove();

            if(computerMove.equalsIgnoreCase(userMove)) {
                System.out.println("The computer chose " + computerMove + ", so it's a tie. (" + userWinCount + "-" + computerWinCount + ")");
            }
            else if(computerMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("paper")) {
                userWinCount++;
                System.out.println("The computer chose rock, so you win! (" + userWinCount + "-" + computerWinCount + ")");
            }
            else if(computerMove.equalsIgnoreCase("rock") && userMove.equalsIgnoreCase("scissors")) {
                computerWinCount++;
                System.out.println("The computer chose rock, so you lose. (" + userWinCount + "-" + computerWinCount + ")");
            }
            else if(computerMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("rock")) {
                computerWinCount++;
                System.out.println("The computer chose paper, so you lose. (" + userWinCount + "-" + computerWinCount + ")");
            }
            else if(computerMove.equalsIgnoreCase("paper") && userMove.equalsIgnoreCase("scissors")) {
                userWinCount++;
                System.out.println("The computer chose paper, so you win! (" + userWinCount + "-" + computerWinCount + ")");
            }
            else if(computerMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("rock")) {
                userWinCount++;
                System.out.println("The computer chose scissors, so you win! (" + userWinCount + "-" + computerWinCount + ")");
            }
            else if(computerMove.equalsIgnoreCase("scissors") && userMove.equalsIgnoreCase("paper")) {
                computerWinCount++;
                System.out.println("The computer chose scissors, so you lose. (" + userWinCount + "-" + computerWinCount + ")");
            }
        }

        if(pointsToWin == computerWinCount) {
            System.out.println("Sorry, you lost. Better luck next time!");
        }
        else if(pointsToWin == userWinCount) {
            System.out.println("Congratulations! You won!");
        }
    }
}
