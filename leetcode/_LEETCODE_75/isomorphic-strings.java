class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char ptr1 = ' ';
        char ptr2 = ' ';

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sChar = Character.valueOf(s.charAt(i)); 
            Character tChar = Character.valueOf(t.charAt(i));

            if (
                sMap.get(sChar) != null &&
                !sMap.get(sChar).equals(tChar)
            ) {
                return false;
            }

            if (
                tMap.get(tChar) != null &&
                !tMap.get(tChar).equals(sChar)
            ) {
                return false;
            }

            sMap.put(sChar, tChar);
            tMap.put(tChar, sChar);
        }

        return true;
    }
}
