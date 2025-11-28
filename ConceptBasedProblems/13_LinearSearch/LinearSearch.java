import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int search;
        System.out.print("Enter number of elements for integer: ");
        int n = sc.nextInt();
        int [] num = new int[n];
        System.out.print("Enter integer elements: ");
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        search = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            if(num[i] == search){
                System.out.print("\nElement "+search+" found at index position "+i);
            }
        }
    }
}
