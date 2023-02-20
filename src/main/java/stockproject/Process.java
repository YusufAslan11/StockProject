package stockproject;

import java.util.*;

public class Process {

    static Scanner input = new Scanner(System.in);
    static Map<Integer, Product> productlist = new HashMap<>();
    static int quantity = 0;
    static String shelf = "-";

    public void productDescribe() {

        System.out.print("Enter a product name...:");
        String prdName = input.next();

        System.out.print("Enter a producer name..:");
        String producerName = input.next();

        System.out.print("Enter unit for product..:");
        String unit = input.next();

        Product newProduct = new Product(prdName, producerName, quantity, unit, shelf);

        productlist.put(newProduct.getId(), newProduct);

    }
    public void productList() {

        Set<Map.Entry<Integer, Product>> productSet = productlist.entrySet();

        System.out.println("Id    Product        Producer          Unit          Quantity          Shelf     ");
        System.out.println("----------------------------------------------------------------------------------");
        for (Map.Entry<Integer, Product> products : productSet) {

            Integer key = products.getKey();
            System.out.printf("%-5d %-15s %-17s %-15s %-15d %-10s\n",
                    key, productlist.get(key).getProductName(),
                    productlist.get(key).getProducer(),
                    productlist.get(key).getUnit(),
                    productlist.get(key).getQuantity(),
                    productlist.get(key).getShelf(),
                    productlist.get(key).getId());
        }
    }
    public void addProductQuantity() {

        System.out.print("Enter Id to add product quantity...: ");
        int findId = input.nextInt();

        if (productlist.keySet().contains(findId)) {

            System.out.print("Enter the amount of product to add:");
            int newQuantity = input.nextInt();

            productlist.get(findId).
                    setQuantity(newQuantity + (productlist.
                            get(findId).getQuantity()));

            System.out.println("The product quantity updated!!!");
            Process met = new Process();
            met.productList();

        } else {
            System.out.println("This Id can not find in the product list ");
            System.out.println("Do you want to define new product    ('Y'/'N')  ");
            String doYouWantAdd;
            do {
                doYouWantAdd = input.next().substring(0, 1).toUpperCase();

                switch (doYouWantAdd) {
                    case "Y":
                        Process met = new Process();
                        met.productDescribe();
                        break;
                    case "N":
                        System.out.println("EXIT");
                        break;
                    default:
                        System.out.print("Please enter only   'Y' or 'N'   ");
                }
            } while (!doYouWantAdd.equalsIgnoreCase("N"));
        }
    }
    public void reduceProductQuantity() {
        System.out.print("Enter Id to reduce product quantity...: ");
        int findId = input.nextInt();

        if (productlist.keySet().contains(findId)) {
            System.out.print("Enter the amount of product to be reduced...:");
            int newQuantity = input.nextInt();

            if (newQuantity > productlist.get(findId).getQuantity()) {
                System.out.println("There is not stock enough..");
                System.out.println("Amount of Stock only, " +
                        productlist.get(findId).getQuantity() +
                        productlist.get(findId).getUnit());

            } else {
                productlist.get(findId).setQuantity((productlist.get(findId).getQuantity())-newQuantity);
                System.out.println("The product quantity updated"); }
                Process met = new Process();
                met.productList();

        } else {
            System.out.println("There is not product in the stock");}

    }

    public void putOnTheShelf(){
        System.out.print ("Enter the product Id to be placed on the shelf...: ");
        int findId = input.nextInt();
        if (productlist.keySet().contains(findId)) {
            System.out.println("Enter a shelf...");
            String newShelf=input.next();

            productlist.get(findId).setShelf(newShelf);

        }else{
            System.out.println("There is no product in the product list");
        }
    }
}