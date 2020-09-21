public class RecBinarySearch {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = array.length;
        int target = 9;

        int result = recBinarySearch(array, 0, n - 1, target);

        System.out.println("Searching for " + target);

        for (int i = 0; i < 10; i++)
            System.out.print(array[i] + "   ");
        System.out.println();

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    public static int recBinarySearch(int array[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Check if element is at middle
            if (array[mid] == x)
                return mid;

            // If element is smaller than mid, return left side
            if (array[mid] > x)
                return recBinarySearch(array, left, mid - 1, x);

            // Else return the right side
            return recBinarySearch(array, mid + 1, right, x);
        }

        return -1;
    }
}
