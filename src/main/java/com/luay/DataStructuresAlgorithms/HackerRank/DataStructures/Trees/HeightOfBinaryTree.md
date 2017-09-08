# Tree: Height of a Binary Tree
The height of a binary tree is the number of edges between the tree's root and its furthest leaf. This means that a tree containing a single node has a height of **0**.

Complete the getHeight function provided in your editor so that it returns the height of a binary tree. This function has a parameter, *root* , which is a pointer to the root node of a binary tree. 
**Note** -The Height of binary tree with single node is taken as zero.

#### Input Format

You do not need to read any input from stdin. Our grader will pass the root node of a binary tree to your getHeight function.

#### Output Format

Your function should return a single integer denoting the height of the binary tree.

#### Sample Input
![](https://s3.amazonaws.com/hr-challenge-images/17175/1459894869-6bb53ce6eb-BST.png)

**Note**: A binary search tree is a binary tree in which the value of each parent node's left child is less than the value the parent node, and the value of the parent node is less than the value of its right child.
#### Sample Output
```
3
```

#### Explanation

The longest root-to-leaf path is shown below:

![](https://s3.amazonaws.com/hr-challenge-images/17175/1459895368-4955f9ce74-LongestRTL.png)

There are *4* nodes in this path that are connected by *3* edges, meaning our binary tree's *height = 3* . Thus, we print *3* as our answer.
#### Java
```java
public class Node {
    int data;
    Node left;
    Node right;
}

public class HeightOfBinaryTree {
    static int height(Node root) {
        if(root == null) return -1;
        int left = 0;
        int right = 0;
        if(root.left != null){
            left = height(root.left) + 1;
        }
        if(root.right != null){
            right = height(root.right) + 1;
        }
        if(right > left) return right; else return left;
    }
    // Using Math.Max
    public static int heightWithMax(Node root){
        if(root == null) return -1;
        return 1 + Math.max(heightWithMax(root.left),heightWithMax(root.right));
    }
}


```