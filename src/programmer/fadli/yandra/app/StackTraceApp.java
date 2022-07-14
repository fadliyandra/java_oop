package programmer.fadli.yandra.app;

public class StackTraceApp {

    public static void main(String[] args) {
        try {
            String[] names = {
                    "eko","fadli","yandra"
            };
            System.out.println(names[100]);
        }catch (Throwable throwable){
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }
}
