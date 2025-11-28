import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements for integer: ");
        int n = sc.nextInt();
        int [] num = new int[n];
        System.out.print("Enter integer elements: ");
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Reversed elements: ");
        for(int i=n-1; i>=0; i--){
            System.out.print(num[i]);
        }
        
        
        System.out.print("\n\nEnter number of elements for characters: ");
        int n1 = sc.nextInt();
        char [] chars = new char[n1];
        System.out.print("Enter character elements: ");
        for(int i=0; i<n1; i++){
            chars[i] = sc.next().charAt(0);
        }
        System.out.print("Reversed elements: ");
        for(int i=n1-1; i>=0; i--){
            System.out.print(chars[i]);
        }
    }
}

