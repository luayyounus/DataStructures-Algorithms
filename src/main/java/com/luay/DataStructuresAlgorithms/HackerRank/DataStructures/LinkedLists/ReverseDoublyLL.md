# Reverse a Doubly Linked List
You’re given the pointer to the head node of a doubly linked list. Reverse the order of the nodes in the list. The head node might be NULL to indicate that the list is empty.

#### Input Format 
You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the doubly linked list. You should NOT read any input from stdin/console.

#### Output Format 
Change the *next* and *prev* pointers of all the nodes so that the direction of the list is reversed. Then *return* the head node of the reversed list. Do NOT print anything to stdout/console.

#### Java
```java
public class Node {
    int data;
    Node next;
    Node prev;
}
public class ReverseDoublyLL {
    public Node Reverse(Node head) {
        if(head == null || head.next == null) return head;
        Node current = Reverse(head.next);
        head.next.next = head;
        head.prev = head.next;
        head.next = null;
        return current;
    }
}
```