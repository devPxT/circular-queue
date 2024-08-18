public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        System.out.println("A fila está vazia? " + queue.isEmpty());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("A fila está vazia? " + queue.isEmpty());

        System.out.println("Elemento removido: " + queue.remove());

        queue.add(40);
        queue.add(50);
        queue.add(60);

        queue.add(70);

        System.out.println("A fila está cheia? " + queue.isFull());

        System.out.println("Elemento removido: " + queue.remove());
        System.out.println("Elemento removido: " + queue.remove());
        System.out.println("Elemento removido: " + queue.remove());
        System.out.println("Elemento removido: " + queue.remove());
        System.out.println("Elemento removido: " + queue.remove());

        System.out.println("Elemento removido: " + queue.remove());

        queue.add(80);
        queue.add(90);
        queue.clear();
        System.out.println("A fila está vazia após o clear()? " + queue.isEmpty());
    }
}
