package lesson10;

import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("\n== Sorting Surname ==");

        eList.stream()

                .sorted(Comparator.comparing(Employee::getSurName))
                .forEach(Employee::printSummary);

        //Reversed surname
        System.out.println("\n== Sorting Surname reversed ==");

        eList.stream()

                .sorted(Comparator.comparing(Employee::getSurName).reversed())
                .forEach(Employee::printSummary);

        System.out.println("\n== Sorting Surname within department ==");

        eList.stream()
                .sorted(Comparator.comparing(Employee::getDept)
                        .thenComparing(Employee::getSurName))
                .forEach(e -> System.out.println("Department: " + e.getDept() + " Surname: " + e.getSurName() + " Name " + e.getGivenName()));
    }
}
