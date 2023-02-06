public class Lab_04_03_MonthyCCBalance {
    public static void main(String[] args) {
        double startingBal = 5000.00;
        double intRate = 1.17;
        int count = 2;
        double bal;
        double intTotal;

        while(count>0){
            bal = (startingBal*intRate);
            intTotal = bal-startingBal;
            count--;
            System.out.println("These are the two interest totals (not including your balance): "+ intTotal);
            startingBal = bal;

        }

    }
}
