class Pair<K, V> {
private K key;
private V value;
public Pair(K key, V value) {
this.key = key;
this.value = value;
}
public K getKey() {
return key;
}
public V getValue() {
return value;
}
public String toString() {
return "(" + key + ", " + value + ")";
}
}
public class Multiple{
public static void main(String[] args) {
Pair<String, Integer> pair1 = new Pair<>("Age", 25);
System.out.println("Pair 1: " + pair1);
Pair<String, Double> pair2 = new Pair<>("Price", 19.99);
System.out.println("Pair 2: " + pair2);
Pair<Integer, String> pair3 = new Pair<>(1, "One");
System.out.println("Pair 3: " + pair3);
}
}
