import java.util.Scanner;

public class pattern12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (row_size * 2) - 2 * (i + 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < row_size; i++) {
            for (int j = row_size - i; j > 0; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }
            for (int j = row_size - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
