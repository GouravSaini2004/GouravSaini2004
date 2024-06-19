import java.util.*;

public class ValidParanthsis{
    public static boolean isvalid(String str){
        char arr[] = str.toCharArray();
        Stack<Character> map = new Stack<>();

        for(char ele: arr){
            if(ele == '(' || ele == '{' || ele =='['){
               map.push(ele);
            continue;
            }else if(map.empty()){
               return false;
            }
            char top = map.pop();
        if(top == '(' && ele != ')'){
            return false;
        }else if(top =='{' && ele != '}'){
            return false;
        }else if(top == '[' && ele != ']'){
            return false;
        }

        }
        return(map.empty()==true);
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        System.out.println("is givan string valid "+isvalid(str));
        sc.clode();
    }
}