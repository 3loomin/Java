public class MyHashTest {
    public static void main(String[] args) {
       // MyHash mainObject = new MyHash(20);

        //ChainingHash mainObject = new ChainingHash(20);
        LinearProbingHash mainObject = new LinearProbingHash(20);
        mainObject.saveData("DaveLee","010222233333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.saveData("David" , "01044445555");
        mainObject.saveData("Dave" , "01046557777");
        //Collision
        System.out.println(mainObject.getData("DaveLee"));
    }
}
