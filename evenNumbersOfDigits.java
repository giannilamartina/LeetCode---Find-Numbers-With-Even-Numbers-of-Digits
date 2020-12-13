class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int even_digits = nums[i];
            String str = Integer.toString(even_digits);
            if (str.length() % 2 == 0) {
                ++count;
            }
        }
        return count;
    }
}
