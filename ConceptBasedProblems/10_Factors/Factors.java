import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            if (num%i == 0){
                System.out.print(i+",");
            }
        } 
    }
}


