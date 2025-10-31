import java.util.*; 
public class SelectionSort { 
public void selectionSort(int[] arr) { 
int n = arr.length; 
for (int i = 0; i < n - 1; i++) { 
// Assume the first element is the minimum 
int minIndex = i; 
// Find the minimum element in the remaining array 
for (int j = i + 1; j < n; j++) { 
if (arr[j] < arr[minIndex]) { 
} 
minIndex = j; 
} 
// Swap the found minimum with the first element 
} 
} 
int temp = arr[minIndex]; 
arr[minIndex] = arr[i]; 
arr[i] = temp; 
public void printArray(int[] arr) { 
for (int value : arr) { 
} 
System.out.print(value + " "); 
System.out.println(); 
} 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the size of the array: "); 
int size = scanner.nextInt(); 
int[] arr = new int[size]; 
System.out.println("Enter integers:"); 
for (int i = 0; i < size; i++) { 
} 
arr[i] = scanner.nextInt(); 
SelectionSort s = new SelectionSort(); 
} 
} 
System.out.println("Unsorted array:"); 
s.printArray(arr); 
s.selectionSort(arr); 
System.out.println("Sorted array:"); 
s.printArray(arr); 
}
