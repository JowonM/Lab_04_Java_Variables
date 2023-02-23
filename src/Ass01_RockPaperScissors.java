import java.util.Scanner;
public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        //prompt to get the players moves //
        Scanner playerA = new Scanner(System.in);
        Scanner playerB = new Scanner(System.in);
        String move1 = "";
        String move2 = "";
        String playAgain = "";

        System.out.println("The please enter (R/P/S) or (r/p/s) in order to play.");

        System.out.println("Would you like to play Rock, Paper, And Scissors? (please enter Y/N)");
        Scanner play = new Scanner(System.in);
        playAgain = play.next();



        while(playAgain.equalsIgnoreCase("Y")) {

            System.out.println("Player A, Please input your move...");
            move1 = (playerA.next()).toLowerCase();
            System.out.println(move1);

            System.out.println("Player B, Please input your move...");
            move2 = (playerB.next()).toLowerCase();
            System.out.println(move2);

            if (move1.contains("r") || move1.contains("p") || move1.contains("s")) {
                if (move2.contains("r") || move2.contains("p") || move2.contains("s")) {

                    System.out.println("it works");
                    System.out.println("Would you like to play again? (Y/N");
                    playAgain = play.next();


                }
            }

            else {
                System.out.println("Please enter a valid input");
                break;
            }
        }




        }










    }

