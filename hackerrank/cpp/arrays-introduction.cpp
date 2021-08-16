#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int size;
    cin >> size;
    int nums[size];

    for (int i = size - 1; i >= 0; i--)
        cin >> nums[i];

    for (int i = 0; i < size; i++)
        printf("%d ", nums[i]);

    return 0;
}