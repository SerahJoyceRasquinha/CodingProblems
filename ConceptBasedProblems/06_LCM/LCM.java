import java.util.Scanner;

public class LCM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of digits: ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers:  ");
        int[] nums=  new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
       int result = nums[0];
       for(int i=1; i<n; i++){
           result = lcm(result, nums[i]);
       }
       
       System.out.print(result);
    }
    
    public static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }
    
    public static int gcd(int a, int b){
        int temp;
        while(b!= 0){
            temp = b;
            b = a%b;
            a = temp;
        }
        
        return a;
    }
}