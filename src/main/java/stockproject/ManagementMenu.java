package stockproject;

import java.util.Scanner;
public class ManagementMenu {
    static Scanner input=new Scanner(System.in);
    public static void start() {
        Process met = new Process();
        String select;
        do {
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("▓▓▓▓▓▓   WAREHOUSE MANAGEMENT MENU   ▓▓▓▓▓▓");
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("▓▓▓     1- Product Describe             ▓▓▓");
            System.out.println("▓▓▓     2- Product List                 ▓▓▓");
            System.out.println("▓▓▓     3- Stock Entry Process          ▓▓▓");
            System.out.println("▓▓▓     4- Stock Reduce Process         ▓▓▓");
            System.out.println("▓▓▓     5- Stock Shelf Process          ▓▓▓");
            System.out.println("▓▓▓     Q- Exit                         ▓▓▓");
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.print("          Your Choose....:  ");

            select = input.next().toUpperCase();

            switch (select) {
                case "1":
                    met.productDescribe();
                    break;
                case "2":
                    met.productList();
                    break;
                case "3":
                    met.addProductQuantity();
                    break;
                case "4":
                    met.reduceProductQuantity();
                    break;
                case "5":
                    met.putOnTheShelf();
                    break;
                case "Q":
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("You made mistake!!! Please try again....");
            }
        } while (!select.equalsIgnoreCase("Q"));
    }

}
