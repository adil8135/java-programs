public class spiralmatrix {

    public static void spiral(int matrix[][]) {
        int startrow = 0;
        int startcolumn = 0;
        int endrow = matrix.length - 1;
        int endcolumn = matrix[0].length - 1;

        while (startcolumn <= endcolumn && startrow <= endrow) {
            // top
            for (int j = startcolumn; j <= endcolumn; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolumn] + " ");
            }
            // bottom
            for (int i = endcolumn - 1; i >= startcolumn; i--) {
                System.out.print(matrix[endrow][i] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                System.out.print(matrix[i][startcolumn] + " ");
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 },
                { 9, 10, 11 },
                { 13, 14, 15 } };
        spiral(matrix);
    }
}
