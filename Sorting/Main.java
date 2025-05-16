import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = { 56, 32, 95, 20 };
        Scanner sc = new Scanner(System.in);

        System.out.println("What typ of Sort?");
        System.out.println("\n1.Bubble\n2.Selection\n3.Merge\n4.Quick\n5.Insertion\n6.Shell\n7.Heap");
        int choice = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        switch (choice) {
            case 1:

                Bubble b = new Bubble();
                b.sort(array);
                Const.display(array);
                break;

            case 2:

                SelectionSort selectionSort = new SelectionSort();
                selectionSort.sort(array);
                Const.display(array);

            case 3:
                MergeSort mergeSort = new MergeSort();
                mergeSort.mergeSort(array);
                Const.display(array);
                break;
            case 4:
                QuickSort quickSort = new QuickSort();
                quickSort.sort(array, 0, array.length);
                Const.display(array);
                break;

            case 5:
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(array);
                Const.display(array);
                break;

            case 6:
                ShellSort shellSort = new ShellSort();
                shellSort.sort(array);
                Const.display(array);
                break;
            case 7:
                HeapSort heapSort = new HeapSort();
                heapSort.heapSort(array);
                Const.display(array);
                break;

            default:
                break;
        }
        sc.close();
        System.out.println();
    }
}
