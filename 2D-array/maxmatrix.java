import java.util.Scanner;

public class maxmatrix {
    public static void matrix(int arr[][]) {

    }

    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;
        Scanner SC = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = SC.nextInt();
            }
        }
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (largest < arr[i][j]) {
                    largest = Math.max(largest, arr[i][j]);
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the largest number is " + largest);
    }
}
