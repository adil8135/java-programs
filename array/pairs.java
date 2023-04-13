public class pairs {

    public static void pair(int array[]) {

        for (int i = 0; i < array.length; i++) {
            int number = i;
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[number] + "," + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 8, 10 };
        pair(a);
    }
}
