import java.util.*;

public class TailingProblemRecursion{

    public static int getWays(int n){
        if(n<=3){
            return n;
        }

        return getWays(n-1)+getWays(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of tail:");
        int n = sc.nextInt();
        int result = getWays(n);
        System.out.println("number of ways for "+result);

    }
}