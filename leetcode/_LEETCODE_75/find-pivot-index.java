class Solution {
    public int pivotIndex(int[] nums) {
        int leftHandSum = 0;
        int rightHandSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rightHandSum = 0;

            if (i < nums.length - 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    rightHandSum += nums[j];
                }
            }

            if (leftHandSum == rightHandSum) {
                return i;
            }

            leftHandSum += nums[i];
        }

        return -1;
    }
}
