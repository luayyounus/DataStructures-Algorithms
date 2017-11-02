# Hash Tables - Ransom Note

[Ransom Note - HackerRank](https://www.hackerrank.com/challenges/ctci-ransom-note)

#### Java
```java

public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        List<String> magazine = new ArrayList<String>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine.add(in.next());
        }
        List<String> ransom = new ArrayList<String>();
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom.add(in.next());
        }

        int i = 0;
        boolean replica = true;
        if(n <= 30000 && m <= 30000){
            while(i < n){
                if(magazine.contains(ransom.get(i)) && ransom.get(i).length() <= 5){
                    magazine.remove(ransom.get(i));
                    i++;
                } else {
                    replica = false;
                    break;
                }
            }
        }
        System.out.println(replica ? "Yes" : "No");
    }
}


```