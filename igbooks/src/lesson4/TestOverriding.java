package lesson4;

public class TestOverriding {
    public static void main(String[] args) {
        Employee emp = new Employee(121, "Ron", "111-11-1111", 5000);
        Manager manager = new Manager(151, "Tom", "444-44-4444", 8000, "admin");

        System.out.println(emp.getAllDetails());
        System.out.println(manager.getAllDetails());

    }


}
