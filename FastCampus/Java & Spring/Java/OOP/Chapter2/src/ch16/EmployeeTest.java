package ch16;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setEmployeeName("이순신");
        System.out.println(Employee.getSerialNum());

        Employee employee1 = new Employee();
        employee1.setEmployeeName("김유신");


        System.out.println(employee.getEmployeeName() + "님의 사번은" + employee.getEmployeeId());
        System.out.println(employee1.getEmployeeName() + "님의 사번은" + employee1.getEmployeeId());

        //두개의 인스턴스가 하나의 메모리를 공유한다
    }
}
