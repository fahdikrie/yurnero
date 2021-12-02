def hitung(n):
    count = 1
    diff = 1
    for i in range(n-1):
        count = count + diff
        diff += 1

    return count

print(hitung(1))
print(hitung(2))
print(hitung(3))
print(hitung(60))