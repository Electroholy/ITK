package Collection;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};

        Filter <Integer> multiplyByTwo = o -> o * 2;

        Integer[] result = ArrayUtils.filter(numbers, Integer.class, multiplyByTwo);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
