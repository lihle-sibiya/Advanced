package lesson10;

import java.util.List;
import java.util.Optional;

public class TestFindFirstAndOptional {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();

        Optional<Employee> result = eList.stream()
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .filter(e -> e.getState().equals("CO"))
                .findFirst();

        if (result.isPresent()) {
            result.get().print();
        }

    }
}
