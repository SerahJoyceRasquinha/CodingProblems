import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        String a = sc.next();
        int digitsum = sum_digit(a);
        System.out.println("Result: "+digitsum);
    }
    
    public static int sum_digit(String n){
        char ch1;
        int digsum = 0;
        
        for(int i=n.length()-1; i>=0; i--){
            ch1 = n.charAt(i);
            if((ch1 == '0') || (ch1 == '1') || (ch1 == '2') || (ch1 == '3') || (ch1 == '4') || (ch1 == '5') || (ch1 == '6') || (ch1 == '7') || (ch1 == '8') || (ch1 == '9')){
                digsum += ch1 - '0'; 
            }
            
            else{
                    System.out.println("Invalid Integer");
                    break; 
                }
        }

        return digsum;
    }
}

// here we cannot use type casting i.e: (int)s + digsum because the type casting causes that character to be converted to its ASCII integer value. So to convert this to an integer, we are subrtacting a base ASCII value from the given character and then there will be implicit type casting done by the compiler itself (converting char to int)