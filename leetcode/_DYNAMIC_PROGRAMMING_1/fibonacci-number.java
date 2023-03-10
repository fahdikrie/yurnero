class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        List<Integer> fibList = new ArrayList<>();
        fibList.add(1);
        fibList.add(1);

        for (int i = 2; i <= n; i++) {
            fibList.add(fibList.get(i-1) + fibList.get(i-2));
        }

        return fibList.get(n - 1);
    }
}
