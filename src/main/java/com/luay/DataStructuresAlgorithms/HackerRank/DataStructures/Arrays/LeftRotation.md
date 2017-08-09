# Left Rotation

A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.

#### Input Format

The first line contains two space-separated integers denoting the respective values of n (the number of integers) and d (the number of left rotations you must perform). 
The second line contains n space-separated integers describing the respective elements of the array's initial state.

#### Output Format

Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.
#### Sample Input
```
5 4
1 2 3 4 5
```
#### Sample Output
```
5 1 2 3 4
```

#### Java
```java
public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> originalArray = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            originalArray.add(((i+n-d)%n) , scanner.nextInt());
        }

        for (int k = 0; k < n; k++){
            System.out.print(originalArray.get(k) + " ");
        }
    }
}

```

```swift
let n = Int(readLine()!)!
let d = Int(readLine()!)!

var arrayOfEle = readLine()!.components(separatedBy: " ").map{ Int($0)! }

for index in -1..<d {
    let removedItem = arrayOfEle.remove(at: 0)
    arrayOfEle.append(removedItem)
}

for num in arrayOfEle {
    print("\(num)", terminator: " ")
}
```
