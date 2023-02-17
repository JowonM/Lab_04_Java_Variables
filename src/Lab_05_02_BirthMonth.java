public class Lab_05_02_BirthMonth {
    public static void main(String[] args) {
        //prompt for user to input a valid month//
          System.out.println("Please enter your birth month");
          //a fake month number for testing since we are not using scanner objects//
          int monthNum = -190;
          // an if statement saying to make sure the number entered is a valid month//
          if (monthNum > 0 && monthNum <13){
              System.out.println("Your birth month is: " + monthNum);

          }
          else {
              // this is what is outputted if something is wrong//
              System.out.println("You entered an incorrect month value: " + monthNum);

          }
    }
}
