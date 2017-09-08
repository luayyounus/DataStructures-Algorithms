# Tree: Insertion
You are given a pointer to the root of a binary search tree and a value to be inserted into the tree. Insert this value into its appropriate position in the binary search tree and return the root of the updated binary tree. You just have to complete the function.

#### Output Format
Return the root of the binary search tree after inserting the value into the tree.

#### Sample Input
```
        4
       / \
      2   7
     / \
    1   3
```
The value to be inserted is 6.

#### Sample Output
```
         4
       /   \
      2     7
     / \   /
    1   3 6
```
#### Java
```java
public class NodeTree {
    public int data;
    public NodeTree right,left;
}

public class Insertion {
    public NodeTree Insert(NodeTree root,int value) {
        if(root == null){
            NodeTree nodeToInsert = new NodeTree();
            nodeToInsert.data = value;
            nodeToInsert.left = null;
            nodeToInsert.right = null;
            root = nodeToInsert;
        }
        if(root.data > value){
            root.left = Insert(root.left, value);
        } else if (root.data < value){
            root.right = Insert(root.right, value);
        }
        return root;
    }
}


```