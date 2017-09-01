# Stacks: Maximum Element
You have an empty sequence, and you will be given **N** queries. Each query is one of these three types:
```
1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
```
#### Input Format

The first line of input contains an integer, **N**. The next **N** lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

#### Output Format

For each type **3** query, print the maximum element in the stack on a new line.

#### Sample Input
```
10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
```
#### Sample Output
```
26
91
```

#### Java
```java
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> max = new Stack<>();
        max.push(0);

        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            int type = scan.nextInt();
            if(type == 1){
                int x = scan.nextInt();
                stack.push(x);
                if(stack.peek() >= max.peek()) {
                    max.push(stack.peek());
                }
            }
            if(type == 2){
                if(stack.peek() == max.peek()){
                    max.pop();
                }
                stack.pop();
            }
            if(type == 3){
                System.out.println(max.peek());
            }
        }
        scan.close();
    }
}

```