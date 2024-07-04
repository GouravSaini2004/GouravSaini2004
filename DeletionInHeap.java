import java.util.*;

public class DeletionInHeap{

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp; 
    }

    public static void print(int[] arr , int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int deleteRoot(int[] arr, int n){
        if (n == 0)
            return 0;

        // Swap the root (index 0) with the last element
        swap(arr, 0, n - 1);

        // Decrease the size of heap by 1
        n--;

        // Heapify down from root node
        heapify(arr, n, 0);

        return n;
    }

    public static void heapify(int[] arr, int n, int i){
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child = 2*i + 1
        int right = 2 * i + 2; // right child = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest); // Recursively heapify the affected sub-tree
        }
    }

    public static void main(String[] args){
        int[] arr = {100,70,60,40,50,30};
        int n = 6;

        System.out.println("Before deletion:");
        print(arr, n);

        n = deleteRoot(arr, n);

        System.out.println("After deletion:");
        print(arr, n);
    }    

}