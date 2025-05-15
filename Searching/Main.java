import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array[] = { 56, 32, 95, 20 };
        Scanner sc = new Scanner(System.in);

        System.out.println("What typ of Sort?");
        System.out.println("\n1.Bubble\n2.Selection");
        int choice = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        switch (choice) {
            case 1:
                Bubble b = new Bubble();
                int[] sortedArray = b.sort(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(sortedArray[i] + " ");
                }
                break;
            case 2:
                SelectionSort selectionSort = new SelectionSort();
                sortedArray = selectionSort.sort(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(sortedArray[i] + " ");
                }

            default:
                break;
        }
        sc.close();
        System.out.println();
    }
}
