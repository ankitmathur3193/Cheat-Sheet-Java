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
String split[] = str.split("-| |\\.|:|!"); // Pipe is used to separate regex, escaping fullstop(\\.) also.
Arrays.stream(split).map(String:: trim).filter(x->!x.isEmpty()).collect(Collectors.toList()); // Collecting non 
                                                                                        // empty string as list.
```

Array Operations
------------------
```java
Arrays.fill(arr, INTEGER.MAX_VALUE); // Only fills one dimensional arrays.
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
Arrays.sort(arr, Collections.reverseOrder()); // This won't work on primitve arrays, for them sort 
                                              // in ascending order and then reverse.
Collections.reverse(Arrays.asList(arr)); // Reverse a list
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
PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // By default its minHeap.
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

File Reading 
----------------------------------
```java
FileReader fileReader = null;
try {
    fileReader = new FileReader("/Users/mathurankit/Desktop/input.txt");
} catch (FileNotFoundException e) {
    System.out.println("File not found");
}
Scanner scanner = new Scanner(fileReader); // Pass fileReader
while (scanner.hasNextLine()) {
    System.out.println(scanner.nextLine());
}
scanner.close();
```
        
File Writing
---------------------------------
```java
FileWriter fileWriter = null;
try {
    fileWriter = new FileWriter("/Users/mathurankit/Desktop/output.txt");
} catch (IOException e) {
    System.out.println("Can't write file.");
}
PrintWriter printWriter = new PrintWriter(fileWriter);
printWriter.println("My name is Ankit.");

printWriter.flush(); // Its important, otherwise data won't be written
printWriter.close();
 ```

Scanner 
-----------------------------
```java
Scanner scanner = new Scanner(System.in); // Pass System.in
while (scanner.hasNext()) {
    if (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
    }
    if (scanner.hasNextInt()) {
        System.out.println(scanner.nextInt());
    }
    if (scanner.hasNextDouble()) {
        System.out.println(scanner.nextDouble());
    }
}
scanner.close();
```
Wrapper classes
------------------------------
```java
Integer.MAX_VALUE; // Long,Float,Double
Integer.MIN_VALUE;
Integer.parseInt(String s); 
Long.parseLong(String s);
Double.parseDouble(String s);
Float.parseFloat(String s);
```
Graph Decalaration (Adjaceny List)
-------------------------------
```java
class Graph {
  private int vertex;
  private LinkedList<Integer> adj[]; // Declare array of LinkedList

  Graph(int vertex) {
      this.vertex = vertex;
      this.adj = new LinkedList[vertex]; // Create array of size vertex
      for (int index = 0; index < vertex; ++index) {
          adj[index] = new LinkedList<>(); // Initialize every element
      }
  }
}
```
Sample Pair class implementing compareTo, equals and hasCode
------------------------
```java
class Pair implements Comparable<Pair> {
    int x;
    int distance;

    @Override
    public int compareTo(Pair obj) { // public int is important
        return distance - obj.distance;
    }

    @Override
    public boolean equals(Object o) { // public boolean is important
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                distance == pair.distance;
    }

    @Override
    public int hashCode() { // public int is important
        return Objects.hash(x, distance);
    }

    @Override
    public String toString() { // public toString is important
        return "Pair{" +
                "x=" + x +
                ", distance=" + distance +
                '}';
    }
    
    Pair(int x, int distance) {
        this.x = x;
        this.distance = distance;
    }
}
```
### Algo DS notes ###
BFS
------
1. While pushing elements to queue, mark them visited so they are not added to queue twice.
2. While polling just print them.
