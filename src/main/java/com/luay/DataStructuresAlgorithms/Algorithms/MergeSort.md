# Merge Sort

```java
public class MergeSort {
    public static void mergeSort(int[] array){
        int[] newArray = new int[array.length];
        mergeSort(array, newArray, 0, array.length-1);
    }
    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return;

        int middle = (leftStart + rightEnd)/2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);

    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        //Left overs from either arrays
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);

    }

    public static void main(String[] args){
        int[] test = new int[]{1,7,9,3,5,6,4,8};
        mergeSort(test);
        System.out.print(Arrays.toString(test));
    }
}

```