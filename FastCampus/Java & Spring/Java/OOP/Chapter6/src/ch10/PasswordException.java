package ch10;
//Exception 대신 IllegalAccessException 써도 되지만, IllegalAccessException는 런타 exception이라 컴파일전에 에러확인을 못한다
public class PasswordException extends Exception{
    public PasswordException(String message){
        super(message) ;
    }
}
