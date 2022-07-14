package programmer.fadli.yandra;

import programmer.fadli.yandra.data.Customers;
import programmer.fadli.yandra.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.setName("Eko");
        customers.setLevel(Level.PREMIUM);

        System.out.println(customers.getName());
        System.out.println(customers.getLevel());
        System.out.println(customers.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for (var value : Level.values()){
            System.out.println(value);
        }


    }
}
