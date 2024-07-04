import java.util.*;


public class InsertionInHeap{

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

    public static void heapify(int[] arr, int i){
        //find parent
        int parent = (i-1)/2;
        if(arr[parent]>0){
            //check that current node is grater than parent node or not if grater so, swap
            if(arr[i]>arr[parent]){
                swap(arr,i,parent);
                heapify(arr,parent);
            }
        }
    }

    public static int insertion(int[] arr, int value,int n){
        n++;
        arr[n-1]=value;
        heapify(arr,n-1);
        return n;
    }

    public static void main(String[] args){
        int MAX = 100;
        int arr[] = new int[MAX];
        arr[0] = 100;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 80;
        int n= 6;
        System.out.println("before insertion");
        print(arr,n);
        n = insertion(arr,90,n);
        System.out.println("after insertion");
        print(arr,n);

    }
}