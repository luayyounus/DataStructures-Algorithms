# Bubble Sort

```java
public class BubbleSort {
    public static void bubbleSort(int[] array){
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted){
            int temp;
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++){
                if(array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }
    public static void main(String[] args){
        int[] test = new int[]{1,7,9,3,5,6,4,8};
        bubbleSort(test);
        System.out.print(Arrays.toString(test));
        int a = 0;
    }
}

```