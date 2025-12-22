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
        
        int max_el = arr[0];
        for(int i = 0; i<n ; i++){
            if (arr[i]>max_el){
                max_el = arr[i];
            }
        }
        
        int[] count_arr = new int[max_el+1];
        
        for(int i = 0; i<n; i++){
            count_arr[arr[i]]++;
        }
        
         System.out.println("\nCount Array: ");
        for(int i = 0; i<=max_el; i++){
            System.out.print(count_arr[i] + " ");
        }
        
        System.out.println("\nSorted Array: ");
        for(int i = 0; i<=max_el; i++){
            while(count_arr[i]>0){
                System.out.print(i + " ");
                count_arr[i]--;
            }
        }
        
    }       
}
        
        
        
        
        
        
        
        
        
        