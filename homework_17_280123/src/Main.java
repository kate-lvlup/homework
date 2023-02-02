import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("White");
        myLinkedList.add("Black");
        myLinkedList.add("Green");
        myLinkedList.add("Grey");
        myLinkedList.add("Gold");
        myLinkedList.add("Silver");
        myLinkedList.add("Purple");
        System.out.println(myLinkedList);
        myLinkedList.add(3, "Red");
        System.out.println(myLinkedList);
        myLinkedList.set(3, "Brown");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.contains("Gold"));
        System.out.println(myLinkedList.contains("Gold!"));
        System.out.println(myLinkedList.isEmpty());
        myLinkedList.clear();
        System.out.println(myLinkedList.isEmpty());

        Iterator <String> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}