package lesson10;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollectCount {
    public static void main(String[] args) {
        List<Employee> eList = Employee.createShortList();
        Map<String, Long> gMap = new HashMap<>();

        gMap = eList.stream()
                .collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
        System.out.println("Number of employees per dept");
        gMap.forEach((k,v) -> System.out.println("Department: " + k + " " + v));




    }
}
