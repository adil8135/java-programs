import java.util.Scanner;

public class pattern13 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        for (int i = 1; i <= row_size; i++) {
            for (int j = 0; j < row_size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row_size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
