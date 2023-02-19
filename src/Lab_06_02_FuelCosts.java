import java.util.Scanner;
public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {
        //initializing my variables//
        double gallons = 0.0;
        double fuelEff = 0.0;
        double price = 0.0;
        //first scanner object//
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the amount of gallons");
        //code to check if the value entered was a number//
        if (in.hasNextDouble()){
            gallons = in.nextDouble();
        }
        else{
            System.out.println("Please enter a valid number");
        }

        System.out.println("please enter your fuel efficiency");
        //code to check if the value entered was a number and second scanner object//
        Scanner inTwo = new Scanner(System.in);
        if (inTwo.hasNextDouble()){
            fuelEff = inTwo.nextDouble();
        }
        else{
            System.out.println("Please enter a valid number");
        }

        System.out.println("please enter the price per gallon of gas");
        //code to check if the value entered was a number and third scanner object//
        Scanner inThree = new Scanner(System.in);
        if (inThree.hasNextDouble()){
            price = inThree.nextDouble();
        }
        else{
            System.out.println("Please enter a valid number");
        }
        //code to find the cost of 100 miles and the current amount of miles you could travel//
        double costPer100 = (100/fuelEff)*price;
        double currentAmount = gallons * fuelEff;

        System.out.println("The cost for 100 miles is: " + costPer100 + " $");
        System.out.println("You can currently go " + currentAmount + " miles");

    }
}
