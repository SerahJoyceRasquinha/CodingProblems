import java.util.Scanner;
import java.util.ArrayList;

class Solution{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String brack = input.next();
        Solution s1 = new Solution();
        s1.func(brack);
    }
    
    void func(String brack){
        int flag = 1;
        int i;
        String s = brack;
        
        int len = s.length();
        if (len%2 != 0){
            System.out.println("False");
        }
        
        else{
            int div = len/2;
            ArrayList<String> arr1 = new ArrayList<>();
            ArrayList<String> arr2 = new ArrayList<>();

            for(i=0; i<div; i++){
                char ch = s.charAt(i);
                arr1.add(String.valueOf(ch));
            }
            
            //System.out.println(arr1);
            
            for(i=div; i<len; i++){
                char ch = s.charAt(i);
                arr2.add(String.valueOf(ch));
            }
            //System.out.println(arr2);
            
            for(i=0; i<div; i++){
                if ((arr1.get(i).equals("(") && arr2.get(div-i-1).equals(")") )||(arr1.get(i).equals("[")  && arr2.get(div-i-1).equals("]") )||(arr1.get(i).equals("{")  && arr2.get(div-i-1).equals("}") )){
                    flag = 1;
                    continue;
                }
                
                else{
                    flag=0;
                    break;
                }
            }
            
            if (flag==1){
                System.out.println("True");
            }
            
            else{
                System.out.println("False");
            }
            
        }
        
    }
}

