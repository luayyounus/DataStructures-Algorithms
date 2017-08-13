# Print the Elements of a Linked List 

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