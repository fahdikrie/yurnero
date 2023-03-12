class Solution {
    public int climbStairs(int n) {
        /**
            1 -> 1 (1)
            2 -> 11 2 (2)
            3 -> 111 12 21 (3)
            4 -> 1111 112 121 211 22 (5)
            5 -> 11111 1112 1121 1211 2111 122 212 221 (8)
            6 -> 111111 11112 11121 11211 12111 21111 1122 1212 1221 2121 2112 2211 222 (13)
        */

        LinkedList<Integer> stairs = new LinkedList<>();
        stairs.add(1);
        stairs.add(2);

        for (int i = 2; i < n; i++) {
            stairs.add(stairs.get(i-2) + stairs.get(i-1));
        }

        return stairs.get(n-1);
    }
}
