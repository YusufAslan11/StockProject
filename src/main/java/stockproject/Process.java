package stockproject;

import java.util.*;

public class Process {

    static Scanner input = new Scanner(System.in);
    static HashMap<Integer, Product> productlist = new HashMap<>();
    static int quantity = 0;  //Miktara static olarak "0" değerini dışarda verdik, diğer türlü
                             // hher metod çalıştığında miktar sıfırlanıyor.
    static String shelf = "-"; //Ekleme yapana kadar değere "-" verdik task de istendiği gibi

    public void productDescribe() {

        System.out.print("Enter a product name...:");
        String prdName = input.next();

        System.out.print("Enter a producer name..:");
        String producerName = input.next();

        System.out.print("Enter unit for product..:");
        String unit = input.next();

        Product newProduct = new Product(prdName, producerName, quantity, unit, shelf);
        //Kullanıcıdan aldığımız dataları, constructor  kullanarak  newProduct objesi oluşturduk

        productlist.put(newProduct.getId(), newProduct);
        //Oluşan objeyi put(); methodu kullanarak Value değerine Id yi de alarak Key değerine atadık.
    }

    public void productList() {

        Set<Map.Entry<Integer, Product>> ProductSet = productlist.entrySet();
        //MAP ler for each ile çalışmadığından "entrySet();" methpdu kullanarak Map i Setin içine assign ederiz
        //Set yapısı Set <Map.Entry(K ,V )name dir.
        System.out.println( "Id    Product        Producer          Unit          Quantity          Shelf     ");
        System.out.println("----------------------------------------------------------------------------------");
        for (Map.Entry<Integer, Product> products : ProductSet) {

            //for each ile oluşturduğumuz setimizde bulunan listedeki tüm data ları get() metodu ile
            //alıp yazdırdık

            Integer key = products.getKey();
            System.out.printf( "%-5d %-15s %-17s %-15s %-15d %-10s\n",
                    key,    productlist.get(key).getProductName(),
                            productlist.get(key).getProducer(),
                            productlist.get(key).getUnit(),
                            productlist.get(key).getQuantity(),
                            productlist.get(key).getShelf(),
                            productlist.get(key).getId());
        };
    }
}