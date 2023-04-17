public class palindrome {
    public static boolean name(String str) {
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        String str = "ada";
        System.out.println(name(str));
    }
}
