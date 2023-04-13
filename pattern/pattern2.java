import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        System.out.println("enter column size");
        int column_size = sc.nextInt();
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < column_size; j++) {
                if (i == 0 || j == 0 || i == row_size - 1 || j == column_size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
