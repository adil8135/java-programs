import java.util.Scanner;

public class pattern14 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        for (int i = 1; i <= row_size; i++) {
            for (int j = 0; j < row_size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row_size; j++) {
                if (i == 1 || j == 1 || i == row_size || j == row_size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
