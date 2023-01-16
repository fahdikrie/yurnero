#include <string>

std::string countSheep(int number) {
    if (number == 0) {
        return "";
    }

    std::string stringBuilder = "1 sheep...";

    if (number == 1) {
        return stringBuilder;
    }

    int i;
    for (i = 2; i <= number; i++) {
        stringBuilder += std::to_string(i) + " sheep...";
    }

    return stringBuilder;
}