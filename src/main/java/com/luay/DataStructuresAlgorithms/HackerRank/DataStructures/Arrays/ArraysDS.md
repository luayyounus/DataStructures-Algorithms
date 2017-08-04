# Arrays - DS


Given an array, A, of N integers, print each element in reverse order as a single line of space-separated integers.

#### Input Format

The first line contains an integer, N (the number of integers in A). 
The second line contains N space-separated integers describing A.

#### Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

#### Sample Input
```
4
1 4 3 2
```
#### Sample Output
```
2 3 4 1
```

#### Java
```java
import java.io.*;
import java.util.*;

public class Solution {
    
    static Stack<Integer> theStack = new Stack<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int n = scanner.nextInt();
        int[] array = new int[n];   
        for (int i = 0; i< n; i++){
            addToStack(scanner.nextInt());
        }
        printStack(theStack, n);
    }
    
    public static void addToStack(int x) {
        theStack.push(x);
    }

    public static void printStack(Stack<Integer> p, int limit) {
        for (int i = 0 ; i < limit ; i++){
            System.out.print(theStack.pop() + " ");
        }
    }
}
```