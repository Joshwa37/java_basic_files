public class ArrayUtils {

    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("Original Integer Array: " + Arrays.toString(intArray));



       
 exchangeElements(intArray, 1, 3);
        System.out.println("After exchanging elements: " + Arrays.toString(intArray));

        System.out.println("Original String Array: " + Arrays.toString(strArray));
        exchangeElements(strArray, 0, 4);
        System.out.println("After exchanging elements: " + Arrays.toString(strArray));
    }
}
