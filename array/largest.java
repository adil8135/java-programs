public class largest {

    public static void linear(int array[]) {
        int large = Integer.MIN_VALUE; // - infinity
        int small = Integer.MAX_VALUE;// + infinity
        for (int i = 0; i < array.length; i++) {

            if (array[i] > large) {
                large = array[i];
            }
            if (array[i] < small) {
                small = array[i];
            }
        }
        System.out.println("largest number is " + large);
        System.out.println("smallest number is " + small);
        return;
    }

    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4, 15, 6, 7, 8, 9, 0 };
        linear(a);
    }
}
