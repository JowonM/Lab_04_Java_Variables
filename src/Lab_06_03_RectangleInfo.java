import java.util.Scanner;
import java.lang.Math;
public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        System.out.println("Please input a side length");
        // scanner object//
        Scanner in = new Scanner(System.in);
        //if statement to check if there is a valid input//
        if (in.hasNextDouble()){
            length = in.nextDouble();
        }
        else{
            System.out.println("Please enter a valid number!");
        }

        System.out.println("Please input a side width");
        // scanner object//
        Scanner inTwo = new Scanner(System.in);
        //if statement to check if there is a valid input//
        if (inTwo.hasNextDouble()){
            width = inTwo.nextDouble();
        }
        else{
            System.out.println("Please enter a valid number!");
        }
        //variables for the output//
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        //imported Math class for the power function//
        double diagonal = Math.pow(((length*length) + (width*width)),0.5);

        System.out.println ("This is the area: " + area);
        System.out.println ("This is the perimeter: " + perimeter);
        System.out.println ("This is the length of the diagonal: " + diagonal);



    }
}

