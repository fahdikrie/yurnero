#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string a, b;
    cin >> a >> b;

    cout << a.length() << " " << b.length();
    cout << endl;
    cout << a + b;
    cout << endl;
    cout << b[0] + a.substr(1, a.length() - 1) << " " << a[0] + b.substr(1, b.length() - 1); 
    return 0;
}