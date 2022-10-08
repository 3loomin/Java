package hw02;

public class Taxi {
    String taxiCompany;
    int money;
    int pasengerCount;

    public Taxi(String taxicompany){
        this.taxiCompany = taxicompany;
    }
    public void take(int money){
        this.money += money;
        pasengerCount++;
    }

    public void showTaxiInfo(){
        System.out.println(taxiCompany + "수입은 " + money + "원입니다.");
    }
}
