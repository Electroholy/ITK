package Collection;
import java.lang.reflect.Array;

public class ArrayUtils {

    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] array, Class<T> otherClass, Filter<T> filter) {
        T[] result = (T[]) Array.newInstance(otherClass, array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }
}
