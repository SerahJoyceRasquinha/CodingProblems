import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers to be generated: ");
        int a = sc.nextInt();
        Fibonacci f = new Fibonacci();
        f.check(a);
    }
}

class Fibonacci{
    void check(int n){
        if(n==0){
            System.out.println("None");
        }
        
        else if(n==1){
            System.out.println("0");
        }
        
        else if(n==2){
            System.out.println("0, 1");
        }
        
        else{
            int x = 0;
            int y = 1;
            int z = 0;
            System.out.print(x+ " "+y);
            fib_swap(x,y,z,n);
            
        }
    }
        
        void fib_swap(int a, int b, int c, int n){
            if(n>2){
                c = a+b;
                System.out.print(" "+c);
                a = b;
                b = c;
                n--;
                fib_swap(a,b,c,n);
            }
            
        }
        
    
}