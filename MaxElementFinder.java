import java.util.List;

public class MaxElementFinder {

    public static <T extends Comparable<? super T>> T findMax(List<T> list, int begin, int end) {
        if (list == null || list.isEmpty() || begin < 0 || end > list.size() || begin >= end) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        T maxElement = list.get(begin);

        for (int i = begin + 1; i < end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 20, 5, 30, 15);
        int maxInt = findMax(integerList, 0, integerList.size());
        System.out.println("Max integer: " + maxInt);

        List<String> stringList = List.of("apple", "banana", "cherry", "date", "fig");
        String maxString = findMax(stringList, 0, stringList.size());
        
System.out.println("Max string: " + maxString);
    }
}