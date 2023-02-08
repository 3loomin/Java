package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discoundPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discoundPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discoundPrice = discoundPrice;
    }

    public int calculatePrice(){
        return itemPrice - discoundPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscoundPrice() {
        return discoundPrice;
    }

    public void setDiscoundPrice(int discoundPrice) {
        this.discoundPrice = discoundPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discoundPrice=" + discoundPrice +
                '}';
    }
}
