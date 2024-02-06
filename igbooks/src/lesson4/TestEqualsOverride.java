package lesson4;

public class TestEqualsOverride {
    public static void main(String[] args) {
        Employee emp1 = new Employee(121, "Ron", "111-11-1111", 5000);
        Employee emp2 = new Employee(121, "Ron", "111-11-1111", 5000);

        System.out.println(emp1.equals(emp2));
        System.out.println("#####################################");
        emp2 = emp1;
        System.out.println(emp1.equals(emp2));
    }

}
