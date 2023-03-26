class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;

        int ptr1 = cost[0];
        int ptr2 = cost[1];

        for (int i = 2; i < len; i++) {
            int minCost = cost[i] + Math.min(ptr1, ptr2);
            ptr1 = ptr2;
            ptr2 = minCost;

            System.out.println(i);
            System.out.println(minCost);
            System.out.println("");
        }

        return Math.min(ptr1, ptr2);
    }
}
