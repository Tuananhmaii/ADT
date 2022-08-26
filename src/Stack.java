public class Stack<E> implements AbstractStack<E> {
    private static final int MAX = 100;
    private int length;
    private int top;
    private E[] elements;

    public int size() {
        return length;
    }
    public Stack() {
        elements = (E[]) new Object[MAX];
        top = -1;
        length = 0;
    }
    public boolean isEmpty() {
        return length==0;
    }
    public String toString() {
        int current = top;
        StringBuilder result = new StringBuilder();
        while (current >= 0) {
            result.append(elements[current] + "\n");
            current--;
        }
        return result.toString();
    }
    public E peek() {
        if (length==0) throw new IllegalStateException("Stack Underflow!!");
        return elements[top];
    }
    public void push(E element) {
        if (length == MAX) throw new IllegalStateException("Stack Overflow!!");
        elements[++top] = element;
        length++;
    }
    public E pop() {
        if (length==0) throw new IllegalStateException("Stack Underflow!!");
        E data = elements[top--];
        length --;
        return data;
    }
}