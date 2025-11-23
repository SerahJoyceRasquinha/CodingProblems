import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = factorial(a);
        System.out.println("Result: "+fact);
    }
    
    public static int factorial(int n){
        int num = n;
        int fact = 1;

        if (num==0 || num==1){
            return 1;
        }

        else{
            for(int i=n; i>0; i--){
                fact = fact*i;
            }
            return fact;
        }            
    }
}