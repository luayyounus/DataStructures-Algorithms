# Move Zeros

#### Java
```java
public class MoveZeros {
    //Time O(n)
    //space O(1)
    public void moveZeroes(int[] nums) {
        int temp;
        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j) nums[i] = 0;
                j++;
            }
        }
    }
}


```