import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

    // Java Collection: ArrayList Exercises [22 exercises with solution]
    // Task1. Write a Java program to create a new array list, add some
    // colors (string) and print out the collection.
    public static void createNewArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
    }

    // Task2. Write a Java program to iterate through All elements in a array list.
    public static void iterateThroughElementsArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        for (String str : list) {
            System.out.println(str);
        }
    }

    // Task3. Write a Java program to insert an element into the array list at the first position.
    public static void insertFirstPositionElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        list.add(0, "Pink");
        System.out.println(list);
    }

    // Task4. Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void retrieveElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        System.out.println("Got element at the third index: " + list.get(3));
    }

    // Task5. Write a Java program to update specific array element by given element.
    public static void updateElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        list.set(3, "Purple");
        System.out.println(list);
    }

    // Task6. Write a Java program to remove the third element from a array list.
    public static void removeElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }

    // Task7. Write a Java program to search an element in a array list.
    public static void searchElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        if (list.contains("Blue")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }

    // Task8. Write a Java program to sort a given array list.
    public static void sortElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println("List before sort: " + list);
        Collections.sort(list);
        System.out.println("List after sort: " + list);
    }

    // Task9. Write a Java program to copy one array list into another.
    public static void copyArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
    }

    // Task10. Write a Java program to shuffle elements in a array list.
    public static void shuffleElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println("List before shuffling:\n" + list);
        Collections.shuffle(list);
        System.out.println("List after shuffling:\n" + list);
    }

    // Task11. Write a Java program to reverse elements in a array list.
    public static void reverseElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println("List before reversing:\n" + list);
        Collections.reverse(list);
        System.out.println("List after reversing:\n" + list);
    }

    // Task12. Write a Java program to extract a portion of a array list.
    public static void extractElementArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Black");
        System.out.println(list);
        List<String> subList = new ArrayList<>();
        subList = list.subList(0, 2);
        System.out.println(subList);
    }

    // Task13. Write a Java program to compare two array lists.
    public static void compareArrayList() {
        List<String> newList1 = new ArrayList<>();
        newList1.add("Red");
        newList1.add("Green");
        newList1.add("Black");
        newList1.add("White");
        newList1.add("Pink");
        List<String> newList2 = new ArrayList<>();
        newList2.add("Green");
        newList2.add("Black");
        newList2.add("Pink");
        newList2.add("Red");
        ArrayList<String> newList3 = new ArrayList<>();
        for (String str : newList1) {
            if (newList2.contains(str)) {
                newList3.add("Yes");
            } else {
                newList3.add("No");
            }
        }
        System.out.println(newList3);
    }

    // Task14. Write a Java program of swap two elements in an array list.
    public static void swapTwoElementsArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        System.out.println("Array list before Swap:");
        System.out.println(newList);
        Collections.swap(newList, 0, 2);
        System.out.println("Array list after swap:");
        System.out.println(newList);
    }

    // Task15. Write a Java program to join two array lists.
    public static void joinTwoArrayList() {
        List<String> newList1 = new ArrayList<>();
        newList1.add("Red");
        newList1.add("Green");
        newList1.add("Black");
        newList1.add("White");
        newList1.add("Pink");
        List<String> newList2 = new ArrayList<>();
        newList2.add("Green");
        newList2.add("Black");
        newList2.add("Pink");
        newList2.add("Red");
        List<String> joinList = new ArrayList<>();
        joinList.addAll(newList1);
        joinList.addAll(newList2);
        System.out.println(joinList);
    }

    // Task16. Write a Java program to clone an array list to another array list.
    public static void cloneArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        newList.add("Green");
        newList.add("Black");
        newList.add("Pink");
        newList.add("Red");
        System.out.println("Original array list: " + newList);
        List<String> cloneList = new ArrayList<String>();
        cloneList = (List<String>) ((ArrayList<String>) newList).clone();
        System.out.println("Cloned array list: " + cloneList);
    }

    // Task17. Write a Java program to empty an array list.
    public static void emptyArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        newList.add("Green");
        newList.add("Black");
        newList.add("Pink");
        newList.add("Red");
        System.out.println("Original array list: " + newList);
        newList.removeAll(newList);
        System.out.println("Array list after remove all elements " + newList);
    }

    // Task18. Write a Java program to test an array list is empty or not.
    public static void isEmptyArrayList() {
        List<String> newList1 = new ArrayList<>();
        List<String> newList2 = new ArrayList<>();
        newList1.add("Red");
        newList1.add("Green");
        newList1.add("Black");
        newList1.add("White");
        newList1.add("Pink");
        newList1.add("Green");
        newList1.add("Black");
        newList1.add("Pink");
        newList1.add("Red");
        System.out.println("Original array list: " + newList1);
        System.out.println("Checking the above array list is empty or not! " + newList1.isEmpty());
        System.out.println("Original array list: " + newList2);
        System.out.println("Checking the above array list is empty or not! " + newList2.isEmpty());
    }

    // Task19. Write a Java program to trim the capacity of an array list the current list size.
    public static void trimArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        newList.add("Green");
        newList.add("Black");
        newList.add("Pink");
        newList.add("Red");
        System.out.println("Original array list: " + newList);
        ((ArrayList<String>) newList).trimToSize();
        System.out.println(newList);
    }

    // Task20. Write a Java program to increase the size of an array list.
    public static void increaseSizeArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        newList.add("Green");
        newList.add("Black");
        newList.add("Pink");
        newList.add("Red");
        System.out.println("Original array list: " + newList);
        ((ArrayList<String>) newList).ensureCapacity(12);
        newList.add("White");
        newList.add("Pink");
        newList.add("Yellow");
        System.out.println(newList);
    }

    // Task21. Write a Java program to replace the second element of a ArrayList with the specified element.
    public static void replaceSecondElementArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        newList.add("Green");
        newList.add("Black");
        newList.add("Pink");
        newList.add("Red");
        System.out.println("Original array list: " + newList);
        newList.set(1, "Pink");
        System.out.println("Array list with replaced second element with 'Pink': " + newList);
    }

    // Task22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
    public static void printAllElementArrayList() {
        List<String> newList = new ArrayList<>();
        newList.add("Red");
        newList.add("Green");
        newList.add("Black");
        newList.add("White");
        newList.add("Pink");
        newList.add("Green");
        newList.add("Black");
        newList.add("Pink");
        newList.add("Red");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
