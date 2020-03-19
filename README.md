# Kargo Summer intern Pre-Assessment

To run, simply run compile `main.java` using `javac main.java` and then run class file with two command line argument. 
`java main 's1' 's2'`. It is mandatory that both command line arguments must be passed in a '' single quote.

## Input Assumptions 
**Each** character in **s1** must be mapped with `s2`. This means s2 can't have less character than s1. s2 must have more than or equal to chars in s1.
Input strings s1 and s2 may contain whitespaces which would be considered as a character. 

### 

### Test cases :
1. s1 = 'abc' s2 = 'bcd'    ---> true
2. s1 = 'foo' s2 = 'bar'    ---> false
3. s1 = 'bar' s2 = 'foo'    ---> true
5. s1 = '1111' s2 = '$$$$'  ---> true
6. s1 = 'aad' s2 = 'cbc'  ---> true
7. s1 = 'aazqdddd' s2 = 'zzzzqqad'  ---> true
8. s1 = 'aazqdddd' s2 = '$$$$++{}'  ---> true
9. s1 = 'a ad' s2 = 'afa '  ---> false (observe whitespace, it can't be mapped to anything in s2)
10. s1 = 'aa' s2 = 'f'  ---> false (second 'a' in s1 can't be mapped to any character in s2)




