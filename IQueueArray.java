public interface IQueueArray<T> {
    void add(T value);
    T remove() throws EmptyQueueException;
    T peek() throws EmptyQueueException;
    boolean isEmpty();
    boolean isFull();
    void clear();
    void display();
}