import java.util.Scanner;
public class CarList {
Node head;
// Node class to store car name and pointer to next
static class Node {
String data;
Node next;
Node(String data) {
this.data = data;
this.next = null;
}
}
public CarList() {
head = null;
}
// Add a new car to the list
public void addCar(String carName) {
Node newNode = new Node(carName);
if (head == null) {
head = newNode;
} else {
Node current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
}
}
// Input car names from the user
public void inputCarNames() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter car names (press Enter without typing to stop):");
int n = 5; // Maximum number of cars
int count = 0;
while (count < n) {
System.out.print("Car name: ");
String input = sc.nextLine();
if (input.isEmpty()) {

break;
}
addCar(input);
count++;
}
sc.close(); // Close scanner
}
// Display the list of car names
public void displayCarNames() {
System.out.println("Car names in the list:");
Node current = head;
if (current == null) {
System.out.println("List is empty.");
return;
}
while (current != null) {
System.out.println(current.data);
current = current.next;
}
}
public static void main(String[] args) {
CarList list = new CarList();
list.inputCarNames();
list.displayCarNames();
}
