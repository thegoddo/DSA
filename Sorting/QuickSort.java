/**
 * QUICKSORT(A,P,R)
 * IF P < R
 * Q=PARTITION(A,P,R)
 * QUICKSORT(A,P,Q-1)
 * QUICKSORT(A,Q+1, R)
 * 
 * PARTITION(A,P,R)
 * X=A[R]
 * I=P-1
 * FOR J=P TO R-1
 * IF A[J] <= X
 * I=I+1
 * EXCHANGE A[I] WITH A[J]
 * EXCHANGE A[I+1] WITH A[R]
 * RETURN I+1
 * 
 */

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
