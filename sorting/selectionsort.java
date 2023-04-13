public class selectionsort {
    public static void selection(int unsorted[]) {

        for (int i = 0; i < unsorted.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < (unsorted.length); j++) {
                if (unsorted[min] > unsorted[j]) {
                    min = j;
                }
            }
            int temp = unsorted[min];
            unsorted[min] = unsorted[i];
            unsorted[i] = temp;
        }
    }

    public static void main(String args[]) {

        int unsort[] = { 235, 34, 345, 45, 345, 34 };
        selection(unsort);
        for (int i = 0; i < unsort.length; i++) {
            System.out.println(unsort[i]);
        }
    }
}
