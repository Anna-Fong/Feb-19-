import java.sql.SQLOutput;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            /* How the game works:
               User and opponent individually choose a move: Rock, Paper, or Scissors.
               User will either win, lose, or tie, based on their move and their opponents move.
               Rock beats Scissors, Scissors beats Paper, Paper beats Rock.
               If the user and opponent makes the same move, it's a tie.
               Type 'End' to end the game.
            */


            // Variables to keep score
            int Wins = 0;
            int Losses = 0;
            int Ties = 0;

            // Prompt user to make their move.
            System.out.println("Choose one: Rock, Paper, or Scissors." +
                    " 'End' to end the game");
            System.out.println("-------------------------------");

            // Create while loop and scan user input
            boolean keepPlaying = true;
            Scanner scan = new Scanner(System.in);
            while (keepPlaying) {

                // Scan user's move, check whether or not it's a valid option
                String UserChoice = scan.next();
                if (UserChoice.equals("Rock") || UserChoice.equals("Paper") || UserChoice.equals("Scissors")){
                    System.out.print("Your move: " + UserChoice);

                    // If valid, generate and display random move by computer, either Rock, Paper, or Scissors.
                    int rand = (int) ((Math.random() * 3) + 1);
                    String ComputerChoice = "";
                    if (rand == 1) {
                        ComputerChoice = ("Rock");
                    }
                    if (rand == 2) {
                        ComputerChoice = ("Paper");
                    }
                    if (rand == 3) {
                        ComputerChoice = ("Scissors");
                    }
                    System.out.println("\nComputer's move: " + ComputerChoice);

                    // Check and display whether user wins, ties, or looses and display message.
                    if (UserChoice.equals("Rock") && ComputerChoice.equals("Scissors") ||
                            UserChoice.equals("Paper") && ComputerChoice.equals("Rock") ||
                            UserChoice.equals("Scissors") && ComputerChoice.equals("Paper")) {
                        System.out.println("You win!");
                        //Increase wins by 1
                        Wins++;

                    } else if (UserChoice.equals(ComputerChoice)) {
                        System.out.println("You tied!");
                        // Increase ties by 1
                        Ties++;

                    } else {
                        System.out.println("You lose!");
                        //Increase losses by 1
                        Losses++;
                    }

                // Ends game if user selects End
                } else if (UserChoice.equals("End")) {
                    keepPlaying = false;
                    System.out.println("Ended the game.");

                // Handles invalid move
                } else {
                    System.out.println("Invalid move.");
                }

                // Displays score
                System.out.println("Wins: " + Wins + "  Losses: " + Losses + "  Ties: " + Ties);
                System.out.println("-------------------------------");

            }





        }
    }


    

