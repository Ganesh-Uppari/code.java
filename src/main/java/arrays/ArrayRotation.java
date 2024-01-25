package arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        // Sample integer array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Number of positions to rotate left
        int x = 2;

        // Rotate the array left by x positions
        rotateLeft(arr, x);

        // Display the rotated array
        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to rotate the array left by x positions
    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;

        // Validate x to ensure it's within the array size
        x = x % n;

        // Temporary array to store the rotated elements
        int[] temp = new int[x];

        // Store the first x elements in the temporary array
        for (int i = 0; i < x; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = x; i < n; i++) {
            arr[i - x] = arr[i];
        }

        // Copy the elements from the temporary array back to the end
        for (int i = 0; i < x; i++) {
            arr[n - x + i] = temp[i];
        }
    }
}
