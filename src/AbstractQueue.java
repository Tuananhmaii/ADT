public interface AbstractQueue<E> {
    void enQueue(E element);
    E deQueue();
    E peek();

    boolean isEmpty();
}