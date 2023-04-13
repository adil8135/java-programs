public class subarray {

    public static void pair(int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                int total = 0;
                System.out.print("(");
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + ", ");
                    total += array[k];
                }
                System.out.print(")");
                System.out.println("total of subarray is : " + total);
                if (min > total) {
                    min = total;
                }
                if (max < total) {
                    max = total;
                }
            }
            System.out.println("\n");
        }
        System.out.println("the minimum value is : " + min);
        System.out.println("the maximum value is : " + max);
    }

    // kadane's
    public static void kadanes(int array[]) {
        int cs = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            cs = cs + array[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max, cs);
        }
        System.out.println("the maximum value is : " + max);
    }

    public static void main(String args[]) {
        int a[] = { 2, -4, -6, -8, -10 };
        pair(a);
        kadanes(a);
    }
}