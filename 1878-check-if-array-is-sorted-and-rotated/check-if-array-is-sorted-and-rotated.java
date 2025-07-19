class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare each element with the next (wrap around with %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // If more than 1 drop, not a rotated sorted array
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
