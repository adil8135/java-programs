public class stock {
    public static void buyandsale(int price[]) {

        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {

            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }
        System.out.println(maxprofit);
    }

    public static void main(String args[]) {
        int a[] = { 91, 91 };
        buyandsale(a);
    }
}