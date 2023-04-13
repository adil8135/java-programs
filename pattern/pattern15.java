import java.util.Scanner;

public class pattern15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        for (int i = 0; i <= row_size; i++) {
            for (int j = 0; j < row_size - i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= row_size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * (row_size - i)) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
