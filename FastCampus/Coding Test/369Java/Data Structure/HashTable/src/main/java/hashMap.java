import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "apple");
        hm1.put(2, "banana");
        hm1.put(3, "grape");


        HashMap<String, String> hm2 = new HashMap<>();

        hm2.put("DaveLee","010222233333");
        hm2.put("fun-coding", "01033334444");
        hm2.put("David" , "01044445555");
        hm2.put("Dave" , "01046557777");


        System.out.println(hm1.get(2));
        System.out.println(hm1.get(3));

        System.out.println(hm2.get("David"));

    }

}
