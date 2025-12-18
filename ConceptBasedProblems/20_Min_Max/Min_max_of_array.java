import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            a[i] = sc.nextInt();
        }
        
        int min = a[0];
        for(int i = 0; i<n; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum value of array: "+min);
        
        int max = a[0];
        for(int i = 0; i<n; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum value of array: "+max);
    }
}

