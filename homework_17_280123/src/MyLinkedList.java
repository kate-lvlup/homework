import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * {@link MyLinkedList} is a list implementation that is based on singly linked generic nodes. A node is implemented as
 * inner static class {@link MyNode<T>}.
 *
 * @param <T> generic type parameter
 */
public class MyLinkedList<T> {
    static class MyNode<T> {
        T element;
        MyNode<T> next;

        public MyNode(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return element + "," + next;
        }
    }

    private MyNode<T> first;
    private MyNode<T> last;
    private int size;

    /**
     * Adds an element to the end of the list
     *
     * @param element element to add
     */
    public void add(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    /**
     * Adds a new element to the specific position in the list. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index   an index of new element
     * @param element element to add
     */
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        MyNode<T> newNode = new MyNode<>(element);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            MyNode<T> prev = getMyNodeByIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private MyNode<T> getMyNodeByIndex(int index) {
        MyNode<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * Changes the value of an list element at specific position. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index   an position of element to change
     * @param element a new element value
     */
    public void set(int index, T element) {
        Objects.checkIndex(index, size);  // check (do we go out of LinkedList)
        MyNode<T> node = getMyNodeByIndex(index);  // get the element we need by index
        node.element = element;  // change its value
    }

    /**
     * Retrieves an elements by its position index. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index element index
     * @return an element value
     */
    public T get(int index) {
        Objects.checkIndex(index, size);  // check (do we go out of LinkedList)
        return getMyNodeByIndex(index).element;
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
     * Removes an elements by its position index. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index element index
     * @return deleted element
     */
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            MyNode<T> prev = getMyNodeByIndex(index - 1);
            removedElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removedElement;
    }

    /**
     * Checks if a specific exists in the list
     *
     * @return {@code true} if element exist, {@code false} otherwise
     */
    public boolean contains(T element) {
        MyNode<T> current = first;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Checks if a list is empty
     *
     * @return {@code true} if list is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of elements in the list
     *
     * @return number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Removes all list elements
     */
    public void clear() {
        first = last = null;
        size = 0;
    }


    public Iterator<T> iterator() {
        return new Iterator<T>() {
            MyNode<T> current = first;

            @Override
            public boolean hasNext() {
                return current!= null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T element = current.element;
                    current = current.next;
                    return element;
                }
                return null;
            }
        };
    }

    @Override
    public String toString() {
        return "[" + first + "," + "]";
    }
}
