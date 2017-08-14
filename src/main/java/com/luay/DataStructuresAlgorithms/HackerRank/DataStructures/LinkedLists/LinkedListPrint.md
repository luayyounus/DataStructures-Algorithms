# Print the Elements of a Linked List 
Print all elements of a linkedlist on a new line each.
#### Java
```java
public class LinkedListPrint {
    class Node {
        int data;
        Node next;
    }
    void Print(Node head) {
        if (head == null) return;
        System.out.format("%d%n",head.data);
        Print(head.next);
    }
}


```