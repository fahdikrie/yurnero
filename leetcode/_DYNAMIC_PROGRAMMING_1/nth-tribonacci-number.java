class Solution {
    public int tribonacci(int n) {
        if (n < 2) {
            return n;
        }

        if (n == 2) {
            return 1;
        }

        List<Integer> fibList = new ArrayList<>();
        fibList.add(0);
        fibList.add(1);
        fibList.add(1);

        for (int i = 3; i <= n; i++) {
            fibList.add(fibList.get(i-3) + fibList.get(i-2) + fibList.get(i-1));
        }

        return fibList.get(n);
    }
}
