class DataBuffer {
private int data;
private boolean isProduced;
public synchronized void produce(int newData) {
while (isProduced) {
try {
wait();
}
catch (InterruptedException e) {
e.printStackTrace();
}
}
data = newData;
System.out.println("Produced: " + data);
isProduced = true;
notify();
}
public synchronized int consume() {
while (!isProduced) {
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Consumed: " + data);
isProduced = false;
notify();
return data;
}
}
class Producer implements Runnable {
private DataBuffer buffer;
public Producer(DataBuffer buffer) {
this.buffer = buffer;
}
public void run() {
for (int i = 0; i < 5; i++) {
buffer.produce(i);
}
}
}
class Consumer implements Runnable {
private DataBuffer buffer;
public Consumer(DataBuffer buffer) {
this.buffer = buffer;
}
public void run() {
for (int i = 0; i < 5; i++) {
buffer.consume();
}
}
}
public class ProducerConsumerExample {
public static void main(String[] args) {
DataBuffer buffer = new DataBuffer();
Thread producerThread = new Thread(new Producer(buffer));
Thread consumerThread = new Thread(new Consumer(buffer));
producerThread.start();
consumerThread.start();
}
}
