# Collection Framework

---

![컬렉션 프레임워크의 구조](https://blog.kakaocdn.net/dn/4wkUX/btq44bqazqr/80s6KaCrGqfETw4Pk5CGqK/img.png)

## Collection Framework를 사용하는 이유

> 1. 일관된 API
>
> Collection의 일관된 API를 사용하여 Collection 밑에 있는 모든 클래스(ArrayList, Vector, LinkedList 등) Collection에서 상속받아 통일된 메서드를 사용하게 됨
>
> 2. 프로그래밍 코스트 감소
>
> 객체 지향 프로그래밍의 추상화의 기본 개념이 성공적으로 구현되어있음
>
> 3. 프로그램 속도 및 품질 향상
>
> 유용한 데이터 구조 및 알고리즘은 성능을 향상시킬 수 있습니다 Collection을 사용하여 최상의 구현을 생각할 필요없이 간단하게 Collection API를 사용하여 구현을 하면 됨

[(인용출처)](https://crazykim2.tistory.com/557)

# Collection

`Collection` 인터페이스는 `Iterable` 인터페이스를 구현하고 있음

---

## List

`List` 인터페이스는 `Collection` 인터페이스를 구현하고 있음

```java
List<E> // Generic Interface
Vector<E>, ArrayList<E>, LinkedList<E>, Stack<E> // Implemented Collection Classes
```

- 순서가 **있는** 데이터의 집합 (요소의 순서가 저장됨)

- 데이터의 **중복을 허용**

### ArrayList

- 가장 많이 사용되는 컬렉션 클래스 중 하나
- 내부적으로 배열을 이용해, 인덱스를 이용하여 객체에 빠르게 접근이 가능함
- 배열은 크기가 고정된 인스턴스이므로, 크기를 늘릴 때 새로운 배열을 생성하고 옮기는 복잡한 작업이 필요함
  - 과정은 자동화 되어있지만, 요소의 추가 및 제거 작업에 시간이 길어짐 (기존 배열보다 Cost가 듦)
- 동기화를 보장하지 않음

```java
ArrayList<String> people = new ArrayList<String>();

people.add("John");
String person1 = people.get(0);
String person2 = people.set(0, "James");
String person3 = people.remove(0);

...

// for 문과 get() 메소드를 이용한 요소의 출력
for (int i = 0; i < people.size(); i++) {
  System.out.print(people.get(i) + "\n");
}
 
// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
for (String person : people) {
  System.out.print(person + "\n");
}

// Collections.sort() 메소드를 이용한 요소의 정렬
Collections.sort(people);
 
// iterator() 메소드와 get() 메소드를 이용한 요소의 출력
Iterator<String> iterPeople = people.iterator();
while (iter.hasNext()) {
  System.out.print(iter.next() + "\n");
}

people.clear();

System.out.println(people.isEmpty ? "People list is empty" : "People list has person!");
```

- Collections.sort(<List>)
  - Collections은 컬렉션에서 동작하는 static method 만으로 구성된 클래스
  - List의 요소들을 오름차순으로 정렬함
  - 이때 List는 Comparable Interface를 구현하고 있어야 sort가 가능함

### LinkedList

- ArrayList가 배열을 사용한다는 단점을 극복하기 위해 생겨남
  - ArrayList는 순차적으로 객체를 관리한다면, LinkedList는 비 순차적으로 관리되며 이런 객체 요소들을 연결(Link)하여 구성됨
  - 내부적으로는 다르나 외부적으로 메소드, 속성들은 유사한 양상을 보이고 있음
- 내부적으로 Double Linked List를 구현하고 있음
  - Singly Linked List는 요소들이 다음 요소만을 참조하고 있어 단방향으로만 참조가 가능함
  - Doubly Linked List는 요소들이 각각 이전 요소와 다음 요소를 참조하고 있어 앞 뒤의 양방향 참조가 가능함

```java
LinkedList<String> people = new LinkedList<String>();

// 주요 메소드들은 ArrayList와 유사함
```

### Stack

- 자료구조 중 스택의 데이터 구조를 구현하기 위한 컬렉션 클래스
- 후입선출(LIFO)를 기본 원칙으로 함

```java
Stack<Integer> stack = new Stack<Integer>();

stack.push(1);
stack.push(10);
stack.push(25);
stack.push(50);
stack.push(100);

Iterator<Integer> iterator = stack.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

System.out.println("\nPop: " + stack.pop());
System.out.println("Peek: " + stack.peek() + "\n");

System.out.println("Pop: " + stack.pop());
System.out.println("Peek: " + stack.peek() + "\n");

iterator = stack.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### Vector (Legacy)

- 예전 자바 버전에서 ArrayList를 대신해서 사용하던 컬렉션 클래스
  - 마찬가지로 List<E> 인터페이스를 상속받음
  - 기존 코드와의 호환성을 이유로 남아있음
- ArrayList와는 달리 동기화를 보장함

---

## Set

```Java
Set<E> // Generic Class (의미적)
HashSet<E>, SortedSet<E>, TreeSet<E> // Implemented Collection Classes
```

- 순서가 **없는** 데이터의 집합

- 중복을 **허용하지 않음**

### HashSet

- 동일한 순서로 삽입되는 것을 보장하지 않음
- NULL 요소 삽입을 허용

```java
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

System.out.println(hashSet); // Result: [null, Hello, Java, World]
```

### LinkedHashSet

- HashSet과 대부분 동일하지만 삽입순서를 보장함

```Java
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

System.out.println(hashSet); // Result: [Hello, Java, World, null]
```

### SortedSet

- Set 인터페이스와 유사하지만 데이터의 순서를 정렬하는 메소드를 제공함

#### TreeSet

- Tree 자료구조를 사용함
- 데이터의 순서는 자연스러운 순서(오름차순)을 유지함
- NULL을 허용하지 않음 (NullPointerException)

```java
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
```

---

## Queue (TODO: 공부 후 자세하게 기술)

- 자료 구조 중 큐의 데이터 구조를 구현하기 위한 인터페이스
- 선입선출(FIFO)을 기본 원칙으로 함

### PriorityQueue

- 우선순위에 따라 객체를 처리해야 할 때 사용
- 힙 자료구조를 통해 구현됨

```java
PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

queue.add(4);
queue.add(1);
queue.add(3);
queue.add(2);
queue.add(5);

System.out.println(queue);

System.out.println(queue.peek());
System.out.println(queue);

System.out.println(queue.poll());
System.out.println(queue);

System.out.println(queue.remove());
System.out.println(queue);
```



### Deque

- 큐 구조의 변형 인터페이스

#### ArrayDeque

- 크기가 조절되는 배열
- 양쪽에서 데이터 삽입, 제거가 가능

```java
ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

deque.add(4);
deque.add(1);
deque.add(3);
System.out.println(deque);

deque.addFirst(2);
System.out.println(deque);

deque.addLast(5);
System.out.println(deque);

System.out.println(deque.peek());
System.out.println(deque);

System.out.println(deque.poll());
System.out.println(deque);

System.out.println(deque.remove());
System.out.println(deque);
```



---

# Map

Map 컬렉션 클래스들은 구조상의 문제로 Collection이 아닌 Map 인터페이스를 상속받아 구현됨

```java
Map<K, V> // Generic Class (의미적)
HashTable<K, V>, HashMap<K, V>, SortedMap<K, V> // Implemented Collection Classes
```

- 키와 값으로 이루어지는 한 쌍의 데이터들의 집합으로, 순서가 **없음**
- 키는 **중복을 허용하지 않지만**, 값은 **중복을 허용함**
  - 키를 중복해서 저장할 경우 마지막 키과 값으로 덮어쓰기됨
- 요소의 저장 순서를 보장하지 않음
- 키 값은 내부적으로 hash로 구성되어있어 삭제, 삽입, **검색**등에 용이함
- 키가 되는 객체는 객체의 유일성을 증명하기 위해 equals, hashCode 메소드를 재 정의함
  - Set 인터페이스의 Value의 유일성 증명과 유사함

### HashMap

- Hash 알고리즘을 지원해 검색속도가 매우 빠름
- 동기화를 지원함

```java
HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

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
```

### HashTable (Legacy)

- HashMap처럼 Map 인터페이스를 구현함
  - 현재는 레거시 지원을 위해 남아있음

- 동기화를 지원함

### TreeMap

- Map 인터페이스를 구현함
- 키와 값을 이진 트리 구조로 저장함 (다른 Map 인터페이스를 구현한 컬렉션 클래스와 동일하, 내부구현만 다름)
  - 데이터의 추가, 제거 등 기본 동작 속도가 매우 빠름
- NavigableMap 인터페이스를 기존의 이진 검색 트리의 성능을 향상시킨 레드-블랙 트리(Red-Black tree)로 구현

[(참고자료1)](http://www.tcpschool.com/java/java_collectionFramework_list)

[(참고자료2)](https://velog.io/@foeverna/Java-콜렉션프레임워크-Map-인터페이스)

