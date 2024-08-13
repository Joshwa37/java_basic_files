public class Generic{
public static <T extends Comparable<T>> T findMax(T[] array) {
if (array == null || array.length == 0) {
return null; 
}
T max = array[0];
for (T element : array) {
if (element.compareTo(max) > 0) {
max = element; 
}
}
return max;
}
public static void main(String[] args) {
Integer[] intArray = {5, 2, 8, 1, 9};
Integer maxInt = findMax(intArray);
System.out.println("Maximum Integer: " + maxInt);
Double[] doubleArray = {3.3, 9.2, 5.5, 1.1};
Double maxDouble = findMax(doubleArray);
System.out.println("Maximum Double: " + maxDouble);
String[] stringArray = {"apple", "banana", "orange", "grape"};
String maxString = findMax(stringArray);
System.out.println("Maximum String: " + maxString);
}
}

