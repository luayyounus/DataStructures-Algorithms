# Game Of Two Stacks
[Link to Problem on HackerRank](https://www.hackerrank.com/challenges/game-of-two-stacks)

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