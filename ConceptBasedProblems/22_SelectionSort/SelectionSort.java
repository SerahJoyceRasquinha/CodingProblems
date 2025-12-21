import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();        
        }

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;   
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        for(int i =0; i<n; i++){
            System.out.print(arr[i]);        
        }
    }
}

// we use i<n-1 and not i<n because by the time the iteration n-1 is excuted, the last element is already sorted. So we eliminate an extra iteration by using n-1 and not n.