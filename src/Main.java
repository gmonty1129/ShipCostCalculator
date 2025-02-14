import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.println("Please enter the price of your item in USD: ");
        if(in.hasNextDouble())
        {
            itemCost = in.nextDouble();
            in.nextLine();
            if(itemCost <= 100)
            {
                shipCost = itemCost * SHIP_RATE;
            }
            totalCost = itemCost + shipCost;
            System.out.println("Your shipping cost is $" + shipCost);
            System.out.println("Your total cost is $" + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid Item Price: " + trash);
            System.exit(0);
        }
    }
}