package programmer.fadli.yandra.app;

import programmer.fadli.yandra.data.Appliction;
import static programmer.fadli.yandra.data.Constant.*;

import programmer.fadli.yandra.data.Constant;
import programmer.fadli.yandra.data.Country;
import programmer.fadli.yandra.util.MathUtil;

import static programmer.fadli.yandra.data.Constant.VERSION;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(VERSION);


        System.out.println(
                MathUtil.sum(2,2,2,2,2)
        );
        Country.City city = new Country.City();

        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(Appliction.PROCESSOR);
    }
}
