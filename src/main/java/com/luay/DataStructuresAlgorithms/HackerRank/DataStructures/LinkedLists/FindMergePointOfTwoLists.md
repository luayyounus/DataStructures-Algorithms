# Find Merge Point of Two Lists
Given pointers to the head nodes of 2 linked lists that merge together at some point, find the Node where the two lists merge. It is guaranteed that the two head Nodes will be different, and neither will be NULL.

In the diagram below, the two lists converge at Node x:
```
[List #1] a--->b--->c
                     \
                      x--->y--->z--->NULL
                     /
     [List #2] p--->q  
```
Complete the int FindMergeNode(Node* headA, Node* headB) method so that it finds and returns the data value of the Node where the two lists merge.

#### Input Format

The FindMergeNode(Node*,Node*) method has two parameters, headA and headB, which are the non-null head Nodes of two separate linked lists that are guaranteed to converge. 

#### Output Format

Each Node has a data field containing an integer; return the integer data for the Node where the two lists converge.

#### Sample Input
     
The diagrams below are graphical representations of the lists that input Nodes headA and headB are connected to. Recall that this is a method-only challenge; the method only has initial visibility to those 2 Nodes and must explore the rest of the Nodes using some algorithm of your own design.
 
#### Test Case 0

```
1
  \
   2--->3--->NULL
  /
 1
```

#### Test Case 1
```
1--->2
      \
       3--->Null
      /
     1
```
#### Sample Output
```
2
3
```
#### Java
```java
public class FindMergePointOfTwoLists {
    public int LinkedListLength(Node head) {
        return head.next != null ? 1 + LinkedListLength(head.next) : 1;
    }
    public int FindMergeNode(Node headA, Node headB) {
        int a = LinkedListLength(headA);
        int b = LinkedListLength(headB);
        int difference = a - b;
        if(a < b){
            Node temp = headA;
            headA = headB;
            headB = temp;
            difference = b - a;
        }
        for(int i = 0; i<difference; i++){
            headA = headA.next;
        }
        while(headA != null){
            if(headA.data == headB.data){
                return headA.data;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return 0;
    }
}

```