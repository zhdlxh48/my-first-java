package Chapter20.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Java");
        hashSet.add("World"); // Duplicated data is not added.
        hashSet.add(null);

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(hashSet);
    }
}
