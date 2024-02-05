package lesson3;

public class TestImmutability {
    public static void main(String[] args) {
        Employee emp = new Employee(121, "Ron", "ab123", 5000);
        System.out.println(emp.getName());

        System.out.println(emp.getSalary());

        emp.changeName("Lihle Sibiya");
        System.out.println(emp.getName());

        emp.raiseSalary(2000.00);
        System.out.println(emp.getSalary());


    }
}
