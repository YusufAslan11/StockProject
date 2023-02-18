package stockproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WarehouseRunner {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

         start();

    }

    public static void start() {
        Process met=new Process();
        int select=-1;
        do {
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("▓▓▓▓▓▓   WAREHOUSE MANAGEMENT MENU   ▓▓▓▓▓▓");
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.println("▓▓▓     1- Product Describe             ▓▓▓");
            System.out.println("▓▓▓     2- Product List                 ▓▓▓");
            System.out.println("▓▓▓     3- Stock Entry Process          ▓▓▓");
            System.out.println("▓▓▓     4- Product Add                  ▓▓▓");
            System.out.println("▓▓▓     5- Stock Exit Process           ▓▓▓ ");
            System.out.println("▓▓▓     0- Exit                         ▓▓▓");
            System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
            System.out.print(  "          Your Choose....:  "  );

            try {
                select = input.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Please use only digit");
            }
            switch (select) {
                case 1:
                    met.productDescribe();
                    break;
                case 2:
                    met.productList();
                    break;
                case 3:
                    //Stok çıkış işlemleri
                    break;
                case 4:
                    //Stok çıkış işlemleri
                    break;

                case 0:
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("You made mistake!!! Please try again....");
            }
        } while (select != 0);
    }
}