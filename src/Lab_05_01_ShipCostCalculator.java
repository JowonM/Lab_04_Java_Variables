public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args) {
        // 3 doubles that are used to show the total price, shipping + tax, and the price that is inputed//
        double total;
        double ship = 1.02;
        double price = 1092;
        //an if statement that is used to output the price //

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


