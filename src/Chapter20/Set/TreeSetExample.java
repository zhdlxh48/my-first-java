package Chapter20.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);

        Iterator<Integer> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(treeSet);
    }
}
