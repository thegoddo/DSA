
/**
 * FOR I = 0 TO A.LENGTH - 1
 * SWAPPED = FALSE
 * 
 * FOR J=0 TO A.LENGTH - 1 - I
 * IF (A[J]> A[J+1])
 * SWAP(A[J], A[J+1])
 * IF(!SWAPPED)
 * BREAK
 */

public class Bubble {

    public int[] sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return array;
    }

}