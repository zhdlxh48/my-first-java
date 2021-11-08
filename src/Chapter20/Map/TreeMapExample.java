package Chapter20.Map;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> hashMap = new TreeMap<Integer, String>();

        hashMap.put(0, "Hello");
        hashMap.put(2, "World");
        hashMap.put(1, "Null");
        hashMap.put(3, null);

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            var key = iterator.next();
            System.out.println(key + ": " + hashMap.get(key));
        }

        System.out.println();

        boolean bk = hashMap.containsKey(1);
        boolean bv = hashMap.containsValue("World");

        System.out.println(String.format("Key 1 is %b, Value \"World\" is %b", bk, bv));

        System.out.println();

        hashMap.remove(3);
        hashMap.replace(1, "Java");

        System.out.println("Get key 1 value: " + hashMap.get(1));

        System.out.println();

        for (var key :
                hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
