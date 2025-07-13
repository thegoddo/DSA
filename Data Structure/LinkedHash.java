import java.util.LinkedList;
import java.util.List;

public class LinkedHash<K, V> {

    private class Node {
        K key;
        V value;

        Node next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private LinkedList<Node>[] buckets;
    private int capacity;

    @SuppressWarnings("unchecked")
    public LinkedHash(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        bucket.addFirst(new Node(key, value));
    }

    public V get(K key) {
        int index = hashFunction(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key.equals(bucket)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hashFunction(key);
        LinkedList<Node> bucket = buckets[index];

        Node prev = null;
        for (Node current = bucket.getFirst(); current != null; current = current.next) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    bucket.removeFirst();
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
        }
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            LinkedList<Node> bucket = buckets[i];
            for (Node node : bucket) {
                System.out.print("(" + node.key + ", " + node.value + ") ");
            }
            System.out.println();
        }
        System.out.println("End!!!");
    }

    public static void main(String[] args) {
        LinkedHash<Integer, String> linkedHash = new LinkedHash<>(5);

        linkedHash.put(3, "Hello");
        linkedHash.put(7, "World");
        linkedHash.put(6, "null");

        linkedHash.display();
        linkedHash.remove(6);
        linkedHash.display();
    }
}
