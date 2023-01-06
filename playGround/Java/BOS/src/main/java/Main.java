import java.util.*;

public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        //System.out.println("PUT your ID: ");
//        String str = sc.nextLine();
//        System.out.println(str + "??!");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Integer years = sc.nextInt();
//        System.out.println(years - 543);
//    }
//public static void main(String[] args) {
//    Integer[] chess = {1,1,2,2,2,8} ;
//    Integer temp[] = new Integer[6];
//
//    Scanner sc = new Scanner(System.in);
//    for(int i = 0; i<6; i++){
//        temp[i] = sc.nextInt();
//    }
//
//    for(int i = 0; i<6; i++){
//        System.out.printf("%d ",chess[i] - temp[i]);
//    }
//
//
//}

//    public static void main(String[] args) {
//        String str = new String("         ,r'\"7\n" +
//                "r`-_   ,'  ,/\n" +
//                " \\. \". L_r'\n" +
//                "   `~\\/\n" +
//                "      |\n" +
//                "      |" );
//        System.out.printf(str);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Integer hour = sc.nextInt();
//        Integer min  = sc.nextInt();
//        Integer time = sc.nextInt();
//
//        Integer tmp = min + time;
//        if(tmp >= 60){
//            hour += tmp / 60;
//            if(hour >= 24) hour -= 24;
//            tmp = tmp % 60;
//            System.out.println(hour+ " "+ tmp);
//        } else {
//            System.out.println(hour+ " "+ tmp);
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int frequency[] = new int[3];
//        int max = 0, maxindex= 0, f = 0;
//        ArrayList<Integer> dice_list = new ArrayList<>();
//        for(int i = 0; i < 3; i++){
//            dice_list.add(sc.nextInt());
//        }
//        for(int i = 0; i < 3 ; i++){
//            frequency[i] = Collections.frequency(dice_list,dice_list.get(i));
//        }
//        max = frequency[0];
//
//        for(int i = 0; i < 3; i++){
//            if(max < frequency[i]){
//                max = frequency[i];
//                maxindex = i;
//            }
//        }
//
//        if( max == 2){
//            System.out.println(dice_list.get(maxindex)*100+1000);
//            return;
//        }
//
//        if(max == 3){
//            System.out.println(dice_list.get(maxindex)*1000 + 10000);
//            return;
//        }
//        if( maxindex == 0){
//            f = dice_list.get(0);
//            for(int i = 1; i < 3; i++){
//                if(f<dice_list.get(i)){
//                    f = dice_list.get(i);
//                }
//            }
//            System.out.println(f*100);
//        }


}
