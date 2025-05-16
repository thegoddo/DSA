package Searching;

public class SequentialSearch {
    public int search(int[] arr, int key) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key)
                return index; // return the index where the key is
        }
        return -1; // otherwise return -1
    }
}
