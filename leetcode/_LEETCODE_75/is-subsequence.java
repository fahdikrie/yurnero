class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;

        int ptrS = 0;

        for (int ptrT = 0; ptrT < t.length(); ptrT++) {
            if (t.charAt(ptrT) == s.charAt(ptrS)) {
                ptrS++;
            }

            if (ptrS >= s.length()) {
                return true;
            }
        }

        return false;
    }
}
