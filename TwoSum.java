import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the tergat");
        int t = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == t && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
            } else if (map.containsKey(t - arr[i]) && (t-arr[i] != arr[i])) {
                if (t - arr[i] > i) {
                    result[0] = i;
                    result[1] = map.get(t - arr[i]);
                }
            }
        }
        System.out.println("array is ["+result[0]+","+result[1]+"]");
        sc.close();
    }
}