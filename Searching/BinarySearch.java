package Searching;

public class BinarySearch {
    public int search(int array[], int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // Calculate the middle index. Using (low + high) / 2 can lead to
            // integer overflow if low and high are very large.
            // A safer way is low + (high - low) / 2.
            int mid = low + (high - low) / 2;

            if (array[mid] == key)
                return mid;
            else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
