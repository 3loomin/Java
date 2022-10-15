package ch08;


import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직여요");
    }
    public void eating(){

    }
}

class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다");
    }
}

class Tiger extends Animal{

    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class Eager extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 날아 다닙니다");
    }
    public void flying(){
        System.out.println("동수리가 양날개를 쭉 펴고 날아다닙니다");
    }

}

public class AnimalTest {
    public static void main(String[] args){
        Animal hanimal = new Human();
        Animal tanimal = new Tiger();
        Animal eanimal = new Eager();

       AnimalTest test = new AnimalTest();
//        test.moveAnimal(hanimal);
//        test.moveAnimal(tanimal);
//        test.moveAnimal(eanimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hanimal);
        animalList.add(tanimal);
        animalList.add(eanimal);

        for(Animal animal : animalList){
            animal.move();
        }
        test.testDownCasting(animalList);

    }

    public void testDownCasting(ArrayList<Animal> list){
        for(int i = 0; i< list.size(); i++){

            Animal animal = list.get(i);

            if(animal instanceof Human){
                Human human = (Human)animal;
                human.readBook();
            }
            else if(animal instanceof Tiger){
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if(animal instanceof Eager){
                Eager eager = (Eager) animal;
                eager.flying();
            }
            else{
                System.out.println("unsuppoerted type");
            }


        }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
