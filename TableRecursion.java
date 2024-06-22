
import java.util.*;

public class TableRecursion{

    public static void table(int n, int i){
        if(i==1){
            System.out.println(n);
        }else{
            table(n,i-1);
            System.out.println(n*i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the itration:");
        int i = sc.nextInt();
        table(n,i);
    }
}