# Stacks: Balanced Brackets
A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:

- It contains no unmatched brackets.
- The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

[Link to Problem on HackerRank](https://www.hackerrank.com/challenges/balanced-brackets)

#### Java
```java
public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> bracketsStack = new Stack<>();

        char[] charArray;
        charArray = s.toCharArray();

        for(char c: charArray){
            if(c == '{'){
                bracketsStack.push('}');
            } else if(c == '['){
                bracketsStack.push(']');
            } else if(c == '('){
                bracketsStack.push(')');
            } else if(bracketsStack.isEmpty() || c != bracketsStack.pop()){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
```