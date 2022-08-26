public class Queue<E> implements AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 250;
    private int rear;
    private E[] queue;

    public Queue() {
        rear = -1;
        queue = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return rear==-1;
    }
    private void ensureNonEmpty() {
        if (rear==-1){
            throw new IllegalStateException("Queue is Empty");
        }
    }
    public E peek() {
        ensureNonEmpty();
        return queue[0];
    }
    public void enQueue(E element) {
        if (rear == queue.length-1){
            throw new IllegalStateException("Queue Overflow!!");
        }
        queue[++rear] = element;
    }
    public E deQueue() {
        ensureNonEmpty();
        E element = queue[0];
        for (int i=0;i<rear;i++){
            queue[i] = queue[i+1];
        }
        rear--;
        return element;
    }
    public String toString(){
        int current = 0;
        StringBuilder result = new StringBuilder();
        while(current<=rear){
            result.append(queue[current]+ "\n");
            current++;
        }
        return result.toString();
    }
}
