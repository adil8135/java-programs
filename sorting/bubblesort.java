public class bubblesort {
    public static void buble(int unsorted[]) {

        for (int i = 0; i < unsorted.length - 1; i++) {
            for (int j = 0; j < (unsorted.length - 1) - i; j++) {
                if (unsorted[j] > unsorted[j + 1]) {

                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {

        int unsort[] = { 235, 34, 345, 45, 345, 34 };
        buble(unsort);
        for (int i = 0; i < unsort.length; i++) {
            System.out.println(unsort[i]);
        }
    }
}
