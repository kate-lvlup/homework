import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethods {
    //    Java Collection: TreeSet Exercises [16 exercises with solution]
    //    1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    public static void createPrintTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
    }

    //2. Write a Java program to iterate through all elements in a tree set.
    public static void iterateElementTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //3. Write a Java program to add all the elements of a specified tree set to another tree set.
    public static void addTreeSetIntoTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("LightRed");
        treeSet2.add("LightGreen");
        treeSet2.add("LightBlack");
        treeSet2.add("LightWhite");
        treeSet2.add("LightPink");
        treeSet2.add("LightYellow");
        System.out.println("The Tree Set2: " + treeSet2);
        treeSet2.addAll(treeSet);
        System.out.println("Updated Tree Set2: " + treeSet2);
    }

    //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
    public static void reverseTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        Iterator<String> iterator = ((TreeSet<String>) treeSet).descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //5. Write a Java program to get the first and last elements in a tree set.
    public static void firstLastElementTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        String first = ((TreeSet<String>) treeSet).first();
        String last = ((TreeSet<String>) treeSet).last();
        System.out.println("First Element is: " + first);
        System.out.println("Last Element is: " + last);
    }

    //6. Write a Java program to clone a tree set list to another tree set.
    public static void cloneTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        Set<String> treeSet2 = new TreeSet<>();
        treeSet2 = (Set<String>) ((TreeSet<String>) treeSet).clone();
        System.out.println("The Tree Set2: " + treeSet2);
    }

    //7. Write a Java program to get the number of elements in a tree set.
    public static void sizeTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        System.out.println("Size of the tree set: " + treeSet.size());
    }

    //8. Write a Java program to compare two tree sets.
    public static void compareTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Red");
        treeSet2.add("Pink");
        treeSet2.add("Yellow");
        System.out.println("The Tree Set2: " + treeSet2);
        for (String str : treeSet) {
            if (treeSet2.contains(str)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    //9. Write a Java program to find the numbers less than 7 in a tree set.
    public static void findNumTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(11);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(44);
        treeSet.add(28);
        treeSet.add(16);
        treeSet.add(-5);
        System.out.println("The Tree Set: " + treeSet);
        Set<Integer> treeSet2 = new TreeSet<>();
        treeSet2 = ((TreeSet<Integer>) treeSet).headSet(7);
        Iterator iterator = treeSet2.iterator();
        System.out.println("The Tree Set2: " + treeSet2);
    }

    //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
    public static void getGreaterElementTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(22);
        treeSet.add(36);
        treeSet.add(25);
        treeSet.add(16);
        treeSet.add(29);
        treeSet.add(70);
        treeSet.add(82);
        treeSet.add(101);
        treeSet.add(89);
        treeSet.add(14);
        System.out.println("The Tree Set: " + treeSet);
        System.out.println("Greater than or equal to 86 : " + ((TreeSet<Integer>) treeSet).ceiling(86));
        System.out.println("Greater than or equal to 29 : " + ((TreeSet<Integer>) treeSet).ceiling(29));
    }

    //11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
    public static void getSmallerElementTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(22);
        treeSet.add(36);
        treeSet.add(25);
        treeSet.add(16);
        treeSet.add(29);
        treeSet.add(70);
        treeSet.add(82);
        treeSet.add(101);
        treeSet.add(89);
        treeSet.add(14);
        System.out.println("The Tree Set: " + treeSet);
        System.out.println("Smaller than or equal to 86 : " + ((TreeSet<Integer>) treeSet).floor(86));
        System.out.println("Smaller than or equal to 29 : " + ((TreeSet<Integer>) treeSet).floor(29));
    }

    //12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
    public static void getStrictlyGreaterElementTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(22);
        treeSet.add(36);
        treeSet.add(25);
        treeSet.add(16);
        treeSet.add(29);
        treeSet.add(70);
        treeSet.add(82);
        treeSet.add(101);
        treeSet.add(89);
        treeSet.add(14);
        System.out.println("The Tree Set: " + treeSet);
        System.out.println("Strictly greater than 76 : " + ((TreeSet<Integer>) treeSet).higher(76));
        System.out.println("Strictly greater than 31 : " + ((TreeSet<Integer>) treeSet).higher(31));
    }

    //13. Write a Java program to get an element in a tree set which is strictly less than the given element.
    public static void getStrictlySmallerElementTreeSet() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(22);
        treeSet.add(36);
        treeSet.add(25);
        treeSet.add(16);
        treeSet.add(29);
        treeSet.add(70);
        treeSet.add(82);
        treeSet.add(101);
        treeSet.add(89);
        treeSet.add(14);
        System.out.println("The Tree Set: " + treeSet);
        System.out.println("Strictly less than 76 : " + ((TreeSet<Integer>) treeSet).lower(76));
        System.out.println("Strictly less than 31 : " + ((TreeSet<Integer>) treeSet).lower(31));
    }

    //14. Write a Java program to retrieve and remove the first element of a tree set.
    public static void removeFirstElementTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        ((TreeSet<String>) treeSet).pollFirst();
        System.out.println("Tree set after removing first element: " + treeSet);
    }


    //15. Write a Java program to retrieve and remove the last element of a tree set.
    public static void removeLastElementTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        ((TreeSet<String>) treeSet).pollLast();
        System.out.println("Tree set after removing last element: " + treeSet);
    }

    //16. Write a Java program to remove a given element from a tree set.
    public static void removeGivenElementTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("White");
        treeSet.add("Pink");
        treeSet.add("Yellow");
        System.out.println("The Tree Set: " + treeSet);
        ((TreeSet<String>) treeSet).remove("White");
        System.out.println("Tree set after removing last element: " + treeSet);
    }
}
