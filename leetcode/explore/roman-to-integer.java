class Solution {
    public final Map<String, Integer> ROMAN_TO_INT_DICT = Map.of(
        "I", 1,
        "V", 5,
        "X", 10,
        "L", 50,
        "C", 100,
        "D", 500,
        "M", 1000
    );

    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            char roman = s.charAt(i);
            String romanStr = Character.toString(roman);

            if (i < s.length() - 1) {
                char nextRoman = s.charAt(i + 1);
                String nextRomanStr = Character.toString(nextRoman);

                switch(roman) {
                    case 'I':
                        if (nextRomanStr.equals("V") || nextRomanStr.equals("X")) {
                            total -= ROMAN_TO_INT_DICT.get(romanStr);
                            break;
                        }
                    case 'X':
                        if (nextRomanStr.equals("L") || nextRomanStr.equals("C")) {
                            total -= ROMAN_TO_INT_DICT.get(romanStr);
                            break;
                        }
                    case 'C':
                        if (nextRomanStr.equals("D") || nextRomanStr.equals("M")) {
                            total -= ROMAN_TO_INT_DICT.get(romanStr);
                            break;
                        }
                    default:
                        total += ROMAN_TO_INT_DICT.get(romanStr);
                        break;
                }
            } else {
                total += ROMAN_TO_INT_DICT.get(romanStr);
            }
        }

        return total;
    }
}