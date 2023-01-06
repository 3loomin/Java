public class MyHashTest {
    public static void main(String[] args) {
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("DaveLee","010222233333");
        mainObject.saveData("fun-coding", "01033334444");
        System.out.println(mainObject.getData("DaveLee"));
    }
}
