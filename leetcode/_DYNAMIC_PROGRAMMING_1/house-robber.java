class Solution {
    public int rob(int[] nums) {
        int len = nums.length;

        if (len < 2) {
            return nums[0];
        }

        int ptr1 = 0;
        int ptr2 = 0;

        for (int i = 0; i < len; i++) {
            int tmp = ptr2;
            ptr2 = Math.max(ptr1 + nums[i], ptr2);
            ptr1 = tmp;
        }

        return Math.max(ptr1, ptr2);
    }
}
