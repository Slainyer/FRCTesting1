import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter your cost and totalSales");
        int cost = kbd.nextInt();
        int totalSales = kbd.nextInt();

        int profit = totalSales - cost;

        System.out.println(profit);

    
    }
}