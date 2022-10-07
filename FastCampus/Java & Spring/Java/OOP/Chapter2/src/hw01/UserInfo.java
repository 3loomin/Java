package hw01;

public class UserInfo {

    public int userHeight;
    public int userWeight;
    public String userGender;
    public String userName;
    public int userAge;

    public String getUserInfo(){
        return "키가 " + userHeight + "이고 몸무게가" + userWeight + "킬로인 " + userGender + "이 있습니다. 이름은 " + userName + "이고 나이는 "+ userAge + "세입니다.";
    }

}
