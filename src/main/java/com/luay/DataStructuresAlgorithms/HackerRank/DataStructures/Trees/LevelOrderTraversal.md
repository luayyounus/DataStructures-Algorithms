# Tree: Level Order Traversal
You are given a pointer to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. You only have to complete the function. For example:
```
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
```
For the above tree, the level order traversal is 1 -> 2 -> 5 -> 3 -> 6 -> 4.

#### Output Format
Print the values in a single line separated by a space.

#### Sample Input
```
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
```
#### Sample Output
```
1 2 5 3 6 4
```
#### Explanation
We need to print the nodes level by level. We process each level from left to right. 
Level Order Traversal: 1 -> 2 -> 5 -> 3 -> 6 -> 4.
#### Java
```java
public class Node {
    int data;
    Node left;
    Node right;
}

public class LevelOrderTraversal {
    void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
    }
}


```