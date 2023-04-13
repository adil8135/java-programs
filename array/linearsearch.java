public class linearsearch {

    public static void linear(int searchelement, int a[]) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == searchelement) {
                System.out.println("at index" + i);
                return;
            }
        }
        System.out.println("this number is not present in that array");
        return;
    }

    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        linear(5, a);
    }
}
