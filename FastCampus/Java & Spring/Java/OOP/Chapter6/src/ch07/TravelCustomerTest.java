package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args){
        TravelCustomer customer1 = new TravelCustomer("Lee",40,100);
        TravelCustomer customer2 = new TravelCustomer("Kim",20,100);
        TravelCustomer customer3 = new TravelCustomer("Hong",13,50);

        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        System.out.println("Print customer List");
        customerList.stream().map(c-> c.getName()).forEach(s-> System.out.println(s));

        System.out.println("travel price");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("sorted name that older than 20 years old");
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));


    }
}
