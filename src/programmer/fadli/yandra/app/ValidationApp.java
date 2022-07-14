package programmer.fadli.yandra.app;

import programmer.fadli.yandra.data.LoginRequest;
import programmer.fadli.yandra.error.ValidationException;
import programmer.fadli.yandra.util.ValidationUtil;

public class ValidationApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "rahasia");

            try{
                ValidationUtil.validate(loginRequest);
                System.out.println("Data Valid");
            }catch (ValidationException exception){
                System.out.println("Data tidak valid : " + exception.getMessage());
            }

            LoginRequest loginRequest2 = new LoginRequest(null, null);
            ValidationUtil.validateRuntime(loginRequest2);

        System.out.println("Sukses");
    }
}
