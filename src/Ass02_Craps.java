import java.util.Scanner;
import java.util.Random;

public class Ass02_Craps
{
    public static void main(String[] args)
    {
        //initializing my starting variables and objects//
        boolean done = false;
        boolean point = false;
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        String yorN = "";

        // first do-while loop//
        do{
            int d1 = rnd.nextInt(6) + 1;
            System.out.println("First die roles: " + d1);

            int d2 = rnd.nextInt(6) + 1;
            System.out.println("Second die roles: " + d2);

            int roll = d1 + d2;
            System.out.println("Die Total: " + roll);

            if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You got a craps! Game Over.");
                System.out.println("Play Again? Y/N");
                yorN = in.nextLine();
                done = !yorN.equalsIgnoreCase("Y");
            }

            if (roll == 7 || roll == 11) {
                System.out.println("You got a natural! You Win.");
            }
            else {


                System.out.println("You hit the point! Rolling Again...");
                //second do-while loop//
                do {

                    int d3 = rnd.nextInt(6) + 1;
                    System.out.println("First die roles: " + d3);

                    int d4 = rnd.nextInt(6) + 1;
                    System.out.println("Second die roles: " + d4);

                    System.out.println("Die Total: " + roll);

                    int rollTwo = d3 + d4;
                    if (rollTwo == 7) {
                        System.out.println("You got a 7! Game over.");
                        point = true;
                    }
                    if (rollTwo == roll) {
                        System.out.println("You hit the point! You win.");
                        point = true;
                    }
                    else {
                        System.out.println("Not a point or 7. Rolling Again...");
                        point = false;
                    }
                }
                while(!point);

            }
            System.out.println("Play Again? Y/N");
            yorN = in.nextLine();
            done = !yorN.equalsIgnoreCase("Y");
        }
        while(!done);
    }
}