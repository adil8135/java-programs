public class reverse {

    public static void revarray(int array[]) {

        int start = 0, end = array.length - 1;
        // for (int i = 0; i < array.length / 2; i++) {
        // int temp = array[start];
        // array[start] = array[end];
        // array[end] = temp;
        // start++;
        // end--;
        // }
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        revarray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
