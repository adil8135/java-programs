public class prime {

    public static boolean check(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(check(5));
        for (int i = 2; i < 100; i++) {
            if (check(i) == true) {
                System.out.println(i);
            }
        }
    }
}
