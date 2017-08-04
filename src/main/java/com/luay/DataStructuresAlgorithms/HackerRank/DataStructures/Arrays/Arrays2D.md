# 2D Array - DS


Given a 6 x 6 2D Array, A:
```aidl
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
```aidl
a b c
  d
e f g
```

There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.

[Task]
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

#### Input Format

There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.

#### Output Format

Print the largest (maximum) hourglass sum found in A.

#### Sample Input
```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```
#### Sample Output
```
19
```

#### Explanation
A contains the following hourglasses:
 
```aidl
1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
```

The hourglass with the maximum sum (19) is:
```aidl
2 4 4
  2
1 2 4
```


#### Java
```java
import java.io.*;
import java.util.*;

public class Solution {
    public static int[][] array2d = new int[6][6];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                array2d[i][j] = scanner.nextInt();
            }
            
        }
        int largestHourGlass = checkHourGlasses(array2d);
        System.out.print(largestHourGlass);
    }
    public static int checkHourGlasses(int[][] hgArray){
        int sum = 0;
        int max = -999;
        for (int j = 0; j < 4; j++){
            for(int i = 0; i < 4; i++){
                for(int k = i;k < i + 3; k++){
                    for(int l = j; l < j + 3; l++){
                        sum += hgArray[k][l];
                    }
                }
                sum -= hgArray[i+1][j];
                sum -= hgArray[i+1][j+2];
                if (sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        return max;
    }
}
```