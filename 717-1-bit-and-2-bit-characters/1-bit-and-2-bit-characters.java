public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;

        while (i < n - 1) {
            if (bits[i] == 1) {
                i += 2; // 2-bit character: skip next
            } else {
                i += 1; // 1-bit character
            }
        }

        // If we land on the last bit exactly, it's a 1-bit character
        return i == n - 1;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] bits1 = {1, 0, 0};
        int[] bits2 = {1, 1, 1, 0};

        System.out.println(sol.isOneBitCharacter(bits1)); // true
        System.out.println(sol.isOneBitCharacter(bits2)); // false
    }
}
