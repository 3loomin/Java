package ch19;

import java.lang.reflect.WildcardType;

public class CoffeTest {
    public static void main(String[] args){
        Coffee etiopiaCoffee = new EtiopiaAmericano();
        etiopiaCoffee.brewing();

        System.out.println();
        Coffee etiopiaLatte = new Latte(etiopiaCoffee);
        etiopiaLatte.brewing();

        System.out.println();
        Coffee etiopiaMocha = new Mocha(new Latte( new EtiopiaAmericano()));
        etiopiaMocha.brewing();

        System.out.println();

        Coffee kenyaCoffee = new WhippingCream(new Mocha( new Latte (new KenyaAmericano())));
        kenyaCoffee.brewing();


    }


}
