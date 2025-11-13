import java.util.Scanner;
import java.util.ArrayList;

public class summation{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        Solution s1 = new Solution();
        //System.out.println("Enter numbers in format x,y,z...");
        String a = in.nextLine();
        //System.out.println("Enter target number");
        int b = in.nextInt();
        s1.func(a, b);
    }
}

class Solution {
    void func(String a, int b){
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int i,j;
        int cast;
        String test = a;
        int target = b;
        
        for(i=0; i<a.length(); i++){
            char ch1 = a.charAt(i);
            if (ch1 ==','){
                continue;
            }
            else{
                cast = Character.getNumericValue(ch1);
                list1.add(cast);
            }
        }
        for (i=0; i<list1.size(); i++){
            int ch2 = list1.get(i);
            for(j=i+1;j<list1.size();j++){
                int ch3 = list1.get(j);
                if(ch2+ch3 == target){
                    System.out.println(ch2+","+ch3);
                }
            }
        }
        
    }
}