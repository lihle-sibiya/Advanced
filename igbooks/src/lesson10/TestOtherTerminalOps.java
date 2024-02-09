package lesson10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestOtherTerminalOps {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        System.out.println("Executive count:");
        long execCount =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .count();

        System.out.println("Number of executives are " + execCount);


        System.out.println("\n == Highest paid executive");
        Optional highestExec =
                eList.stream()
                        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                        .max(Employee::sortBySalary);

        if (highestExec.isPresent()) {
            Employee temp = (Employee) highestExec.get();
            System.out.printf(
                    "\nName: " + temp.getGivenName() + "\nSurname: " + temp.getSurName()+ "\nSalary: $%,6.2f %n ", temp.getSalary());

            System.out.println("\n== Lowest Paid Staff ==");
            Optional lowestStaff =
                    eList.stream()
                            .filter(e -> e.getRole().equals(Role.STAFF))
                            .min(Comparator.comparingDouble(e -> e.getSalary()));

            if (lowestStaff.isPresent()){
                Employee temp2 = (Employee) lowestStaff.get();
                System.out.printf("Name: " + temp2.getGivenName()
                        + " " + temp.getSurName() +
                        "   Salary: $%,6.2f %n ", temp.getSalary());
            }

        }




    }
}
