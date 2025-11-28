import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char ch;
        for(int i=str.length()-1; i>=0; i--){
            ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
