public class diagonal {
    public static void spiral(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 1, 2, 3 },
                { 9, 10, 11, 1 },
                { 13, 14, 15, 1 },
                { 1, 1, 1, 1, 1 } };
        spiral(matrix);
    }
}