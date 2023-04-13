public class trapedrainwater {

    public static void traped(int height[]) {
        // left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        // right max boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = rightmax.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }
        int traped_water = 0;
        for (int i = 0; i < rightmax.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            traped_water += waterlevel - height[i];
        }

        System.out.println(traped_water);

    }

    public static void main(String args[]) {
        int a[] = { 91, 0, 0, 0, 0, 0, 0, 0, 91 };
        traped(a);
    }
}
