import java.util.Scanner;

class PalindromeCheck{
    int i,j;
    String str;
    String a;
    StringBuilder b = new StringBuilder(); //String builder helps us to dynamically add characters to the string on demand but we cannot do that for strings.
    void check_pal(String s){
        str = s;
        a = s;
        for(i=a.length()-1; i>=0; i--){
            b.append(a.charAt(i));
        }
        
        if (str.equals(b.toString())){ 
            System.out.println("Palindrome");
        }//For objects (like String or StringBuilder), the '=='' does not compare contents, it compares references, i.e., whether both variables point to the exact same object in memory.
        
        //Here '==' will basically mean are: are these two references pointing to the same object?
        //.equals compares the content
        
        else{
            System.out.println("NOT");
        }
   }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PalindromeCheck pd = new PalindromeCheck();
        
        System.out.println("Enter String: ");
        String str1 = in.nextLine();
        String str2 = str1.replaceAll("\\s+", "").toLowerCase(); //Finds all sequences of whitespace in str. Replaces them with empty string "", effectively removing all whitespace.
        String str3 = str2.replaceAll("[^A-Za-z]", ""); //Removes all characters that are not letters.
        System.out.println(str3);
        pd.check_pal(str3);
        
    }
}