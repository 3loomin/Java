package ch09;

public class SubjectTest {
    public static void main(String[] args){
        Student student1 = new Student(12345, "Lee");
        student1.setKorea("국어", 100);
        student1.setMath("수학", 90);
        student1.showScoreInfo();

        Student student2 = new Student(12346, "Kim");
        student2.setKorea("국어", 50);
        student2.setMath("수학", 65);
        student2.showScoreInfo();




    }
}
