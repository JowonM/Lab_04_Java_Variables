public class Lab_05_05_NumCompare {
    public static void main(String[] args) {


        //faking a scanner object here for the inputs//
        System.out.println("Please enter your first number");
        int inputA = 5;
        System.out.println("Please enter your second number");
        int inputB = 200;
        //boolean isA = Character.isDigit(inputA);//

        if(((inputA & inputB) >= 0) || ((inputA & inputB) < 0)){
            if(inputA > inputB){
                System.out.println("Your second input is smaller");
            }
            else if (inputB > inputA) {
                System.out.println("Your first input is smaller");
            }
            else if (inputB == inputA) {
                System.out.println("Your inputs are equal");
            }
            }
            else {
                System.out.println("Please enter a valid digit");
            }


        }
    }
