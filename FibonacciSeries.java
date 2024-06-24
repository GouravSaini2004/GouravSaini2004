import java.util.*;
public class FibonacciSeries{

    public static int[] fibonacci(int n){
        if (n <= 0) {
            return new int[0]; // Return an empty array if n <= 0
        }

        int[] fibonacci = new int[n];
        
        // Handle base cases
        if (n >= 1) {
            fibonacci[0] = 0; // First Fibonacci number
        }
        if (n >= 2) {
            fibonacci[1] = 1; // Second Fibonacci number
        }
        
        // Generate Fibonacci sequence
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int result[] = fibonacci(n);
        System.out.println("sum of series is "+Arrays.toString(result));
    }
}