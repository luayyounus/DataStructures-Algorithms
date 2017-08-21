# Tree: Top View
You are given a pointer to the root of a binary tree. Print the top view of the binary tree. 
Top view means when you look the tree from the top the nodes you will see will be called the top view of the tree. See the example below. 
You only have to complete the function. 
For example :
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
Top View : 1 -> 2 -> 5 -> 6

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
1 2 5 6
```
#### Explanation
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
From the top only nodes 1,2,5,6 will be visible.
#### Java
```java
public class Node {
    int data;
    Node left;
    Node right;
}

public class TopView {
    public void topView(Node root) {
        if(root == null) return;
        //This will take care of left side and the top node (Grand Parent Node)
        leftSide(root);
        if(root.right != null){
            rightSide(root.right);
        }
    }
    public void leftSide(Node leftRoot){
        if(leftRoot.left != null){
            leftSide(leftRoot.left);
        }
        System.out.print(leftRoot.data + " ");
        return;
    }
    public void rightSide(Node rightRoot){
        System.out.print(rightRoot.data + " ");
        if(rightRoot.right != null){
            rightSide(rightRoot.right);
        }
        return;
    }
}
```

#### Another Solution with Static Counter
```java
public class TopView {
    public int counter = 0;

    public void topView(Node root) {
        if(root.left != null && counter >= 0){
            topView(root.left);
        }
        System.out.print(root.data + " ");
        counter--;
        if(root.right != null && counter < 0){
            counter--;
            topView(root.right);
        }
    }
}
```