package Foundations;

public class LongestPalindrome {
    static int longestPalSubstr(String str)
    {

        // Length of given string
        int n = str.length();

        // Stores the maximum length
        int maxLength = 1, start = 0;

        // Iterate over the string
        for(int i = 0; i < str.length(); i++)
        {

            // Iterate over the string
            for(int j = i; j < str.length(); j++)
            {
                int flag = 1;

                // Check for palindrome
                for(int k = 0;
                    k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) !=
                            str.charAt(j - k))
                        flag = 0;

                // If string [i, j - i + 1]
                // is palindromic
                if (flag != 0 &&
                        (j - i + 1) > maxLength)
                {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        // Return length of LPS
        return maxLength;
    }

    // Driver Code
    public static void main (String[] args)
    {

        // Given string
        String str = "forgeeksskeegfor";

        // Function call
        System.out.print(longestPalSubstr(str));
    }
}
