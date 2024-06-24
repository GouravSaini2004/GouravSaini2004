
import java.util.*;
public class BinarySearch{

    public static int binary(int arr[], int l, int h, int t){
        if(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==t){
                return mid;
            }else if(arr[mid]<t){
                return binary(arr,mid+1,h,t);
            }else{
                return binary(arr,l,mid-1,t);
            // }else{
            //     return -1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the tergat element: and please entered in sorted fashion:");
        int t = sc.nextInt();

        int result = binary(arr,0,n-1,t);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}