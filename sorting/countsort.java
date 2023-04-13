public class countsort {

    public static void countings(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int counting[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < counting.length; i++) {
            while (counting[i] > 0) {
                arr[j] = i;
                j++;
                counting[i]--;
            }
        }

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 4, 3, 5, 7, 6, 2, 3, 4, 5, 6, 4, 3, 2, 4, 9, 1, 7, 5, 4, 3, 2, 1 };
        countings(arr);
        printarr(arr);
    }

}
