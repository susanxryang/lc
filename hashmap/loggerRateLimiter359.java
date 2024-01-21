import java.util.HashMap;

public class loggerRateLimiter359 {
    HashMap<String, Integer> map = new HashMap<>();
    // hashmap of string to last printed time

    public boolean ShouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message) || timestamp - map.get(message) >= 10){ // if message not found, can print
            map.put(message, timestamp);
            return true;
        }

        return false;
    }

}
