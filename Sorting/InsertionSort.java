/**
 * FOR J=2 TO A.LENGTH
 * KEY=A[J]
 * // INSERT A[J] INTO THE SORTED ARRAY A[1..J-1]
 * I=J-1
 * WHILE I>0 AND A[I]>KEY
 * A[I+1] = A[I]
 * I=I-1
 * A[I+1]=KEY
 * 
 */
public class InsertionSort {
    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = temp;
        }

    }
}
