public class function {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        System.out.println(multiply(5, 5));
        System.out.println(factorial(5));
    }
}
