import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        double miles = 0;
        double feet = 0;
        double inches = 0;
        double meters = 0;

        System.out.println("Please input a measurement of length in meters");
        // scanner object//
        Scanner in = new Scanner(System.in);
        //if statement to check if there is a valid input//
        if (in.hasNextDouble()){
            meters = in.nextDouble();
        }
        else{
            //error statement//
            System.out.println("Please enter a valid number!");
        }
        //formulas for all the conversions//
        miles = meters / 1609.344;
        feet = meters * 3.28084;
        inches = meters * 39.3700787402;

        System.out.println(meters + " meters is equal to; " + miles + " miles, " + feet + " feet, and  " + inches + " inches.");
    }
}
