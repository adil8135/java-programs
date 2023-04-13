import java.util.*;

public class binarysearch {

    public static int binary_search(int array[], int element) {

        int mid, start = 0, end = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            mid = (start + end) / 2;
            if (array[mid] == element) {
                return (int) mid;
            }
            if (array[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1 };
        System.out.println("at index" + binary_search(a, 55));
    }
}
