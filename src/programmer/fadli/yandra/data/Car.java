package programmer.fadli.yandra.data;

import programmer.fadli.yandra.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"aplication", "java"})
public interface Car extends HasBrand, IsMaintenance{

    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    }

}
