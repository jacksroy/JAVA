import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        // 1️⃣ HashSet – No order, no duplicates
        Set<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // duplicate
        hashSet.add(30);
        hashSet.add(null); // allowed

        System.out.println("HashSet (No order, unique):");
        System.out.println(hashSet);
        System.out.println();

        // 2️⃣ LinkedHashSet – Insertion order preserved
        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10); // duplicate
        linkedHashSet.add(30);
        linkedHashSet.add(null); // allowed

        System.out.println("LinkedHashSet (Insertion order):");
        System.out.println(linkedHashSet);
        System.out.println();

        // 3️⃣ TreeSet – Sorted order, no null
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        // treeSet.add(null); // ❌ NullPointerException

        System.out.println("TreeSet (Sorted order):");
        System.out.println(treeSet);
        System.out.println();

        // 4️⃣ Common Set operations
        System.out.println("Set Operations:");
        System.out.println("HashSet contains 20? " + hashSet.contains(20));
        System.out.println("Size of HashSet: " + hashSet.size());

        hashSet.remove(10);
        System.out.println("HashSet after removing 10: " + hashSet);
        System.out.println();

        // 5️⃣ Traversing a Set using for-each
        System.out.println("Traversing LinkedHashSet:");
        for (Integer i : linkedHashSet) {
            System.out.println(i);
        }
        System.out.println();

        // 6️⃣ Traversing using Iterator
        System.out.println("Traversing TreeSet using Iterator:");
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
