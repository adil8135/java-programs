import java.util.Scanner;

public class pattern8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        int number = 1;
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
