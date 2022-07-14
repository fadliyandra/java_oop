package programmer.fadli.yandra.data;

import programmer.fadli.yandra.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"aplication", "java"})
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;
    Level(String description){
        this.description= description;
    }
    public String getDescription(){
        return description;
    }
}
