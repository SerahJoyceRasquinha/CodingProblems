import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end range for fibonacci series:");
        int num = sc.nextInt();
        int i;
        
        if (num==1){
            System.out.println("0");
        }
        
        else if (num==2){
            System.out.println("0,1");
        }
        
        else{
            int a = 0;
            int b = 1;
            System.out.print(a+","+b);
           for (i=0; i<num; i++){
                int c = a+b;
                System.out.print(","+c);
                a = b;
                b = c;
            } 
        }
    }
}

// Logic: For the first 2 values of fibonacci series, 0 and 1 is stored in a and b (and is also printed if the end range is 1 or 2) because there is no said way as to how to obtain 0 and 1 through a loop as there is nothing before zero (no positive number) and thus will result in an iteration of 10 zeroes..

// Now we store 0 and 1 in a and b respectively and use the swapping technique to shift the position of both a and b in the series.

//Iteration 1: a=0, b=1, c=a+b=1 then a=b=> 1, b=c=> 1
//Iteration 2: a=1, b=1, c=a+b=2 then a=b=> 1, b=c=> 2
//Iteration 3: a=1, b=2, c=a+b=3 then a=b=> 2, b=c=> 3
//Iteration 4: a=2, b=3, c=a+b=5 then a=b=> 3, b=c=> 5
//etc...
