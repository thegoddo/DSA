package Searching;

public class InterpolationSearch {
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (arr[high] == arr[low]) {
                if (arr[low] == target) {
                    return low;
                } else {
                    return -1;
                }
            }

            int pos = low + ((high - low) * (target - arr[low])) / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos;
            } else if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        if (low < arr.length && arr[low] == target) {
            return low;
        }

        // If the loop finishes and the target was not found
        return -1;
    }
}
