# Cheat-Sheet-Java

Generating Random Numbers
------------
```java
Random randomNum = new Random(); // Random(long seed)
randomNum.nextInt();
randomNum.nextInt(bound) // [0,bound)
randomNum.nextDouble();
randomNum.nextBoolean();
random.nextLong();
```


String Operations
------------------
```java
String split[] = str.split("-| |\\.|:|!"); // pipe is used to separate regex, escaping fullstop(\\.) also.
Arrays.stream(split).map(String:: trim).filter(x->!x.isEmpty()).collect(Collectors.toList()); // Collecting non 
                                                                                        // empty string as list.
```

Convert Arrays to List
-----------------------
```java
int arr[] = {1,2,3,4};
List<Integer> listOfNum = Arrays.asList(arr); 
List<Integer> listOfNum = Arrays.stream(arr).map(x->x*2).collect(Collectors.toList()); //Transform 
                                                                             // and convert to List.
```

Convert List to Arrays
----------------------
```java
listofNum.toArray(new Integer[0]);// pass size 0 list.
```

Sorting
-------------------------------------------------
```java
Arrays.sort(arr);
Arrays.sort(arr, Collections.reverseOrder()); // This won't work on primitve arrays, for them sort in 
                                              // ascending order and then reverse.
Collections.reverse(Arrays.asList(arr1)); // Reverse a list
Collections.sort(list,Colletions.reverseOrder());

Arrays.sort(
        someClasses,
        (first, second) -> { //Custom sorting
          if (first.element1 == second.element1) {
            return first.element2 - second.element2; // Ascending order
          }
          return second.element1 - first.element1; // Descending order
        });
```

PriorityQueue
--------------------------------------------------
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
minHeap.size();
minHeap.poll(); // Removes and returns head.
minHeap.peek(); // Doesn't returns head.
minHeap.add(element);
```

Queue
--------------------------------------------------
```java
Queue<Integer> queue = new LinkedList<>(); // Queue cannot be instatinated, its an abstract class.
queue.add(element);
queue.poll(); // Returns and remove element.
queue.peek(); // Returns but doesn't remove.
queue.isEmpty();
queue.size();
```

Stack
-----------------------------------
```java
Stack<Integer> stack = new Stack<>();
stack.push(element);
stack.pop(); // Returns and removes top element.
stack.peek(); // Returns but doesn't remove.
stack.isEmpty();
stack.size();
```

