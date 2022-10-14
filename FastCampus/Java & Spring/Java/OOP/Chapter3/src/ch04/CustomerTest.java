package ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010,"이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCumtomerInfo() + price);


        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;

        price = customerKim.calcPrice(1000);

        System.out.println(customerKim.showCumtomerInfo() + price);

    }
}
