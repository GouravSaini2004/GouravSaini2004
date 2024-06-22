import java.util.*;

public class UlternateSignSumRecursion{

    public static int signsum(int n){
        if(n==0){
            return 0;
        }else if(n%2==0){
            return signsum(n-1)-n;
        }else{
            return signsum(n-1)+n;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int result = signsum(n);
        System.out.println("ulternate sign sum of given number "+result);
    }

}