# Print the Elements of a Linked List 
Print all elements of a linkedlist on a new line each.
#### Java
```java
public class Node {
    int data;
    Node next;
}
public class LinkedListPrint {
    void Print(Node head) {
        if (head == null) return;
        System.out.format("%d%n",head.data);
        Print(head.next);
    }
}


```