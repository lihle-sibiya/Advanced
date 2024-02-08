package lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H001", "Duke Hat");

        System.out.println(partList);

        partList.put("S002", "Black T-shirt");
        System.out.println(partList);

        Set<String> keys = partList.keySet();

        for(String k :keys){
            System.out.println(partList.get(k));
        }
    }
}
