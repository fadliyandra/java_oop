package programmer.fadli.yandra.app;

import programmer.fadli.yandra.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {


    }
    public static void connectdDatabase(String username, String password){
        if (username == null|| password ==null){
            throw new DatabaseError("tidak bisa connenct ke data base");
        }
    }
}
