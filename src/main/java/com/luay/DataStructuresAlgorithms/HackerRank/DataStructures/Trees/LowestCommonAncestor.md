# Binary Search Tree : Lowest Common Ancestor
You are given pointer to the root of the binary search tree and two values *v1* and *v2*. You need to return the lowest common ancestor (LCA) of *v1* and *v2* in the binary search tree.

![](https://s3.amazonaws.com/hr-assets/0/1502911253-5a96d423eb-lca.png)

In the above example, the lowest common ancestor of the nodes **5** and **6** is the node **2**, as **2** is the lowest common node which has both the nodes **5** and **6** as it's descendants.

You only need to complete the function.

#### Input Format

You are given a function,
```
node * lca (node * root ,int v1,int v2) {

}
```
It is guaranteed that v1 and v2 are present in the tree.
#### Output Format
Return the LCA of **v1** and **v2**.

#### Sample Input
```
         4
       /   \
      2     7
     / \   /
    1   3 6
```
*v1* = **1** and  *v2* == **7**.

#### Sample Output
LCA of **1** and **7** is **4** (which is the root). 
Return a pointer to the root in this case.
#### Java
```java
public class Node {
    int data;
    Node left;
    Node right;
}

public class LowestCommonAncestor {
    public Node lcaRecursive(Node root,int v1,int v2) {
        if(root.data > v1 && root.data > v2) return lcaRecursive(root.left,v1,v2);
        if(root.data < v1 && root.data < v2) return lcaRecursive(root.right,v1,v2);
        return root;
    }
    public Node lcaNonRecursive(Node root,int v1,int v2) {
        while(true){
            if(root.data > v1 && root.data > v2) return lcaNonRecursive(root.left,v1,v2);
            if(root.data < v1 && root.data < v2) return lcaNonRecursive(root.right,v1,v2);
            else return root;
        }
    }
}
```