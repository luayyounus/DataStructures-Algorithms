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
import java.util.Scanner;
import java.util.Stack;

public class ArraysDS {

    static Stack<Integer> stack = new Stack();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i< n; i++){
            addToStack(scanner.nextInt());
        }
        printStack(stack, n);
    }

    public static void addToStack(int x) {
        stack.push(x);
    }

    public static void printStack(Stack<Integer> p, int limit) {
        for (int i = 0 ; i < limit ; i++){
            System.out.print(stack.pop() + " ");
        }
    }
}
```

#### Swift
```Swift
import Foundation

// number of elements
let n = Int(readLine()!)!

// read array
let arr = readLine()!.components(separatedBy: " ").map{ Int($0)! }

// iterate over the array in reverse order and print the elements separated by space
let reversedArray = arr.reversed()
for num in reversedArray {
    print("\(num)", terminator: " ")
}
```