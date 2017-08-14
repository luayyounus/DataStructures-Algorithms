# Get Node Value - Counting Backwards From Tail
You’re given the pointer to the head node of a linked list and a specific position. Counting backwards from the tail node of the linked list, get the value of the node at the given position. A position of 0 corresponds to the tail, 1 corresponds to the node before the tail and so on.

#### Input Format 
You have to complete the int GetNode(Node* head, int positionFromTail) method which takes two arguments - the head of the linked list and the position of the node from the tail. positionFromTail will be at least 0 and less than the number of nodes in the list. You should NOT read any input from stdin/console.

#### Constraints 
Position will be a valid element in linked list.

#### Output Format 
Find the node at the given position counting backwards from the tail. Then return the data contained in this node. Do NOT print anything to stdout/console.

#### Sample Input
```
1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 0
1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 2
```
#### Sample Output
```
6
3
```
#### Java
```java
public class GetNodeValueFromTail {
    //With an Array
    public int GetNode(Node head,int n) {
        ArrayList<Integer> linkedListArray = new ArrayList<Integer>();
        while(head != null){
            linkedListArray.add(head.data);
            head = head.next;
        }
        return linkedListArray.get(linkedListArray.size() -1 -n);
    }

    //With a second Pointer the calculates the distance between head and the pointer that is behind
    public int GetNodeWithSecondPointer(Node head, int n){
        int prevCounter = 0;
        Node prev = head;
        while(head.next != null){
            head = head.next;
            if(prevCounter < n){
                prevCounter++;
            } else {
                prev = prev.next;
            }
        }
        return prev.data;
    }
}

```