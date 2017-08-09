# Sparse Arrays
There is a collection of N strings ( There can be multiple occurences of a particular string ). Each string's length is no more than 20 characters. There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of N strings.

#### Input Format
The first line contains N, the number of strings.
The next N lines each contain a string.
The N + 2nd line contains Q, the number of queries.
The following Q lines each contain a query string.

#### Sample Input
```
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
```
#### Sample Output
```
2
1
0
```
#### Explanation
Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.

#### Java
```java
public class SparseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<String>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            namesList.add(scan.next());
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++) {
            int count = 0;
            String checkingString = scan.next();
            for(String word : namesList) {
                if(word.equals(checkingString))
                    count++;
            }
            System.out.println(count);
        }
    }
}

```
