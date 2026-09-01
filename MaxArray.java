import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements (N): ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume the first element is the largest
        int max = arr[0];

        // Find the largest element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Display the result
        System.out.println("Largest element = " + max);

        sc.close();
    }
}