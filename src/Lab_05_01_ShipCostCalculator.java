public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args) {
        double total;
        double ship = 1.02;
        double price = 1092;

        if (price < 100)
        {
            System.out.println("Your total cost will be: " + price);
        }
        else
        {
            total = price * ship;
            System.out.println("Your total cost will be: " + total);

        }

    }
}


