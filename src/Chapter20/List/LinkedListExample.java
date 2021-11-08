package Chapter20.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static String[] people = {"James", "John", "Sarah", "Chris", "Minsu"};

    public static void main(String[] args) {
        LinkedList<String> peopleLinkedList = new LinkedList<String>(Arrays.stream(people).toList());

        // for 문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < peopleLinkedList.size(); i++) {
            System.out.print(peopleLinkedList.get(i) + "\n");
        }

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (String person : peopleLinkedList) {
            System.out.print(person + "\n");
        }

        // Collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(peopleLinkedList);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<String> iterPeople = peopleLinkedList.iterator();
        while (iterPeople.hasNext()) {
            System.out.print(iterPeople.next() + "\n");
        }
    }
}