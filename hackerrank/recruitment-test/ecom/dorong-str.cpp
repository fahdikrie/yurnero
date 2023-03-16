#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);



/*
 * Complete the 'dorongString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER dorongKiri
 *  3. INTEGER dorongKanan
 */

string dorongString(string s, int dorongKiri, int dorongKanan) {
    dorongKiri = dorongKiri % s.length();
    dorongKanan = dorongKanan % s.length();

    for (int i = 0; i < dorongKiri; i++) {
        int reps = (s.substr(0, 3).compare("XYZ") == 0) ? 3 : 1;

        for (int j = 0; j < reps; j++) {
            s = s.substr(1) + s.front();
        }
    }

    for (int i = 0; i < dorongKanan; i++) {
        int reps = (
            s.substr(s.length() - 3, s.length()).compare("XYZ") == 0
        ) ? 3 : 1;

        for (int j = 0; j < reps; j++) {
            s = s.back() + s.substr(0, s.length() - 1);
        }
    }

    return s;
}

string dorongStringV2(string s, int dorongKiri, int dorongKanan) {
    dorongKiri = dorongKiri % s.length();
    dorongKanan = dorongKanan % s.length();

    int diff = dorongKiri - dorongKanan;

    if (diff > 0) {
        for (int i = 0; i < abs(dorongKiri); i++) {
            int reps = (s.substr(0, 3).compare("XYZ") == 0) ? 3 : 1;

            for (int j = 0; j < reps; j++) {
                s = s.substr(1) + s.front();
            }
        }

    } else {
        for (int i = 0; i < abs(dorongKanan); i++) {
            int reps = (
                s.substr(s.length() - 3, s.length()).compare("XYZ") == 0
            ) ? 3 : 1;

            for (int j = 0; j < reps; j++) {
                s = s.back() + s.substr(0, s.length() - 1);
            }
        }
    }

    return s;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string dorongKiri_temp;
    getline(cin, dorongKiri_temp);

    int dorongKiri = stoi(ltrim(rtrim(dorongKiri_temp)));

    string dorongKanan_temp;
    getline(cin, dorongKanan_temp);

    int dorongKanan = stoi(ltrim(rtrim(dorongKanan_temp)));

    string result = dorongString(s, dorongKiri, dorongKanan);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
