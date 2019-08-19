public interface IQueueArray<T> {
    void add(T number);
    T remove() throws EmptyQueueException;
    T peek() throws EmptyQueueException;
    boolean isEmpty();
    boolean isFull();
    void clear();
    void display();
}