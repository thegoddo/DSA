

public class QuickSort {
    public void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = low;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                Const.swap(array, i, j);
                i++;
            }
        }
        Const.swap(array, i, high);
        return i;
    }
}
