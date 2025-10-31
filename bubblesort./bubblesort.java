import java.util.*; 
public class BubbleSort { 
public void bubbleSort(int[] arr) { 
int n = arr.length; 
} 
for (int i = 0; i < n - 1; i++) { 
} 
for (int j = 0; j < n - i - 1; j++) { 
if (arr[j] > arr[j+1]) { 
int temp = arr[j]; 
arr[j] = arr[j+1]; 
arr[j+1] = temp; 
} 
} 
} 
public void printArray(int[] arr) { 
for (int i = 0; i < arr.length; i++) { 
} 
System.out.print(arr[i] + " "); 
System.out.println(); 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the size of the array: "); 
int size = scanner.nextInt(); 
int[] arr = new int[size]; 
System.out.println("Enter integers:"); 
for (int i = 0; i < size; i++) { 
} 
arr[i] = scanner.nextInt(); 
BubbleSort s = new BubbleSort(); 
} 
System.out.println(" unsorted arr:"); 
for (int i = 0; i < arr.length; i++) { 
System.out.print(arr[i] + " "); 
System.out.println(); 
} 
} 
s.bubbleSort(arr); 
System.out.println("Sorted array:"); 
s.printArray(arr); 
}
