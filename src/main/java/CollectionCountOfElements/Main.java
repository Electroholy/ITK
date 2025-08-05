package CollectionCountOfElements;

import java.util.Map;

import static CollectionCountOfElements.ElementCounter.countElements;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Lion", "Lion", "Owl", "Wolf", "Wolf", "Wolf"};
        Map<String, Integer> counts = countElements(words);
        System.out.println(counts);
    }
}
