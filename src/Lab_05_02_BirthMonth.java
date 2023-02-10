public class Lab_05_02_BirthMonth {
    public static void main(String[] args) {
          System.out.println("Please enter your birth month");
          int monthNum = -190;
          if (monthNum > 0 && monthNum <13){
              System.out.println("Your birth month is: " + monthNum);

          }
          else {
              System.out.println("You entered an incorrect month value: " + monthNum);

          }
    }
}
