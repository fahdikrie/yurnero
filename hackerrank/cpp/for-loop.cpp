#include <iostream>
#include <cstdio>
using namespace std;

void numToString(int n)
{
    // Write your code here
    if (n == 1) {
        cout << "one";
    } else if (n == 2) {
        cout << "two";
    } else if (n == 3) {
        cout << "three";
    } else if (n == 4) {
        cout << "four";
    } else if (n == 5) {
        cout << "five";
    } else if (n == 6) {
        cout << "six";
    } else if (n == 7) {
        cout << "seven";
    } else if (n == 8) {
        cout << "eight";
    } else if (n == 9) {
        cout << "nine";
    } else {
        if (n % 2 == 0)
            cout << "even";
        else
            cout << "odd";
    }
}

int main()
{
    // Complete the code.
    int num1, num2;
    cin >> num1 >> num2;

    for (int i = num1; i <= num2; i++) {
        numToString(i);
        cout << "\n";
    }

    return 0;
}