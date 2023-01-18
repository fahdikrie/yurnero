#include <iostream>

class Solution {
public:
    void reverseString(vector<char>& s) {
        int p1, p2;
        p1 = 0;
        p2 = s.size() - 1;

        swapper(s, p1, p2);
    }

    void swapper(vector<char>& s, int p1, int p2) {
        if (p1 > p2) {
            return;
        }

        char temp = s[p1];
        s[p1] = s[p2];
        s[p2] = temp;

        swapper(s, p1 + 1, p2 - 1);
    }
};