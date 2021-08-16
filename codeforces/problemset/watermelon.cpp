#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;

    if (n % 2 != 0 | n == 2) {
        cout << "NO";
        return 0;
    }

    cout << "YES";
    return 0;
}