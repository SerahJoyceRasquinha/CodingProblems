import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = oddsum(a);
        System.out.println("Result: "+result);
    }
    
    public static int oddsum(int n){
        int num = n;
        int odd_sum = 0;
        for(int i=0; i<=num; i++){
            if(i%2 == 0){
                continue;
            }
            
            else{
                odd_sum = i+odd_sum;
            }
        }
        return odd_sum;
    }
}