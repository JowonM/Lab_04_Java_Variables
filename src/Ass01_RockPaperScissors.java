import java.util.Scanner;
public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        //prompt to get the players moves //
        Scanner playerA = new Scanner(System.in);
        Scanner playerB = new Scanner(System.in);
        String move1 = "";
        String move2 = "";
        String playAgain = "";


        System.out.println("Would you like to play Rock, Paper, And Scissors? (please enter Y/N)");
        System.out.println("The valid moves are (R/P/S) or (r/p/s)");
//scanner for the play again variable//
        Scanner play = new Scanner(System.in);
        playAgain = play.next();


//do while loop for the actual game//
        while(playAgain.equalsIgnoreCase("Y")) {
//inputs changed to lower case for easy usage//
            System.out.println("Player A, Please input your move...");
            move1 = (playerA.next()).toLowerCase();

            System.out.println("Player B, Please input your move...");
            move2 = (playerB.next()).toLowerCase();

            if (move1.contains("r") || move1.contains("p") || move1.contains("s")) {
                if (move2.contains("r") || move2.contains("p") || move2.contains("s")) {

                    if (move2.equalsIgnoreCase(move1)){
                        System.out.println(move1 + " vs " + move2 + ", It's a tie!");
                        System.out.println("Would you like to play again? (Y/N");
                        playAgain = play.next();

                    }

                    if (move1.equalsIgnoreCase("r") && move2.equalsIgnoreCase("p")){
                        move1 = "Rock";
                        move2 = "Paper";
                        System.out.println(move2 + " covers " + move1 + ", Player B Wins!");
                        System.out.println("Would you like to play again? Y/N");
                        playAgain = play.next();
                    }
                    if (move1.equalsIgnoreCase("p") && move2.equalsIgnoreCase("r")){
                        move2 = "Rock";
                        move1 = "Paper";
                        System.out.println(move1 + " covers" + move2 + ", Player A Wins!");
                        System.out.println("Would you like to play again? Y/N");
                        playAgain = play.next();
                    }
                    if (move1.equalsIgnoreCase("s") && move2.equalsIgnoreCase("p")){
                        move1 = "Scissors";
                        move2 = "Paper";
                        System.out.println(move1 + " cuts " + move2 + ", Player A Wins!");
                        System.out.println("Would you like to play again? Y/N");
                        playAgain = play.next();
                    }
                    if (move1.equalsIgnoreCase("p") && move2.equalsIgnoreCase("s")){
                        move2 = "Scissors";
                        move1 = "Paper";
                        System.out.println(move2 + " cuts " + move1 + ", Player B Wins!");
                        System.out.println("Would you like to play again? Y/N");
                        playAgain = play.next();
                    }
                    if (move1.equalsIgnoreCase("s") && move2.equalsIgnoreCase("r")){
                        move1 = "Scissors";
                        move2 = "Rock";
                        System.out.println(move2 + " breaks " + move1 + ", Player B Wins!");
                        System.out.println("Would you like to play again? Y/N");
                        playAgain = play.next();
                    }
                    if (move1.equalsIgnoreCase("r") && move2.equalsIgnoreCase("s")){
                        move2 = "Scissors";
                        move1 = "Rock";
                        System.out.println(move1 + " breaks " + move2 + ", Player A Wins!");
                        System.out.println("Would you like to play again? Y/N");
                        playAgain = play.next();
                    }
                }
            }

            else {
                System.out.println("Please enter a valid input");

            }
        }




        }










    }

