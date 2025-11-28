import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modd;
        int rev = 0;
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        int temp = num;
        while(temp>0){
            modd = temp%10;
            temp = temp/10;
            rev = rev*10 + modd;
        }
        
        System.out.println(rev);
        
        if (num == rev){
            System.out.println("Number is palindrome");
        }
        
        else{
            System.out.println("Number is not palindrome");
        }
    }
}

