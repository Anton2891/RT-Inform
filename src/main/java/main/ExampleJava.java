package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleJava {

    static void javaMethod(int[] arr) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int count;
        int test = 0;
        for (int i : arr) {
            if (!map.containsKey(String.valueOf(i))) {
                count = 0;
                for (int j : arr) {
                    if (i == j) {
                        count++;
                    }
                }
                map.put(String.valueOf(i), count);
                System.out.println(test++);
            }
        }
        System.out.println("Java: " + map);
    }
}
