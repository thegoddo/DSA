public class MergeSort {
    public void mergeSort(int[] array) {
        int[] auxiliaryArray = new int[array.length];

        mergeSortRec(array, auxiliaryArray, 0, array.length - 1);
    }

    private void mergeSortRec(
            int[] array,
            int[] auxArray,
            int start,
            int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSortRec(array, auxArray, start, mid);
            mergeSortRec(array, auxArray, mid + 1, end);

            mergeBothParts(array, auxArray, start, mid + 1, end);
        }
    }

    private void mergeBothParts(
            int[] array,
            int[] auxArray,
            int left,
            int right,
            int end) {
        int start = left;
        int mid = right - 1;
        int itemsCount = end - left + 1;
        int i = 0;

        // Merge elements and store in auxArray
        while (left <= mid && right <= end) {
            if (array[left] < array[right]) {
                auxArray[i++] = array[left++];
            } else {
                auxArray[i++] = array[right++];
            }
        }

        // Copy remaining elements from the first half
        while (left <= mid) {
            auxArray[i++] = array[left++];
        }

        // Copy remaining elements from the second half
        while (right <= end) {
            auxArray[i++] = array[right++];
        }

        // Copy back the merged elements to the orgininal array
        for (i = 0; i < itemsCount; i++) {
            array[start + i] = auxArray[i];
        }
    }
}
