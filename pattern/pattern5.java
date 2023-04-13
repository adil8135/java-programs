import java.util.Scanner;

public class pattern5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int n = sc.nextInt();
        // System.out.println("enter column size");
        // int cn= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
