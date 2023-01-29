import java.util.*;

public class HashSetMethods {
    //    Java Collection: HashSet Exercises [12 exercises with solution]
    //    1. Write a Java program to append the specified element to the end of a hash set.
    public static void appendElementHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("The Hash Set: " + hashSet);
    }

    //2. Write a Java program to iterate through all elements in a hash list.
    public static void iterateElementHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        // set Iterator
        Iterator<String> iterator = hashSet.iterator();
        // Iterate the hash set
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //3. Write a Java program to get the number of elements in a hash set.
    public static void getSizeHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        System.out.println("Size of the Hash Set: " + hashSet.size());
    }

    //4. Write a Java program to empty an hash set.
    public static void clearHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        hashSet.removeAll(hashSet);
        System.out.println("Hash Set after removing all the elements: " + hashSet);
    }

    //5. Write a Java program to test a hash set is empty or not.
    public static void isEmptyHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        System.out.println("Checking the above Hash Set is empty or not! " + hashSet.isEmpty());
        System.out.println("Remove all the elements from Hash Set: ");
        hashSet.removeAll(hashSet);
        System.out.println("Hash Set after removing all the elements: " + hashSet);
    }

    //6. Write a Java program to clone a hash set to another hash set.
    public static void cloneHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        Set<String> hashSet2 = new HashSet<>();
        hashSet2 = (Set<String>) ((HashSet<String>) hashSet).clone();
        System.out.println("Cloned Hash Set: " + hashSet2);
    }

    //7. Write a Java program to convert a hash set to an array.
    public static void convertToArrayHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        String[] array = hashSet.toArray(new String[hashSet.size()]);
        System.out.println("Array elements: ");
        for (String element : array) {
            System.out.println(element);
        }
    }

    //8. Write a Java program to convert a hash set to a tree set.
    public static void convertToTreeSetHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        hashSet = new TreeSet<>(hashSet);
        System.out.println("Converted Tree Set: " + hashSet);
    }

    //9. Write a Java program to convert a hash set to a List/ArrayList.
    public static void convertToArrayListHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        System.out.println("Original Hash Set: " + hashSet);
        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.println("Converted Array List: " + arrayList);
    }

    //10. Write a Java program to compare two hash set.
    public static void compareHashSet() {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        hashSet1.add("Pink");
        hashSet1.add("Yellow");
        System.out.println("Original Hash Set1: " + hashSet1);
        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Green");
        hashSet2.add("Yellow");
        System.out.println("Original Hash Set2: " + hashSet2);
        Set<String> hashSet3 = new HashSet<>();
        for (String str : hashSet1) {
            if (hashSet2.contains(str)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    //11. Write a Java program to compare two sets and retain elements which are same on both sets.
    public static void compareRetainElementHashSet() {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        hashSet1.add("Pink");
        hashSet1.add("Yellow");
        System.out.println("Original Hash Set1: " + hashSet1);
        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Green");
        hashSet2.add("Silver");
        hashSet2.add("Yellow");
        hashSet2.add("Gold");
        System.out.println("Original Hash Set2: " + hashSet2);
        hashSet1.retainAll(hashSet2);
        hashSet2.retainAll(hashSet1);
        System.out.println("Original Hash Set1: " + hashSet1);
        System.out.println("Original Hash Set2: " + hashSet2);
    }

    //12. Write a Java program to remove all of the elements from a hash set.
    public static void removeAllElementHashSet() {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        hashSet1.add("Pink");
        hashSet1.add("Yellow");
        System.out.println("Original Hash Set1: " + hashSet1);
        hashSet1.removeAll(hashSet1);
        System.out.println("Original Hash Set1: " + hashSet1);
    }
}
