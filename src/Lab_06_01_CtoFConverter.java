import java.util.Scanner;

public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        //a prompt for the temperature//
        System.out.println("Please input the temperature in Celsius");
        // scanner object//
        Scanner in = new Scanner(System.in);
        //if statement to check if there is a valid input//
        if (in.hasNextDouble() == true){
            double temp = in.nextDouble();
            double far = ((temp * 1.8) + 32);
            System.out.println("the temperature is: " + far);
        }
        else{
            System.out.println("Please enter a valid Temperature!");
        }
        }

    }

