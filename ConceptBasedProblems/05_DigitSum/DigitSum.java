import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int digitsum = sum_digit(a);
        System.out.println("Result: "+digitsum);
    }
    
    public static int sum_digit(String n){
        char s;
        int digsum = 0;
        for(int i=n.length()-1; i>=0; i--){
            s = n.charAt(i);
            digsum += s - '0';  
        }
// here we cannot use type casting i.e: (int)s + digsum because the type casting causes that character to be converted to its ASCII integer value. So to convert this to an integer, we are subrtacting a base ASCII value from the given character and then there will be implicit type casting done by the compiler itself (converting char to int)

        return digsum;
    }
}