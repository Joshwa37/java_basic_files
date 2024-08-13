class OddEven implements Runnable {
int max;
private boolean isOdd;
private static Object lock = new Object();
private static int number = 1;
public OddEven(int max, boolean isOdd) {
this.max = max;
this.isOdd = isOdd;
}
public void run() {
while (number <= max) {
synchronized (lock) {
if ((isOdd && number % 2 != 0) || (!isOdd && number % 2 == 0)) {
System.out.println(Thread.currentThread().getName() + ": " + number);
number++;
}
}
}
}
}
public class Example {
public static void main(String[] args) {
Thread oddThread = new Thread(new OddEven(20, true), "OddThread");
Thread evenThread = new Thread(new OddEven(20, false), "EvenThread");
oddThread.start();
evenThread.start();
}
}
