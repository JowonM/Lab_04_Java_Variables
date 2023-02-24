import java.util.Scanner;



public class Lab_06_01_CtoFConverter {
    public static void main(String[] args) {
        System.out.println("Please input the temperature in Celsius");
        Scanner in = new Scanner(System.in);
        boolean on = false;
            do {
                if(in.hasNextDouble()) {
                    // scanner object//
                    //if statement to check if there is a valid input//
                    double temp = (in.nextDouble());
                    double far = ((temp * 1.8) + 32);
                    System.out.println("the temperature is: " + far);
                    on = true;
                }
                else {
                        System.out.println("Please enter a valid Temperature!");
                        in = new Scanner(System.in);
                        on = false;
                    }
            }
            while (!on);


        }

    }


