package lesson10;

import java.util.List;
import java.util.stream.Collectors;

public class TestCollectJoin {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        String deptList = eList.stream()
                .map(Employee::getDept)
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println("All departments");
        System.out.println(deptList);

    }
}
