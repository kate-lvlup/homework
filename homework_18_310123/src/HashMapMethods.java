import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {
    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void putKeyValueHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        for (Map.Entry element : hashMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }

    //2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void sizeHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        System.out.println("Size of the hash map: " + hashMap.size());
    }

    //3. Write a Java program to copy all of the mappings from the specified map to another map.
    public static void copyHashMap() {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> hashMap2 = new HashMap<Integer, String>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        System.out.println("Values in first map: " + hashMap);
        hashMap2.put(4, "White");
        hashMap2.put(5, "Blue");
        hashMap2.put(6, "Orange");
        System.out.println("Values in second map: " + hashMap2);
        hashMap2.putAll(hashMap);
        System.out.println("Now values in second map: " + hashMap2);
    }

    //4. Write a Java program to remove all of the mappings from a map.
    public static void clearHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        hashMap.clear();
        System.out.println("The New map: " + hashMap);
    }

    //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static void isEmptyHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        System.out.println("Is hash map empty: " + hashMap.isEmpty());
        hashMap.clear();
        System.out.println("Is hash map empty: " + hashMap.isEmpty());
    }

    //6. Write a Java program to get a shallow copy of a HashMap instance.
    public static void cloneHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2 = (Map<Integer, String>) ((HashMap<Integer, String>) hashMap).clone();
        System.out.println("Cloned map: " + hashMap2);
    }

    //7. Write a Java program to test if a map contains a mapping for the specified key.
    public static void containsKeyHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        System.out.println("The Original map: " + hashMap);
        if (hashMap.containsKey(4)) {
            System.out.println(hashMap.get(4));
        }
    }

    //8. Write a Java program to test if a map contains a mapping for the specified value.
    public static void containsValueHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        System.out.println("The Original map: " + hashMap);
        System.out.println(hashMap.containsValue("Red"));
    }

    //9. Write a Java program to create a set view of the mappings contained in a map.
    public static void createSetHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        Set set = hashMap.entrySet();
        System.out.println("Set values: " + set);
    }

    //10. Write a Java program to get the value of a specified key in a map.
    public static void getValueHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        System.out.println(hashMap.get(3));
    }

    //11. Write a Java program to get a set view of the keys contained in this map.
    public static void getKeySetHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        Set keyset = hashMap.keySet();
        System.out.println("Key set values are: " + keyset);
    }

    //12. Write a Java program to get a collection view of the values contained in this map.
    public static void getValueSetHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Black");
        hashMap.put(3, "Red");
        hashMap.put(4, "Green");
        hashMap.put(5, "Yellow");
        hashMap.put(6, "Purple");
        System.out.println("Collection view is: " + hashMap.values());
    }
}
