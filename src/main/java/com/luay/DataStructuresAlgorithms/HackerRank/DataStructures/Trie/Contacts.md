# Tree: Top View

#### Java
```java
public class Contacts {

    public static class TrieNode {
        public HashMap<Character, TrieNode> children = new HashMap<>();
        public boolean isFinal;
        public int size = 0;
    }

    // Fast with Recursion
    public static TrieNode root = new TrieNode();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String operation = scan.next();
            String contact = scan.next();
            if (operation.equals("add")) {
                add(root, contact, 0);
            } else if (operation.equals("find")) {
                System.out.println(find(root, contact, 0));
            }
        }
        scan.close();
    }


    private static void add(TrieNode current, String word, int index) {
        current.size++;

        if (index == word.length()){
            current.isFinal = true;
            return;
        }

        char c = word.charAt(index);
        if (!current.children.containsKey(c)) {
            TrieNode newNode = new TrieNode();
            current.children.put(c, newNode);
        }
        add(current.children.get(c), word, index + 1);
    }



    public static int find(TrieNode root, String word, int index) {
        TrieNode current = root;

        for (int i=0; i < word.length(); i++){
            char c = word.charAt(i);
            if (!current.children.containsKey(c)){
                return 0;
            } else {
                current = current.children.get(c);
            }
        }
        return current.size;
    }
}
```
#### Without Recursion
```java
{
    public static ArrayList<String> contacts = new ArrayList<String>();

    public static void main(String[] args) {

        addContact("hack");
        addContact("hackerrank");

        System.out.println(findPartial("hac"));
        System.out.println(findPartial("hak"));

    }

    public static void addContact(String name){
        if (!(name.length() >= 1) || !(name.length() <= 21)) {
            return;
        }

        if (contacts.isEmpty()) {
            contacts.add(name);
            return;
        }

        if (contacts.size() >= 1 && contacts.size() <= 100000) {
            if (contacts.contains(name)) {
                return;
            } else {
                contacts.add(name);
            }
        }
    }

    public static int findPartial(String partial) {
        int partialCount = 0;
        if ((partial.length() >= 1) || (partial.length() <= 21)) {
            if (!contacts.isEmpty()) {
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).contains(partial)) {
                        partialCount += 1;
                    }
                }
            }
            return partialCount;
        }
        return partialCount;
    }
}
```