import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Lab_06_05_HighorLow {
    public static void main(String[] args) {
        int guess = 0;
        int random = ((int) (Math.random()*10) + 1);
        System.out.println("Please guess a random number between 1 and 10");
        // scanner object//
        Scanner in = new Scanner(System.in);
        //if statement to check if there is a valid input//
        if (in.hasNextInt()){
            guess = in.nextInt();
        }
        else{
            //error statement//
            System.out.println("Please enter a valid number!");
            //prompt to end the program//
            System.exit(0);
        }
        System.out.println("The random number was " + random);
        // If statements to parse the input//
        if(guess == random){
            System.out.println("YOU GUESSED CORRECTLY!");
        }
        if (guess < random) {
            System.out.println("Your guess was too low");
        }
        if (guess > random) {
            System.out.println("Your guess was too high");

        }


    }
}
