public class ShellSort {
    public void sort(int[] array) {
        int n = array.length;
        
        // Start with a large gap, then reduce the gap
        // A common gap sequence is Knuth's: h = h * 3 + 1
        // We'll start with a gap calculated to be less than n/3
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                int temp = array[i];

                int j = i;

                while (j >= h && array[j - h] > temp) {
                    array[j] = array[j - h];
                    j -= h;
                }

                array[j] = temp;
            }
            h /= 3;
        }
    }
}
