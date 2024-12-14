package Deviation;

public class MainClass {
    public static void main(String[] args) {
        // Create a Pair instance with a String key and Integer value
        Pair<String, Integer> pair = new Pair<>("Age", 30);

        // Access the key and value
        String key = pair.getKey();
        Integer value = pair.getValue();

        // Print the key and value
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}