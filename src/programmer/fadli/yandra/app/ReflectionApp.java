package programmer.fadli.yandra.app;

import programmer.fadli.yandra.data.CreateUserRequest;
import programmer.fadli.yandra.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("eko");
        request.setPassword("eko");
        request.setName("eko");

        ValidationUtil.validationReflectin(request);
    }
}
