import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortsPrepSelection {

    public static void main(String[] args) throws FileNotFoundException {

        int[] arr1 = new int[2000]; // 1 to 2000 - best case
        int[] arr2 = new int[2000]; // 2000 to 0 - worst case
        int[] arr3 = new int[2000]; // average case 1
        int[] arr4 = new int[2000]; // average case 2
        int[] arr5 = new int[2000]; // average case 3

        try {
            Scanner scanner = new Scanner(new File("1.txt"));
            int i = 0;
            while (scanner.hasNextInt()) {
                arr1[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(new File("2.txt"));
            int i = 0;
            while (scanner.hasNextInt()) {
                arr2[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(new File("3.txt"));
            int i = 0;
            while (scanner.hasNextInt()) {
                arr3[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(new File("4.txt"));
            int i = 0;
            while (scanner.hasNextInt()) {
                arr4[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(new File("5.txt"));
            int i = 0;
            while (scanner.hasNextInt()) {
                arr5[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Starting array with 2000 numbers");

        System.out.println(" ========================= ");
        System.out.println("Testing selection sort: ");

        System.out.println(" --- best case ---");
        selectionSort(arr1);

        System.out.println(" --- worst case ---");
        selectionSort(arr2);
        
        System.out.println(" --- avarage case 1 ---");
        selectionSort(arr3);

        System.out.println(" --- avarage case 2 ---");
        selectionSort(arr4);

        System.out.println(" --- avarage case 3 ---");
        selectionSort(arr5);

        System.out.println(" ========================= "); // end selection sort

        System.out.println("Testing bubble sort:");

        System.out.println(" --- best case ---");
        bubbleSort(arr1);

        System.out.println(" --- worst case ---");
        bubbleSort(arr2);

        System.out.println(" --- avarage case 1 ---");
        bubbleSort(arr3);

        System.out.println(" --- avarage case 2 ---");
        bubbleSort(arr4);

        System.out.println(" --- avarage case 3 ---");
        bubbleSort(arr5);

        System.out.println(" ========================= "); // end bubble sort

        System.out.println("Testing insertion sort:");

        System.out.println(" --- best case ---");
        insertionSort(arr1);

        System.out.println(" --- worst case ---");
        insertionSort(arr2);

        System.out.println(" --- avarage case 1 ---");
        insertionSort(arr3);

        System.out.println(" --- avarage case 2 ---");
        insertionSort(arr4);

        System.out.println(" --- avarage case 3 ---");
        insertionSort(arr5);

        System.out.println(" ========================= "); // end insertion sort



        System.out.println("Starting array with 10 numbers");

        System.out.println(" ========================= ");
        System.out.println("Testing selection sort: ");

        int[] array1Selection = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2Selection = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] array3Selection = { 1, 3, 2, 5, 4, 7, 9, 6, 8, 10 };

        System.out.println(" --- best case ---");
        selectionSort(array1Selection);

        System.out.println(" --- worst case ---");
        selectionSort(array2Selection);

        System.out.println(" --- avarage case ---");
        selectionSort(array3Selection);

        System.out.println(" ========================= "); // end selection sort

        System.out.println("Testing bubble sort:");

        int[] array1Bubble = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2Bubble = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] array3Bubble = { 1, 3, 2, 5, 4, 7, 9, 6, 8, 10 };

        System.out.println(" --- best case ---");
        bubbleSort(array1Bubble);

        System.out.println(" --- worst case ---");
        bubbleSort(array2Bubble);

        System.out.println(" --- avarage case ---");
        bubbleSort(array3Bubble);

        System.out.println(" ========================= "); // end bubble sort

        System.out.println("Testing insertion sort:");

        int[] array1Insertion = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2Insertion = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] array3Insertion = { 1, 3, 2, 5, 4, 7, 9, 6, 8, 10 };

        System.out.println(" --- best case ---");
        insertionSort(array1Insertion);

        System.out.println(" --- worst case ---");
        insertionSort(array2Insertion);

        System.out.println(" --- avarage case ---");
        insertionSort(array3Insertion);

        System.out.println(" ========================= "); // end insertion sort
    }

    public static void selectionSort(int[] array) {

        int temp, min, exchanges = 0, comparisons = 0;
        int numberOfItems = array.length;

        for (int pass = 0; pass != numberOfItems - 1; pass++) {
            min = pass;

            for (int index = pass + 1; index != numberOfItems; index++) {
                comparisons++;
                if (array[index] < array[min])
                    min = index;
            } // end inner loop

            temp = array[min];
            array[min] = array[pass];
            array[pass] = temp;
            exchanges++;

        } // end outer loop

        System.out.println("Selection Sort: Number of Exchanges: " + exchanges);
        System.out.println("Selection Sort: Number of Comparisons: " + comparisons);

        System.out.println("Sorted file:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "   ");
        System.out.println();
    } // end selection sort

    public static void bubbleSort(int array[]) {
        int exchanges = 0, comparisons = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    exchanges++;
                }
            } // end inner loop
        } // end outer loop
        System.out.println("Bubble Sort: Number of Exchanges: " + exchanges);
        System.out.println("Bubble Sort: Number of Comparisons: " + comparisons);

        System.out.println("Sorted file:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "   ");
        System.out.println();
    } // end bubble sort

    public static void insertionSort(int[] array) {
        int exchanges = 0, comparisons = 0;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            comparisons++;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                exchanges++;
                comparisons++;
            }
            array[j + 1] = key; // not counting this as an exchange
        } // end loop
        System.out.println("Insertion Sort: Number of Exchanges: " + exchanges);
        System.out.println("Insertion Sort: Number of Comparisons: " + comparisons);

        System.out.println("Sorted file:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "   ");
        System.out.println();
    } // end insertion sort
}