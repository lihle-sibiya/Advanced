package lesson10;

import java.util.List;
import java.util.OptionalDouble;

public class TestAverage {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("\n== Average bonus paid to CO Executives ==");

        OptionalDouble result2 = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .peek(e -> System.out.print("Name: " + e.getGivenName() + " Surname: " + e.getSurName()))
                .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
                .peek(e -> System.out.printf("Bonus : $%,6.2f %n", e))
                .average();
        System.out.printf("Average bonuses paid: $%,6.2f %n", result2.getAsDouble());

    }
}
