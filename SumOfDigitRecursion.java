import java.util.*;
public class SumOfDigitRecursion{

    public static int sum(int n){
        if(n==0){
            return n;
        }else{
            return (n%10)+sum(n/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("sum of digit of "+n+" is "+result);
    }
}