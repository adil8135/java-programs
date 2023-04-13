import java.util.Scanner;

public class pattern17 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        for (int i = 1; i <= row_size; i++) {
            int number = row_size + 1;
            for (int j = 0; j < row_size - i; j++) {
                System.out.print(" ");
                number--;
            }
            for (int j = 1; j <= i; j++) {
                number--;
                System.out.print(number);
            }
            for (int j = 1; j < i; j++) {
                number++;
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
