import java.util.Scanner;

public class pattern16 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        int number = 1;
        for (int i = 1; i <= row_size; i++) {
            for (int j = 0; j < row_size - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
            }
            number++;
            System.out.println();
        }
    }
}
