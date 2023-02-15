import java.sql.Time;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Deck<E> implements List<E> {
    private static final int MAX_SIZE = 52;
    private Object[] arr;
    private int size;

    public Deck() {
        arr = new Object[MAX_SIZE];
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++)
            if (arr[i] == o) return true;

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size < MAX_SIZE) {
            arr[size] = e;
            size++;
            return true;
        } else
            return false;
    }

    @Override
    public boolean remove(Object o) {

        int idx = -1;

        // find obj index
        for (int i = 0; i < size; i++) {
            if (o == arr[i]) {
                idx = i;
                break;
            }
        }

        // not found
        if (idx == -1) return false;

        // shift next elements indexes
        for (int i = idx; i < size; i++) {
            if (i != MAX_SIZE)
                arr[i] = arr[i + 1];
            else
                arr[i] = null;
        }

        // update size
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }

        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size) return null;
        else return (E) arr[index];
    }

    @Override
    public E set(int index, E element) {
        if (0 <= index && index < size) {
            arr[index] = element;
            return element;
        }

        return null;
    }

    @Override
    public void add(int index, E element) {
        // early return
        if (index < 0 || index > size) return;

        // update
        if (size < MAX_SIZE) size++;

        // shift indexes after
        for (int i = size - 1; i > index; i--) {
            if (i != MAX_SIZE - 1) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = null;
            }
        }

        // new element
        arr[index] = element;
    }

    @Override
    public E remove(int index) {
        // not found
        if (index < 0 || index > size) return null;

        // shift next elements indexes
        for (int i = index; i < size; i++) {
            if (i != MAX_SIZE)
                arr[i] = arr[i + 1];
            else
                arr[i] = null;
        }

        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (arr[i] == o) return i;

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
