import java.util.Scanner;

public class pattern10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int row_size = sc.nextInt();
        char character = 'A';
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + " ");
                character++;
            }
            System.out.println();
        }
    }
}
