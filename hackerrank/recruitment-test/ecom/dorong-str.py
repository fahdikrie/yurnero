

#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'dorongString' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER dorongKiri
#  3. INTEGER dorongKanan
#


# Use Deque for better performance
# https://stackoverflow.com/questions/23487307/python-deque-vs-list-performance-comparison
# https://docs.python.org/3/library/collections.html#collections.deque
def dorongString(s, dorongKiri, dorongKanan):
    lst = list(s)
    BUFFER_STRING = ['X', 'Y', 'Z']

    for i in range(dorongKiri):
        if lst[0:3] != BUFFER_STRING:
            lst.append(lst.pop(0))
            continue

        for j in range(3):
            lst.append(lst.pop(0))

    for i in range(dorongKanan):
        if lst[len(lst)-3:len(lst):1] != BUFFER_STRING:
            lst.insert(0, lst.pop(len(lst) - 1))
            continue

        for j in range(3):
            lst.insert(0, lst.pop(len(lst) - 1))

    return "".join(lst)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    dorongKiri = int(input().strip())

    dorongKanan = int(input().strip())

    result = dorongString(s, dorongKiri, dorongKanan)

    fptr.write(result + '\n')

    fptr.close()

