import java.util.Scanner;

public class pattern7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        // System.out.println("enter column size");
        // int column_size = sc.nextInt();
        for (int i = 0; i < row_size; i++) {
            for (int j = 1; j <= row_size - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
