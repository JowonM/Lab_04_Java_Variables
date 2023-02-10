public class Lab_05_05_NumCompare {
    public static void main(String[] args) {
        double inputA = 100;
        double inputB = 200;
        //faking a scanner object here for the inputs//
        System.out.println("Please enter your first number");
        System.out.println("Please enter your second number");
        if(inputA > inputB){
            System.out.println("Your second input is smaller");
        }
        else if (inputB > inputA) {
            System.out.println("Your first input is smaller than");
        }
        else if (inputB == inputA) {
            System.out.println("Your inputs are equal");

        }
    }
}
