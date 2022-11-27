package ch19;

public class Decorator extends Coffee{
    //decorator는 coffee 없이는 돌아갈 수 없기 때문에 묶어(?) 둔다
    Coffee coffee;
    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public void brewing() {
        coffee.brewing();
    }
}
