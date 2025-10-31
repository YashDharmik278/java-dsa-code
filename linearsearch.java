import java.util.Scanner;

public class LinearSearch {
public static int linearSearch(int[] arr, int key) {
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");

if (arr[i] == key) {
return i;
}
}
return -1;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int n = sc.nextInt();

int[] numbers = new int[n];

System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
numbers[i] = sc.nextInt();

}

System.out.print("Enter target to search: ");
int key = sc.nextInt();

int result = linearSearch(numbers, key);

if (result == -1) {
System.out.println(" ");
System.out.println("Element not found!");
} else {
System.out.println(" ");
System.out.println("Element " + key + " found at index: " + result);
}

}
}
