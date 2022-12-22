import java.util.Random;
import java.util.Scanner;

public class Main {
    // Function to generate random numbers
    static int[] generateRandomNumbers(int[] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        return arr;
    }

    // Function to sort the array using bubble sort in ascending order
    static int[] bubbleSortAscending(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Function to sort the array using bubble sort in descending order
    static int[] bubbleSortDescending(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Function to print the array to the screen
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Main function
    public static void main(String[] args) {
        int n = 1000;
        int[] arr = new int[n];

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // While the user doesn't want to quit
        while (userInput != "5") {
            // Print the menu
            System.out.println("Choose an option: ");
            System.out.println("1. Generate random values for the array");
            System.out.println("2. Print the array");
            System.out.println("3. Bubble sort the array in ascending order");
            System.out.println("4. Bubble sort the array in descending order");
            System.out.println("5. Quit the program");

            // Get the user input
            userInput = scanner.nextLine();

            // Insert random numbers into the array
            if (userInput.equals("1")) {
                arr = generateRandomNumbers(arr, n);
            }

            // Print the current array
            else if (userInput.equals("2")) {
                printArray(arr, n);
            }
            
            // Sort the array in ascending order
            else if (userInput.equals("3")) {
                arr = bubbleSortAscending(arr, n);
            }

            // Sort the array in descending order
            else if (userInput.equals("4")) {
                System.out.println("4");
            } 
            
            // Exit the program
            else if (userInput.equals("5")) {
                break;
            } 
            
            // Else, invalid input
            else {
                System.out.println("Invalid input");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
