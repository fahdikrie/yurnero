#!/bin/python3

import math
import os
import random
import re
import sys

from collections import deque



#
# Complete the 'dorongString' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER dorongKiri
#  3. INTEGER dorongKanan
#

# Improvement from the previous code:
#
# 1. Deque as an alternative to List
# https://docs.python.org/3/library/collections.html#deque-objects
#
# I looked up on the alternatives of .push(), .pop(), and .insert()
# (which pop(n) and insert(n) has O(n) time complexity). While Deque
# has O(1) time complexity for those same methods.
#
# 2. Use of modulo operator
# Modulo operator is used to reduce the number of shift operations
#

def dorongString(s, dorongKiri, dorongKanan):
    dq = deque(s)
    BUFFER_STRING = 'XYZ'

    dorongKiri %= len(dq)
    dorongKanan %= len(dq)

    for _ in range(dorongKiri):
        reps = -1 if ''.join(dq)[:3] != BUFFER_STRING else -3
        dq.rotate(reps)

    for _ in range(dorongKanan):
        reps = 1 if ''.join(dq)[-3:] != BUFFER_STRING else 3
        dq.rotate(reps)

    return ''.join(dq)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    dorongKiri = int(input().strip())

    dorongKanan = int(input().strip())

    result = dorongString(s, dorongKiri, dorongKanan)

    fptr.write(result + '\n')

    fptr.close()
