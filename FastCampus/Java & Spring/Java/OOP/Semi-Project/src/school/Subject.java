package school;

import util.Define;

import java.util.ArrayList;

public class Subject {
    private int subejectId;
    private String subjectName;
    private int gradeType;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subejectId){
        this.subejectId = subejectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE;
    }

    public void register(Student student){
        studentList.add(student);
    }

    public int getSubejectId() {
        return subejectId;
    }

    public void setSubejectId(int subejectId) {
        this.subejectId = subejectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}
