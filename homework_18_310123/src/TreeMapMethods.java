import java.util.*;

public class TreeMapMethods {
    //1. Write a Java program to associate the specified value with the specified key in a Tree Map.
    public static void putKeyValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        for (Map.Entry element : treeMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }

    //2. Write a Java program to copy a Tree Map content to another Tree Map.
    public static void copyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        Map<Integer, String> treeMap2 = new TreeMap<Integer, String>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        System.out.println("Values in first map: " + treeMap);
        treeMap2.put(4, "White");
        treeMap2.put(5, "Blue");
        treeMap2.put(6, "Orange");
        System.out.println("Values in second map: " + treeMap2);
        treeMap2.putAll(treeMap);
        System.out.println("Now values in second map: " + treeMap2);
    }

    //3. Write a Java program to search a key in a Tree Map.
    public static void containsKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("The Tree Map contains key '4': " + treeMap.containsKey(4));
    }

    //4. Write a Java program to search a value in a Tree Map.
    public static void containsValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("The Tree Map contains value 'Red': " + treeMap.containsValue("Red"));
    }

    //5. Write a Java program to get all keys from the given a Tree Map.
    public static void getAllKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("Key set values are: " + treeMap.keySet());
    }

    //6. Write a Java program to delete all elements from a given Tree Map.
    public static void clearTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("Orginal TreeMap content: " + treeMap);
        treeMap.clear();
        System.out.println("The New map: " + treeMap);
    }

    //7. Write a Java program to sort keys in Tree Map by using comparator.
    public static void sortKeyTreeMap() {
        Map<String, String> tree_map1 = new TreeMap<String, String>(new SortKey());
        // Put elements to the map
        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White");
        System.out.println(tree_map1);
    }

    //8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
    public static void getGreatestLeastKeyValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Greatest key: " + ((TreeMap<Integer, String>) treeMap).firstEntry());
        System.out.println("Least key: " + ((TreeMap<Integer, String>) treeMap).lastEntry());
    }

    //9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
    public static void getFirstLastKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Greatest key: " + ((TreeMap<Integer, String>) treeMap).firstKey());
        System.out.println("Least key: " + ((TreeMap<Integer, String>) treeMap).lastKey());
    }

    //10. Write a Java program to get a reverse order view of the keys contained in a given map.
    public static void reverseKeySetTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Yellow");
        treeMap.put(1, "White");
        treeMap.put(2, "Black");
        treeMap.put(6, "Purple");
        treeMap.put(3, "Red");
        treeMap.put(4, "Green");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Reverse order view of the keys: " + ((TreeMap<Integer, String>) treeMap).descendingKeySet());
    }

    //11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
    public static void getLowerHigherKeyValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + ((TreeMap<Integer, String>) treeMap).floorEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + ((TreeMap<Integer, String>) treeMap).higherEntry(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + ((TreeMap<Integer, String>) treeMap).floorEntry(70));
    }

    //12. Write a Java program to get the greatest key less than or equal to the given key.
    public static void getLowerHigherKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + ((TreeMap<Integer, String>) treeMap).floorKey(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + ((TreeMap<Integer, String>) treeMap).higherKey(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + ((TreeMap<Integer, String>) treeMap).floorKey(70));
    }

    //13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
    public static void getLowerKeySetTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).headMap(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).headMap(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).headMap(70));
    }

    //14. Write a Java program to get the portion of this map whose keys are less than
// (or equal to, if inclusive is true) a given key.
    public static void getEqualLowerKeySetTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).headMap(10, true));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).headMap(20, true));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).headMap(70, true));
    }

    //15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
    public static void getGreaterKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).higherEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).higherEntry(20));
        System.out.println("Checking the entry for 60: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).higherEntry(60));
    }

    //16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key.
    public static void getLowerKeyValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).lowerEntry(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).lowerEntry(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).lowerEntry(70));
    }

    //17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
    public static void getLowerKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).lowerKey(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).lowerKey(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + ((TreeMap<Integer, String>) treeMap).lowerKey(70));
    }

    //18. Write a Java program to get NavigableSet view of the keys contained in a map.
    public static void getNavigableSetTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Orginal TreeMap content: " + treeMap);
        System.out.println("Orginal TreeMap content: " + ((TreeMap<Integer, String>) treeMap).navigableKeySet());
    }

    //19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
    public static void removeGetLeastKeyValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Value before poll: " + treeMap);
        System.out.println("Value returned: " + ((TreeMap<Integer, String>) treeMap).pollFirstEntry());
        System.out.println("Value after poll: " + treeMap);
    }

    //20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
    public static void removeGetHigherKeyValueTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Value before poll: " + treeMap);
        System.out.println("Value returned: " + ((TreeMap<Integer, String>) treeMap).pollLastEntry());
        System.out.println("Value after poll: " + treeMap);
    }

    //21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive),
// to another key (exclusive).
    public static void subMapTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Sub map key-values: " + ((TreeMap<Integer, String>) treeMap).subMap(20, 50));
    }

    //22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
    public static void subMapInclusiveTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Sub map key-values: " + ((TreeMap<Integer, String>) treeMap).subMap(20, true, 50, true));
    }

    //23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    public static void tailMapTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Keys are greater than or equal to 20: " + ((TreeMap<Integer, String>) treeMap).tailMap(20));
    }

    //24. Write a Java program to get a portion of a map whose keys are greater than to a given key.
    public static void tailMapExclusiveTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Keys are greater than 20: " + ((TreeMap<Integer, String>) treeMap).tailMap(20, false));
    }

    //25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key.
    public static void ceilingEntryTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Keys greater than or equal to 20: " + ((TreeMap<Integer, String>) treeMap).ceilingEntry(20));
        System.out.println("Keys greater than or equal to 30: " + ((TreeMap<Integer, String>) treeMap).ceilingEntry(30));
        System.out.println("Keys greater than or equal to 50: " + ((TreeMap<Integer, String>) treeMap).ceilingEntry(50));
    }

    //26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    public static void ceilingKeyTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.println("Keys greater than or equal to 20: " + ((TreeMap<Integer, String>) treeMap).ceilingKey(20));
        System.out.println("Keys greater than or equal to 30: " + ((TreeMap<Integer, String>) treeMap).ceilingKey(30));
        System.out.println("Keys greater than or equal to 50: " + ((TreeMap<Integer, String>) treeMap).ceilingKey(50));
        System.out.println("Keys greater than or equal to 70: " + ((TreeMap<Integer, String>) treeMap).ceilingKey(70));
    }
}

class SortKey implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
