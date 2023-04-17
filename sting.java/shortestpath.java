import java.util.Scanner;

public class shortestpath {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int x = 0, y = 0;
        for (int i = 0; i < name.length(); i++) {
            char latter = name.charAt(i);
            if (latter == 's') {
                y--;
            }
            if (latter == 'w') {
                x--;
            }
            if (latter == 'e') {
                x++;
            }
            if (latter == 'n') {
                y++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        System.out.println(Math.sqrt(x2 + y2));
    }
}
