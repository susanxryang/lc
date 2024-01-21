import java.util.*;

public class StockPrice2034 {
    TreeMap<Integer, Integer> record = new TreeMap<>(); // from time stamps to price
    TreeMap<Integer, Set<Integer>> vals = new TreeMap<>(); // from price to time stamps

    public void update(int timestamp, int price) {
        if (record.containsKey(timestamp)) {
            int prevPrice = record.get(timestamp);
            Set<Integer> book = vals.get(prevPrice); // get this price from vals
            book.remove(timestamp);
            if (book.isEmpty()) {
                vals.remove(prevPrice);
            }
        }
        vals.putIfAbsent(price, new HashSet<>());
        vals.get(price).add(timestamp);
        record.put(timestamp, price);
    }

    public int current() {
        return record.lastEntry().getValue();
    }

    public int maximum() {
        return vals.lastKey(); // get the highest price
    }

    public int minimum() {
        return vals.firstKey(); // get lowest price (min node)
    }
}
