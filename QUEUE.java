public class Queue {
public final int maxSize = 5;
public int[] arr = new int[maxSize];
public int R = -1;
public int F = -1;
public void enqueue(int val) {
if (R == maxSize - 1) {
System.out.println("Queue Overflow");
} else {
if (F == -1) F = 0;
arr[++R] = val;
System.out.println("Enqueued: " + val);
}
}
public void dequeue() {
if (F == -1 || F > R) {
System.out.println("Queue Underflow");
} else {
System.out.println("Dequeued: " + arr[F++]);
if (F > R) {
// Reset queue if it becomes empty
F = R = -1;
}
}
}
public void printQueue() {
if (F == -1) {
System.out.println("Queue is empty");
} else {
System.out.print("Queue: ");
for (int i = F; i <= R; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
public static void main(String[] args) {
Queue q = new Queue();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.dequeue();

q.dequeue();
q.dequeue();
q.dequeue(); // Should say "Queue Underflow"
q.enqueue(60);
q.enqueue(70);
q.printQueue();
}
}
