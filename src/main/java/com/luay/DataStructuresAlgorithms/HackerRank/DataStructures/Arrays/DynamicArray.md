# Dynamic Array

- Create a list, seqList, of N empty sequences, where each sequence is indexed from 0 to N - 1. The elements within each of the N sequences also use 0-indexing.
- Create an integer, lastAnswer, and initialize it to 0.
- The 2 types of queries that can be performed on your list of sequences (seqList) are described below:

1. Query: 1 x y
- Find the sequence, seq, at index ((x ^ lastAnswer) % N) in seqList.
- Append integer y to sequence seq.

2. Query: 2 x y
- Find the sequence, seq, at index ((x ^ lastAnswer) % N) in seqList.
- Find the value of element y % size in seq (where size is the size of seq) and assign it to lastAnswer.
- Print the new value of lastAnswer on a new line

#### Input Format

The first line contains two space-separated integers, N (the number of sequences) and ! (the number of queries), respectively. 
Each of the Q subsequent lines contains a query in the format defined above.

#### Output Format

For each type 2 query, print the updated value of lastAnswer on a new line.

#### Sample Input
```
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
```
#### Sample Output
```
7
3
```

#### Java
```java
public class DynamicArray {
    private static int lastAnswer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        ArrayList[] arrayList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            arrayList[i] = new ArrayList<Integer>();
        }

        for (int j = 0; j < q; j++) {
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int sequenceIndex = ((x ^ lastAnswer) % n);

            if (queryType == 1){
                arrayList[sequenceIndex].add(y);
            } else if (queryType == 2){
                ArrayList<Integer> sequence = arrayList[sequenceIndex];
                int size = sequence.size();
                int tempIndex = y % size;
                lastAnswer = sequence.get(tempIndex);
                System.out.println(lastAnswer);
            }
        }
    }
}
```
