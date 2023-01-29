import java.util.*;

public class LinkedListMethods {
    // Java Collection: LinkedList Exercises [26 exercises with solution]
    // Task1. Write a Java program to append the specified element to the end of a linked list.
    public static void appendElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
    }

    // Task2. Write a Java program to iterate through all elements in a linked list.
    public static void iterateElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        for (String str : linkedList1) {
            System.out.println(str);
        }
    }

    // Task3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void iterateSpecifiedPositionElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        // set Iterator at specified index
        Iterator iterator = linkedList1.listIterator(1);
        // print list from second position
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Task4. Write a Java program to iterate a linked list in reverse order.
    public static void reverseElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        Iterator descIterator = ((LinkedList<String>) linkedList1).descendingIterator();
        // Print list elements in reverse order
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
    }

    // Task5. Write a Java program to insert the specified element at the specified position in the linked list.
    public static void insertElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        linkedList1.add(3, "Purple");
        System.out.println("The linked list: " + linkedList1);
    }

    // Task6. Write a Java program to insert elements into the linked list at the first and last position.
    public static void insertFirstLastElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        ((LinkedList<String>) linkedList1).addFirst("Orange");
        ((LinkedList<String>) linkedList1).addLast("Grey");
        System.out.println("The linked list: " + linkedList1);
    }

    // Task7. Write a Java program to insert the specified element at the front of a linked list.
    public static void insertFrontElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        ((LinkedList<String>) linkedList1).offerFirst("Blue");
        System.out.println("The linked list: " + linkedList1);
    }

    // Task8. Write a Java program to insert the specified element at the end of a linked list.
    public static void insertEndElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        ((LinkedList<String>) linkedList1).offerLast("Brown");
        System.out.println("The linked list: " + linkedList1);
    }

    // Task9. Write a Java program to insert some elements at the specified position into a linked list.
    public static void insertListInLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        List<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Gold");
        linkedList2.add("Silver");
        System.out.println("The linked list2: " + linkedList2);
        linkedList1.addAll(1, linkedList2);
        System.out.println("The linked list: " + linkedList1);
    }

    // Task10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    public static void getFirstLastLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        // Find first element of the List
        String first_element = ((LinkedList<String>) linkedList1).getFirst();
        System.out.println("First Element is: " + first_element);
        // Find last element of the List
        String last_element = ((LinkedList<String>) linkedList1).getLast();
        System.out.println("Last Element is: " + last_element);
    }

    // Task11. Write a Java program to display the elements and their positions in a linked list.
    public static void printLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        for (int i = 0; i < linkedList1.size(); i++) {
            System.out.println("[" + i + "]" + " " + linkedList1.get(i));
        }
    }

    // Task12. Write a Java program to remove a specified element from a linked list.
    public static void removeElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        linkedList1.remove(3);
        System.out.println("The linked list: " + linkedList1);
    }

    // Task13. Write a Java program to remove first and last element from a linked list.
    public static void removeFirstLastElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        ((LinkedList<String>) linkedList1).removeFirst();
        ((LinkedList<String>) linkedList1).removeLast();
        System.out.println("The linked list: " + linkedList1);
    }

    // Task14. Write a Java program to remove all the elements from a linked list.
    public static void removeAllElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list: " + linkedList1);
        linkedList1.clear();
        System.out.println("The linked list: " + linkedList1);
    }

    // Task15. Write a Java program of swap two elements in a linked list.
    public static void swapTwoElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("Array list before Swap:");
        System.out.println(linkedList1);
        Collections.swap(linkedList1, 0, 2);
        System.out.println("Array list after swap:");
        System.out.println(linkedList1);
    }

    // Task16. Write a Java program to shuffle the elements in a linked list.
    public static void shuffleElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("List before shuffling: " + linkedList1);
        Collections.shuffle(linkedList1);
        System.out.println("List after shuffling: " + linkedList1);
    }

    // Task17. Write a Java program to join two linked lists.
    public static void joinLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        List<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Red1");
        linkedList2.add("Green2");
        linkedList2.add("Black3");
        linkedList2.add("White4");
        linkedList2.add("Pink5");
        linkedList2.add("Yellow6");
        System.out.println("The linked list1: " + linkedList1);
        System.out.println("The linked list2: " + linkedList2);
        List<String> linkedList3 = new LinkedList<>();
        linkedList3.addAll(linkedList1);
        linkedList3.addAll(linkedList2);
        System.out.println("The linked list3: " + linkedList3);
    }

    // Task18. Write a Java program to clone a linked list to another linked list.
    public static void cloneLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list1: " + linkedList1);
        List<String> cloneLinkedList = new LinkedList<>();
        cloneLinkedList = (List<String>) ((LinkedList<String>) linkedList1).clone();
        System.out.println("Cloned linked list: " + cloneLinkedList);
    }

    // Task19. Write a Java program to remove and return the first element of a linked list.
    public static void removeReturnFirstElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list1: " + linkedList1);
        System.out.println("Removed element: " + ((LinkedList<String>) linkedList1).pop());
        System.out.println("Linked list after pop operation: " + linkedList1);
    }

    // Task20. Write a Java program to retrieve but does not remove, the first element of a linked list.
    public static void retrieveFirstElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list1: " + linkedList1);
        System.out.println("First element in the list: " + ((LinkedList<String>) linkedList1).peekFirst());
        System.out.println("The linked list1: " + linkedList1);
    }

    // Task21. Write a Java program to retrieve but does not remove, the last element of a linked list.
    public static void retrieveLastElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list1: " + linkedList1);
        System.out.println("First element in the list: " + ((LinkedList<String>) linkedList1).peekLast());
        System.out.println("The linked list1: " + linkedList1);
    }

    // Task22. Write a Java program to check if a particular element exists in a linked list.
    public static void existElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list1: " + linkedList1);
        System.out.println("The linked list contains Red color: " + linkedList1.contains("Red"));
        System.out.println("The linked list contains Gold color: " + linkedList1.contains("Gold"));
    }

    // Task23. Write a Java program to convert a linked list to array list.
    public static void convertLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        List<String> convertArrList = new ArrayList<>(linkedList1);
        System.out.println("The array list: " + convertArrList);
    }

    // Task24. Write a Java program to compare two linked lists.
    public static void compareTwoLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        List<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Gold");
        linkedList2.add("Green");
        linkedList2.add("Black");
        linkedList2.add("Silver");
        linkedList2.add("Pink");
        linkedList2.add("Yellow");
        List<String> linkedList3 = new LinkedList<>();
        for (String str : linkedList1) {
            if (linkedList2.contains(str)) {
                linkedList3.add(str + " - Yes");
            } else {
                linkedList3.add(str + " - No");
            }
        }
        System.out.println("The new linked list: " + linkedList3);
    }

    // Task25. Write a Java program to test a linked list is empty or not.
    public static void isEmptyLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println(linkedList1.isEmpty());
    }

    // Task26. Write a Java program to replace an element in a linked list.
    public static void replaceElementLinkedList() {
        List<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Red");
        linkedList1.add("Green");
        linkedList1.add("Black");
        linkedList1.add("White");
        linkedList1.add("Pink");
        linkedList1.add("Yellow");
        System.out.println("The linked list1: " + linkedList1);
        linkedList1.set(1, "Violet");
        System.out.println("The linked list1: " + linkedList1);
    }
}