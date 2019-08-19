import java.util.Arrays;

public class QueueArray<T> implements IQueueArray<T> {
    private T[] numbers;
    private Integer size;
    private Integer front;

    public QueueArray() {
        size = 0;
        front = 0;
        numbers = (T[]) new Object[2];
    }

    public void add(T number) {
        if (isFull()) {
            numbers = Arrays.copyOf(numbers, 2 * size);
        }
        numbers[size] = number;
        size++;
    }

    public T remove() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Cannot remove from an empty array");
        }
        T value = numbers[front];
        front++;

        return value;
    }

    public T peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Cannot peek from an empty array");
        }
        
        return numbers[front];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == numbers.length);
    }

    public void clear() {
        size = 0;
    }

    public void display() {
        for (int index = front; index < size; index++) {
            System.out.println(numbers[index]);
        }
    }
}