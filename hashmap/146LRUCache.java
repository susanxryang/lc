import java.util.*;

public class LRUCache146 {
  private int cap;

  public LRUCache146(int capacity) {
    cap = capacity;
  }

  // letter to value hashmap
  // letter priority queue
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  Queue<Integer> val = new LinkedList<>();

  public int get(int key) {
    if (!map.containsKey(key)) {
      return -1;
    }
    // remove previous from priority queue, put in new
    val.remove(key);
    val.offer(key);
    return map.get(key);
  }

  public void put(int key, int value) {
    // put and remove from treemap
    // put the newest one into hashmap
    if (map.containsKey(key)) {
      val.remove(key);
      // val.offer(key);
    }
    // remove previous from priority queue, put in new
    if (val.size() >= cap) { // if at capacity
      map.remove(val.poll()); // remove from map and val
    } else{ // just update 

    }
    map.put(key, value);
    val.add(key);
  }
}
