### **Lesson 1: An Introduction, and the ABCs**
match:
- abcdefg
- abcde
- abc

```
abc?[a-z]
```

or

```
abc
```

### **Lesson 1½: The 123s**
match:
- abc123xyz
- define "123"
- var g = 123;

```
123
```

### **Lesson 2: The Dot**
match:
- cat
- 896.
- ?=+.

skip:
- abc1

```
...\.
```

### **Lesson 3: Matching specific characters**
match:
- can
- man
- fan

skip:
- dan
- ran
- pan

```
[^drp]an
```

or

```
[cmf]an
```

### **Lesson 4: Excluding specific characters**
match:
- hog
- dog

skip:
- dog

```
[^b]og
```

### **Lesson 5: Character ranges**
match:
- Ana
- Bob
- Cpc

skip:
- aax
- bby
- ccz

```
[A-Z]
```

or

```
[A-C][n-p][a-c]
```

### **Lesson 6: Catching some zzz's**
match:
- wazzzzzup
- wazzzup

skip:
- wazup

```
waz{3,}up
```

or

```
waz{3,5}up
```

### **Lesson 7: Mr. Kleene, Mr. Kleene**
match:
- aaaabcc
- aabbbbc
- aacc

skip:
- a

```
a*b*c+
```

or

```
aa+b*c+
```

### **Lesson 8: Characters optional**
match:
- 1 file found?
- 2 files found?
- 24 files found?

skip:
- No files found.

```
\d+ files? found\?
```

