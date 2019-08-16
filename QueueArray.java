import java.util.Arrays;

public class QueueArray<T> implements IQueueArray<T> {
    private T[] items;
    private Integer size;
    private Integer front;

    public QueueArray() {
        size = 0;
        front = 0;
        items = (T[]) new Object[2];
    }

    public void add(T value) {
        if (isFull()) {
            items = Arrays.copyOf(items, 2 * size);
        }
        items[size] = value;
        size++;
    }

    public T remove() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Cannot remove from an empty array");
        }
        T value = items[front];
        front++;

        return value;
    }

    public T peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Cannot remove from an empty array");
        }
        
        return items[front];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == items.length);
    }

    public void clear() {
        size = 0;
    }

    public void display() {
        for (int index = front; index < size; index++) {
            System.out.println(items[index]);
        }
    }
}