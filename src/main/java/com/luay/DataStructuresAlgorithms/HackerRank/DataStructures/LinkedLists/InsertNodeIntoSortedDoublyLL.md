# Inserting a Node Into a Sorted Doubly Linked List
Given a reference to the head of a doubly-linked list and an integer, **data**, create a new Node object having data value data and insert it into a sorted linked list.

Complete the Node* SortedInsert(Node* head, int data) method in the editor below. It has two parameters:

**head** : A reference to the head of a doubly-linked list of Node objects.
**data** :  An integer denoting the value of the  field for the Node you must insert into the list.
The method must insert a new Node into the sorted (in ascending order) doubly-linked list whose data value is *data* without breaking any of the list's double links or causing it to become unsorted.

Note: Recall that an empty list (i.e., where *head* = **null** ) and a list with one element are sorted lists.

#### Java
```java
public class Node {
    int data;
    Node next;
    Node prev;
}
public class InsertNodeIntoSortedDoublyLL {
    Node SortedInsert(Node head,int data) {
        if(head == null){
            Node rootNode = new Node();
            rootNode.data = data;
            return rootNode;
        }
        Node current = head.next;
        Node prev = head;
        Node insertNode = new Node();
        insertNode.data = data;
        
        while(current != null){
            if(current.data < data){
                current = current.next;
                prev = prev.next;
            } else {
                prev.next = insertNode;
                insertNode.next = current;
                current.prev = insertNode;
                insertNode.prev = prev;
                return head;
            }
        }
        prev.next = insertNode;
        insertNode.prev = prev;
        return head;
    }
}

```