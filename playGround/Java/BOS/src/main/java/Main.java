import java.io.IOException;
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

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n  = sc.nextLine();
//        int nn = Integer.parseInt(n);
//        int count = 0;
//
//        String arr[] = sc.nextLine().split(" ");
//        String ans = sc.nextLine();
//        for(int i = 0; i < nn; i++){
//            if(arr[i].equals(ans)){
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String arr[] = sc.nextLine().split(" ");
//        int count = 0;
//        if(arr.length > 0){
//            if(arr[0].equals("")){
//                for(int i = 1;  i <arr.length; i++){
//                    count++;
//                }
//            }
//            else{
//                for(int i = 0;  i <arr.length; i++){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String arr[] = sc.nextLine().split(" ");
//        int a[] =  new int[2];
//        for(int i = 0; i < 2;  i++){
//            a[i]  = Integer.parseInt(arr[i]);
//        }
//        int res = (change(a[0]) > change(a[1])) ? change(a[0]) : change(a[1]);
//        System.out.println(res);
//
//    }
//    public static int change(int a){
//        int tmp = 0;
//        tmp = 100*(a%10) + 10*((a/10)%10) + a/100;
//        return tmp;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a[] = sc.nextLine().split("");
//        int res = 0;
//        for(int i = 0; i < a.length; i++){
//            switch (a[i]){
//                case "A" : case "B" : case "C" :
//                    res += 3;
//                    break;
//                case "D": case "E": case "F":
//                    res += 4;
//                    break;
//                case "G": case "H": case "I":
//                    res += 5;
//                    break;
//                case "J": case "K": case "L":
//                    res += 6;
//                    break;
//                case "M": case "N": case "O":
//                    res += 7;
//                    break;
//                case "P": case "Q": case "R" : case "S":
//                    res += 8;
//                    break;
//                case "T": case "U": case "V":
//                    res += 9;
//                    break;
//                case "X": case "Y": case "W": case "Z":
//                    res += 10;
//                    break;
//
//            }
//
//        }
//        System.out.println(res);
//
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        String s = sc.nextLine();
//
//
//        s = s.replaceAll("c=","h");
//        s = s.replaceAll("c-","h");
//        s = s.replaceAll("dz=","h");
//        s = s.replaceAll("d-","h");
//        s = s.replaceAll("lj","h");
//        s = s.replaceAll("nj","h");
//        s = s.replaceAll("s=","h");
//        s = s.replaceAll("z=","h");
//
//        System.out.println(s.length());
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String nn = sc.nextLine();
//        int n = Integer.parseInt(nn);
//
//        int count = 0;
//
//
//
//        for(int i = 0; i < n; i++){
//            String a[] = sc.nextLine().split("");
//            if(isGroup(a)){
//                count++;
//            }
//        }
//
//        System.out.println(count);
//
//
//    }
//    public static boolean isGroup(String a[]){
//        ArrayList<String> arr = new ArrayList<>();
//
//        for(int i = 1; i < a.length; i++){
//            if( !(a[i-1].equals(a[i])) ){
//
//                arr.add(a[i-1]);
//
//                if(arr.contains(a[i])){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int ans = sc.nextInt();
//        int n = sc.nextInt();
//
//        for(int i =0; i < n; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            sum+= a*b;
//        }
//        if(ans == sum){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//
//    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[31];


        for(int i = 0; i < 28; i++){
            int a = sc.nextInt();

            arr[a] = 1;
        }

        for(int i = 1; i <= 30; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }
    }

}
