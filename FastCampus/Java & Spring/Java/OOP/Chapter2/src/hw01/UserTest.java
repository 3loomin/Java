package hw01;

public class UserTest {

   public static void main(String[] args){

       UserInfo userInfo = new UserInfo();
       userInfo.userHeight = 180;
       userInfo.userWeight = 78;
       userInfo.userGender = "남성";
       userInfo.userName = "Tomas";
       userInfo.userAge = 37;

       System.out.println(userInfo.getUserInfo());
   }
}
