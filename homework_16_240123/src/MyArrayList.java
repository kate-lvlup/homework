import java.util.*;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] arrayElements;
    private int size;

    /**
     * This constructor creates an instance of {MyArrayList} with a specific capacity of an array inside.
     *
     * @param initialCapacity the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity
     *                                  is negative or 0.
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        arrayElements = new Object[initialCapacity];
    }

    /**
     * This constructor creates an instance of {MyArrayList} with a default capacity of an array inside.
     * A default size of inner array is 5;
     */
    public MyArrayList() {
//        this(DEFAULT_CAPACITY);
        arrayElements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Adds an element to array.
     *
     * @param element element to add
     */
    public void add(T element) {
        if (arrayElements.length == size) {
            Object[] newArray = new Object[arrayElements.length * 2];
            System.arraycopy(arrayElements, 0, newArray, 0, size);
            arrayElements = newArray;
        }
        arrayElements[size] = element;
        size++;
    }

    /**
     * Adds an element to the specific position in the array where
     *
     * @param index   index position
     * @param element element to add
     */
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        if (arrayElements.length == size) {
            Object[] newArray = new Object[arrayElements.length * 2];
            System.arraycopy(arrayElements, 0, newArray, 0, size);
            arrayElements = newArray;
        }
        System.arraycopy(arrayElements, index, arrayElements, index + 1, size - index);
        arrayElements[index] = element;
        size++;
    }

    /**
     * Retrieves an element by its position index. In case provided index in out of the list bounds it
     *
     * @param index index of the element
     * @return an element
     * @throws IndexOutOfBoundsException
     */
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) arrayElements[index];
    }

    /**
     * Returns the first element of the list. Operation is performed in constant time 0 (1)
     *
     * @return the first element of the list
     * @throws java.util.NoSuchElementException if list is empty
     */
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(0);
    }

    /**
     * Returns the last element of the list. Operation is performed in constant time 0 (1)
     *
     * @return the last element of the list
     * @throws java.util.NoSuchElementException if list is empty
     */
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size - 1);
    }

    /**
     * Changes the value of array at specific position. In case provided index in out of the list bounds it
     *
     * @param index   position of value
     * @param element a new value
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        arrayElements[index] = element;
    }

    /**
     * Removes an elements by its position index. In case provided index in out of the list bounds it
     *
     * @param index element index
     * @return deleted element
     * @throws IndexOutOfBoundsException
     */
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) arrayElements[index];
        System.arraycopy(arrayElements, index + 1, arrayElements, index, size - index - 1);
        size--;
        return removedElement;
    }

    /**
     * Checks for existing of a specific element in the list
     *
     * @param element is element
     * @return If element exist method returns true, otherwise it returns false
     */
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(arrayElements[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a list is empty
     *
     * @return {@code true} if list is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
//        return size == 0; // or so it is possible in one line
    }

    /**
     * @return amount of saved elements
     */
    public int size() {
        return size;
    }

    /**
     * Removes all list elements
     */
    public void clear() {
        size = 0;
        arrayElements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public String toString() {
        return Arrays.toString(arrayElements);
    }
}
