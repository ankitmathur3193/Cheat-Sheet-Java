# Cheat-Sheet-Java

Generating Random Numbers
------------
```java
Random randomNum = new Random(); // Random(long seed)
Random random = new Random(System.currentTimeMillis()); // seed as current time
randomNum.nextInt();
randomNum.nextInt(bound); // [0,bound)
randomNum.nextDouble();
randomNum.nextBoolean();
random.nextLong();
```


String Operations
------------------
```java
String split[] = str.split("-| |\\.|:|!"); // Pipe is used to separate regex, escaping fullstop(\\.) also
Arrays.stream(split).map(String:: trim).filter(x->!x.isEmpty()).collect(Collectors.toList()); // Collecting non 
                                                                                        // empty string as list
                                                                                        
String input = "12345";
input.length(); // .size() is not present in String
input.charAt(4); // return 4th char
input.substring(2); // Returns substring starting from index 2
input.substring(2,5); // Returns substring starting from index 2 and ending at 4
input.equals(String s); // Do string comparison using equals.
input.indexOf('a'); // Returns index of first occurence of 'a', otherwise -1;
input.indexOf('a', 3);// Returns index of first occurence of 'a' starting fromIndex 3, otherwise -1
input.lastIndexOf('a', 3);// Returns index of last occurence of 'a' starting, otherwise -1
input.startsWith("ank"); returns true if input has prefix "ank"

input.charAt(2) - '0'; // Converting char to int value.

String.valueOf(int i); // int,long,float,double,char,boolean,object
StringBuilder sb = new StringBuilder();
int a = 0;
sb.append((char) (a+'a')); // converting int to alphabet.
sb.reverse(); // returns stringBuiler with reversed string.
sb.toString(); // return string.
```

Sorting String characters
-------------------------
```java
String original = "ankit";
char[] chars = original.toCharArray(); // convert String to charArray
Arrays.sort(chars);
String sortedString = new String(chars); // convert charArray to String
System.out.println(sortedString);
 ```
 
Array Operations
------------------
```java
Arrays.fill(arr, INTEGER.MAX_VALUE); // Only fills one dimensional arrays
List<Integer> arr = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8);
//Grouping numbers by divisibility of 3.
Map<Integer, List<Integer>> numByRemainder = arr.stream().collect(groupingBy(x -> x % 3));
```

Convert Arrays to List
-----------------------
```java
int arr[] = {1,2,3,4};
List<Integer> listOfNum = Arrays.asList(arr); 
List<Integer> listOfNum = Arrays.stream(arr).map(x->x*2).collect(Collectors.toList()); //Transform 
                                                                             // and convert to List
```

Convert List to Arrays
----------------------
```java
listofNum.toArray(new Integer[0]);// pass size 0 list
```

Sorting
-------------------------------------------------
```java
Arrays.sort(arr);
Arrays.sort(arr, Collections.reverseOrder()); // This won't work on primitve arrays, for them sort 
                                              // in ascending order and then reverse
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
PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // By default its minHeap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
minHeap.size();
minHeap.poll(); // Removes and returns head
minHeap.peek(); // Doesn't returns head
minHeap.add(element);
```

Queue
--------------------------------------------------
```java
Queue<Integer> queue = new LinkedList<>(); // Queue cannot be instatinated, its an abstract class
queue.add(element);
queue.poll(); // Returns and remove element
queue.peek(); // Returns but doesn't remove
queue.isEmpty();
queue.size();
```

Stack
-----------------------------------
```java
Stack<Integer> stack = new Stack<>();
stack.push(element);
stack.pop(); // Returns and removes top element
stack.peek(); // Returns but doesn't remove
stack.isEmpty();
stack.size();
```
TreeMap
----------------------------------
```java
TreeMap<String, Integer> treeMap = new TreeMap<>(); // keys should implements Comparable
treeMap.put("ankit", 1);
treeMap.putIfAbsent("ankit", 1);
treeMap.get("ankit"); // Returns key otherwise null
treeMap.containsKey("ankit"); // Checks for key

Set<Map.Entry<String, Integer>> entries = treeMap.entrySet(); // Key Value pairs
Iterator<Map.Entry<String, Integer>> it = entries.iterator();
while (it.hasNext()) {
    Map.Entry<String, Integer> next = it.next();
    System.out.println("Key = " + next.getKey() + " Value = " + next.getValue());
}
TreeMap<Intger,Integer> treeMap = new TreeMap();
treeMap.ceilingEntry(5); returns smallest key >=5 or null
treeMap.floorEntry(5); returns largest key <=5 or null
treeMap.ceilingKey(5); returns smallest key >=5 or null
treeMap.floorKey(5); returns largest key <=5 or null     
```

TreeSet
-----------------------------
```java
TreeSet<Integer> treeSet = new TreeSet<>(); // Datatype should be comparable
treeSet.add(1);
treeSet.ceiling(6); // returns smallest key>=6 or null
treeSet.floor(0); // returns largest key<=0 or null
treeSet.contains(3); // checks if 3 is present or not

Iterator<Integer> it = treeSet.iterator();
while (it.hasNext()) {
    System.out.printf("%d\n", it.next());
}
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

String string = "ankit , \n mathur, My name is \n yo";
Scanner scanner = new Scanner(string); // Now scanner could be used to parse String
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
  private ArrayList<Integer> adj[]; // Declare array of ArrayList

  Graph(int vertex) {
      this.vertex = vertex;
      this.adj = new ArrayList[vertex]; // Create array of size vertex
      for (int index = 0; index < vertex; ++index) {
          adj[index] = new ArrayList<>(); // Initialize every element
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
    public String toString() { // public String is important
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
Find Pivot in Binary Search
---------------------------
```java
Pivot will be smallest element in the array, and at every place 
  arr[prev]< arr[next] but not for pivot.
int findIndex(int arr[], int low, int high) {

  if (low > high) { // base case
    return -1;
  }

  if (low == high) { // search converges
    return low;
  }

  int mid = (low + high) >> 1;
  if (mid - 1 >= low && arr[mid - 1] > arr[mid]) {//mid could be the pivot
    return mid;
  }
  if (mid + 1 <= high && arr[mid] > arr[mid + 1]) {// mid+1 could be the pivot
    return mid + 1;
  }
  if (arr[low] < arr[mid]) { // all elements after pivot, will be smaller than first              return findIndex(arr, mid + 1, high);                                index       
  } else {
     return findIndex(arr, low, mid - 1);
  }

}
```
### Algo DS notes ###
BFS
------
1. While pushing elements to queue, mark them visited so they are not added to queue twice.
2. While polling just print them. Since vertex can't be added twice to a queue, don't need to 
check if it is already visited or not while polling them.

DFS
---------
1. While calling recurison mark the vertex as visited.
2. Before calling check if it is already visited or not.
3. Since recurison can't be called twice on a vertex, just print them at the top of
recurison function, don't need to check if they are already visited.
3. Don't put base case if vertex is already visited.

Dijkstra
---------
1. No need to have a visited array, just insert elements in the minHeap.
2. While insertion check, if vertex current distance is more than the new distance 
, then only insert and also update current distance.
3. After removal from queue, try for all edges again and again.
4. Loop until all distances are not finalized, after a point, you won't find any new distance smaller than
the current distance, and queue will become empty ultimately (since no new insertions are happening).

Topological Sort
----------------
1. Same as dfs, just use a stack, visit all children first than insert the parent into stack.
2. After dfs completes, print elements of stack.

# Complitation Mistakes #
1. Check that you are returning and returing correct type from function.
2. Remeber to write return type of a function.

# Miscallenous #
Use equals for comparison (String, Integer) : https://ideone.com/XJsXVp
