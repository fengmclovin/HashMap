import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        Map<Integer, String> myHashMap = new HashMap<>();

        // Adding elements to the HashMap
        myHashMap.put(1, "One");
        myHashMap.put(2, "Two");
        myHashMap.put(3, "Three");
        myHashMap.put(4, "Four");

        // Accessing elements by key
        System.out.println("Value at key 2: " + myHashMap.get(2));  // Output: Two

        // Checking if a key exists
        System.out.println("Does key 5 exist? " + myHashMap.containsKey(5));  // Output: false

        // Checking if a value exists
        System.out.println("Does value 'Three' exist? " + myHashMap.containsValue("Three"));  // Output: true

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<Integer, String> entry : myHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element by key
        myHashMap.remove(3);

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + myHashMap.size());  // Output: 3
    }
}
