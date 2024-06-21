import java.util.*;
public class LeatCode{
    public static void main(String[] args){
        String str = "DDII";
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=str.length();i++){
            st.push(i+1);
            if(i==str.length() || str.charAt(i)=='I'){
                while(!st.isEmpty()){
                    System.out.println(st.pop());
                }
            }
        }
    }
}