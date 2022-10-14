package hw01;

public class VIPCustomer extends Customer {

    double salesRatio;

    private String agentId;

    public VIPCustomer(int customerId, String customreName){
        //super(); //안써줘도 컴파일러가 해줌! >> Customer()를 실행
        super(customerId, customreName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return price;
    }

    public String getAgentId(){
        return agentId;
    }
}
