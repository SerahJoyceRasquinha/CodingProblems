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
        
        System.out.print("Sorted array: ");
        for(int i = 0; i<n ; i++){
            for (int j = i ;j<n; j++ ){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("\nEnter Search element: ");
        int search = sc.nextInt();
        int low = 0;
        int high = n-1;
        
        int result = bin_search(arr, search, low, high);
        System.out.println();
        System.out.println("Element found at position: "+result);
        
    }  
    
    static int bin_search(int[] arr, int search, int low, int high){
        int mid = (low+high)/2;
        
        if(low > high){
            return -1;
        }
        
        if(arr[mid] == search){
            return mid+1;
        }
        
        else if(arr[mid] < search){
            return bin_search(arr,search,mid+1, high);
        }
        
        else{
            return bin_search(arr,search,low, mid-1);
        }
    }
}


        
        
        
        
        
        
        
        
        
        