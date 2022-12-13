package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int result = 0;
        for (int number: nums) {
            result ^= number;
            // Logical XOR operator
            System.out.println(result);
        }
    }
}
