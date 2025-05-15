public class HeapSort {
    public void heapSort(int[] array) {
        int n = array.length;

        buildHeap(array, n);
        for (int i = n - 1; i > 0; i--) {
            Const.swap(array, 0, i);
            heapify(array, 0, i);
        }
    }

    private void buildHeap(int[] array, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(array, i, size);
        }
    }

    private void heapify(int[] array, int i, int size) {
        int examined = array[i];
        // ONly non-leaf nodes need to be heapified
        while (i < size / 2) {
            int largestChildIndex = getLargestChildIndex(array, i, size);

            if (examined >= array[largestChildIndex]) {
                // The heap property is satisfied
                break;
            } else {
                // Overwrite the current node with the value of its largest child
                array[i] = array[largestChildIndex];
                // Move the index to the largest child
                // to continue the process down the tree
                i = largestChildIndex;
            }
        }
        // Place the original root value at the final
        // position determined by the last iteration
        array[i] = examined;
    }

    private int getLargestChildIndex(
            int[] array,
            int index,
            int size) {
        int leftIndex = 2 * index + 1;
        int rightIndex = leftIndex + 1;

        if (rightIndex < size && array[leftIndex] < array[rightIndex]) {
            // Right child is larger
            return rightIndex;
        } else {
            // Left child is larger or only child
            return leftIndex;
        }
    }
}
