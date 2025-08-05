package CollectionCountOfElements;
import java.util.HashMap;
import java.util.Map;

public class ElementCounter {

    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> result = new HashMap<>();
        for (T element : array) {
            result.put(element, result.getOrDefault(element, 0) +1);
        }
        return result;
    }
}
