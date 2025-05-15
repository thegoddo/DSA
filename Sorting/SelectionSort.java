

/**
 * 
 * N = A.LENGTH
 * FOR I = 0 TO N - 1
 *  MIN-INDEX = I
 *  
 *  FOR J=I+1 TO A.LENGTH
 *      IF (A[J] < A[MIN-INDEX])
 *          MIN-INDEX=J
 *      
 *      EXCHANGE A[MIN-INDEX], A[I]
 * 
 */

public class SelectionSort {
    public int[] sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
