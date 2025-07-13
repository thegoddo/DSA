import java.util.ArrayList;
import java.util.List;

public class Hash {

    // Number of buckets
    private int bucketCount;

    // List of lists of store chains
    private List<List<Integer>> table;

    public Hash(int bucketCount) {
        this.bucketCount = bucketCount;
        table = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            table.add(new ArrayList<>());
        }
    }

    public void insert(int key) {
        int index = getHashIndex(key);

        table.get(index).add(key);
    }

    public void remove(int key) {
        int index = getHashIndex(key);

        table.get(index).remove(Integer.valueOf(key));
    }

    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.println(i);

            for (int key : table.get(i)) {
                System.out.println("---> " + key);
            }
            System.out.println();
        }
    }

    public int getHashIndex(int key) {
        return key % bucketCount;
    }

    public static void main(String[] args) {
        int[] keys = { 7, 18, 12, 25 };

        Hash hash = new Hash(7);

        for (int key : keys) {
            hash.insert(key);
        }

        hash.remove(12);
        hash.display();
    }
}
