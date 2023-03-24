import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetMain {
    public static void main(String[] args) {

        Map<String, Integer> stringMap = new HashMap<>();

        split(stringMap);
        showKeys(stringMap);

    }
    private static void split(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");

        for (String token : tokens) {
            String word = token;
            map.put(word,1);
        }
    }

    private static void showKeys(Map<String, Integer> map) {
        Set<String> keys = map.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        for (String key : sortedKeys)
            System.out.printf(key + '\n');
    }
}