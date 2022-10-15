package ch07;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(10010, "Tomas");
        Customer customerJ = new Customer(10010, "James");
        Customer customerE = new GoldCustomer(10010, "Edward");
        Customer customerP = new GoldCustomer(10010, "Percy");
        Customer customerK = new VIPCustomer(10010, "Kim");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);
        /*
        for(Customer customer : customerList){
            System.out.println(customer.showCumtomerInfo());
        }
        int price= 10000;
        for(Customer customer : customerList){

            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불 하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다");
        }
         */
        //VIPCustomer vc = (VIPCustomer)customerE; //컴파일 에러는 안남 대신에 exception 발생 GoldCustomer를 VIP로 받아줘서
        if(customerE instanceof GoldCustomer){
            GoldCustomer vc = (GoldCustomer)customerE;
            System.out.println(customerE.showCumtomerInfo());
        }

    }
}
