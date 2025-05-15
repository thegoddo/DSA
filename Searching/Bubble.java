
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

    public static void main(String[] args) {
        int array[] = { 56, 32, 95, 20 };
        Bubble b = new Bubble();
        int[] sortedArray = b.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}