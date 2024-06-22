import java.util.*;
public class PowerRecursion{

    public static int power(int a, int b){
        int result=0;
        if(b<=1){
            return a;
        }else{
            result = a*power(a,b-1);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("enter the power:");
        int p  = sc.nextInt();
        int result = power(n,p);
        System.out.println("power of "+n+" is "+result);
    }
}