public class CircularQueue<T> {
    private int top = -1;
    private int base = 0;
    private T[] data;

    public CircularQueue(int size) {
        data = (T[]) new Object[size];
    }

    public void add(T value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        top = move(top);
        data[top] = value;
    }

    public T remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        T value = data[base];
        data[base] = null;
        base = move(base);
        if (base == move(top)) {
            top = -1;
            base = 0;
        }
        return value;
    }

    public void clear() {
        top = -1;
        base = 0;
        data = (T[]) new Object[data.length];
    }

    public boolean isFull() {
        return move(top) == base && data[move(top)] != null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private int move(int position) {
        return (position + 1) % data.length;
    }
}
