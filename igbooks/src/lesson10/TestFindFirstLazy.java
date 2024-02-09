package lesson10;

import java.util.List;
import java.util.Optional;


public class TestFindFirstLazy {public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
    // eList.forEach(e -> e.printSummary());


//    eList.stream()
//            .peek(e -> System.out.println("Stream start"))
//            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
//            .peek(e -> System.out.println("Executives"))
//            .filter(e -> e.getState().equals("CO"))
//            .peek(e -> System.out.println("CO Executives"))
//            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
//            .forEach(s -> System.out.printf("Bonus paid: $%, 6.2f %n" , s));

//Lazy
    Employee tempEmp = new Employee.Builder().build();
    Optional<Employee> result = eList.stream()
            .peek(e -> System.out.println("Stream start"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> System.out.println("Executives"))
            .filter(e -> e.getState().equals("CO"))
            .peek(e -> System.out.println("CO Executives"))
            .findFirst();



}
}
