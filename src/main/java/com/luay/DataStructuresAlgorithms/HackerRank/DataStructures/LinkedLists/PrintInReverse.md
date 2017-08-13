# Print in Reverse 
You are given the pointer to the head node of a linked list and you need to print all its elements in reverse order from tail to head, one element per line. The head pointer may be null meaning that the list is empty - in that case, do not print anything!

#### Input Format 
You have to complete the void ReversePrint(Node* head) method which takes one argument - the head of the linked list. You should NOT read any input from stdin/console.

#### Output Format 
Print the elements of the linked list in reverse order to stdout/console (using printf or cout) , one per line.

#### Sample Input
```
1 --> 2 --> NULL 
2 --> 1 --> 4 --> 5 --> NULL
```
#### Sample Output
```
2
1
5
4
1
2
```
#### Explanation 
1. First list is printed from tail to head hence 2,1 
2. Similarly second list is also printed from tail to head.

#### Java
```java
public class PrintInReverse {
    class Node {
        int data;
        Node next;
    }
    void ReversePrint(Node head) {
        Stack<Integer> reversedLL = new Stack<Integer>();

        if (head != null) {
            Node current = head;
            while(current != null){
                reversedLL.push(current.data);
                current = current.next;
            }
            while(!reversedLL.isEmpty()){
                System.out.println((reversedLL.pop()));
            }
        }
    }
}

```