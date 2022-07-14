package programmer.fadli.yandra.app;

import programmer.fadli.yandra.data.Data;
import programmer.fadli.yandra.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30000000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();


    }
}
