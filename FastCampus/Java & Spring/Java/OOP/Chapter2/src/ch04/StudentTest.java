package ch04;

public class StudentTest {
    public static void main(String[] args){

        Student studentLee = new Student();
        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 갱냄구";

        studentLee.getStudentInfo();

        Student Kim = new Student();
        Kim.studentId = 54321;
        Kim.studentName = "Kim";
        Kim.address = "갱기도 성남시";

        Kim.getStudentInfo();
    }
}
