import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        arrayList.add("Six");
        System.out.println(arrayList);
        arrayList.add(4, "newNumber");
        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        arrayList.set(4, "444");
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Six"));
        System.out.println(arrayList.contains("6"));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
    }
}