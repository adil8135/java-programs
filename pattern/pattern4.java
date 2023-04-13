import java.util.Scanner;

public class pattern4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        // System.out.println("enter column size");
        // int column_size = sc.nextInt();
        for (int i = row_size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
