package programmer.fadli.yandra.data;

public class Avanza implements Car{

    public void drive(){
        System.out.println("Avanza drive");

    }

    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }
    public boolean isMaintenance(){
        return false;
    }

}
