import java.util.Scanner;

public class calculator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the operand 1 ");
        int a = sc.nextInt();
        System.out.print("enter the operator ");
        char ch = sc.next().charAt(0);
        System.out.print("enter the operand 2 ");
        int b = sc.nextInt();

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
