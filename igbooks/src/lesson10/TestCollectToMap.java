package lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollectToMap {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        Map<String,String> gMap = new HashMap<>();

        gMap = eList.stream()
                .collect(Collectors.toMap(Employee::getEmail, Employee::getDept));

        gMap.forEach((k,v) -> System.out.println("Email: " + k + " Department: " + v));


    }
}
