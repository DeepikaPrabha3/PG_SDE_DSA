package Array;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("isPalindrome = " + isPalindromeNumber(25352));
    }

    private static boolean isPalindromeNumber(int x) {

            //negative numbers are not palindrome
            if (x < 0)
                return false;

            // initialize how many zeros
            int div = 1;
            while (x / div >= 10) {
                div *= 10;
            }
        System.out.println("div = " + div);

            while (x != 0) {
                int left = x / div;
                int right = x % 10;

                if (left != right)
                    return false;

                x = (x % div) / 10;
                System.out.println("x = " + x);
                div /= 100;
                System.out.println("div next value   = " + div);
            }

            return true;
        }

}