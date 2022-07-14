package programmer.fadli.yandra.data;

public class Appliction {
    public static final int PROCESSOR;
    static {
        System.out.println("mengakases class Application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
