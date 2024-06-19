import java.util.*;
public class FirstOccurance{
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }

        boolean flag = false;
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("first non repeating character present at index "+i);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("no non repeating character present in string.");
        }
        sc.close();
    }
}