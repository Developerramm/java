package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    public static void main(String[] args) {
        System.out.println("HashMap Basic tutorial here ");
        Map<String,String> mapping = new HashMap<>();
        mapping.put("in","India");
        mapping.put("in","Bihar");
        mapping.put("en" , "England");
        mapping.put("us","United Stated");
        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("br","Brazil");
        System.out.println(table);

        table.putAll(mapping);
        System.out.println(table);

        table.remove("en");
        System.out.println(table);
        System.out.println(table.size());

        table.clear();
        System.out.println(table.size());

        table.putIfAbsent("in","India3");
        System.out.println(table);

        System.out.println(mapping.get("in"));

        System.out.println(mapping.getOrDefault("Br","Null"));
        System.out.println(table.containsKey("in"));
        System.out.println(table.containsKey("Br"));
        System.out.println(table.containsValue("India3"));

        Set<String> st = mapping.keySet();
        System.out.println(st);

    }
}
