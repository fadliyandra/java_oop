package programmer.fadli.yandra.app;

import programmer.fadli.yandra.annotation.Fancy;
import programmer.fadli.yandra.data.Animal;
import programmer.fadli.yandra.data.Cat;

@Fancy(name = "AnimalApp", tags = {"aplication", "java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Tom";
        animal.run();

    }
}
