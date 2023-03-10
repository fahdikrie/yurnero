class Solution {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<>();

        for (char ch: s.toCharArray()) {
            switch (ch) {
                case '(':
                    stc.push(Character.valueOf(')'));
                    break;
                case '{':
                    stc.push(Character.valueOf('}'));
                    break;
                case '[':
                    stc.push(Character.valueOf(']'));
                    break;
                default:
                    if (stc.isEmpty() || stc.pop() != ch) {
                        return false;
                    }
            }
        }

        return stc.isEmpty();
    }
}
