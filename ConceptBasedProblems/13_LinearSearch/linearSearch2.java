import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter Search element: ");
        int search = sc.nextInt();
        int pos = 0;
        
        for(int i = 0; i<n ; i++){
            if(arr[i] == search){
                pos = i+1;
                break;
            }
        }
        
        System.out.println("Element found at position: "+pos);
        
    }       
}
        
        
        
        
        
        
        
        
        
        