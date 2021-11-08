package Chapter20.Set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<String>();

        hashSet.add("Hello");
        hashSet.add("Java");
        hashSet.add("World");
        hashSet.add("World"); // Duplicated data is not added.
        hashSet.add(null);

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(hashSet);
    }
}
