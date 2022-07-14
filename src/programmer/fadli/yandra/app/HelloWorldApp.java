package programmer.fadli.yandra.app;

import programmer.fadli.yandra.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hallo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hallo " + name);
            }
        };
        english.sayHello();
        english.sayHello("Eko");

        indonesia.sayHello();
        indonesia.sayHello("Eko");


    }
}
