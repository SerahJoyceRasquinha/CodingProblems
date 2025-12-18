import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter "+(i+1)+" number: ");
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(arr[0]);
        for(int i=1; i< arr.length; i++){
            if (arr[i] != unique.get(unique.size()-1)){
                unique.add(arr[i]);
            }
        }
        System.out.println();
        System.out.print("The unique elemets in array are: ");
        for(int i = 0; i< unique.size(); i++){
          System.out.print(unique.get(i)+" ");  
        }
        
        ArrayList<Integer> count = new ArrayList<>();
        for (int i=0; i<unique.size(); i++){
            int num_count = 0;
            for(int j=0; j<arr.length; j++){
                if(unique.get(i)==arr[j]){
                    num_count++;
                }
            }
            count.add(num_count);
        }
        System.out.println();
        for(int i = 0; i< count.size(); i++){
          System.out.println("The number "+unique.get(i)+" occurs: "+count.get(i)+" times."); 
        }
        
    }
}


//Explanation of the 2nd for loop
// We use unique.get(unique.size()-1) because this will compare based on the index of the dynamic size of the array "unique".
//we cannot directly use: unique.get(i-1) because, 
// suppose number of elements is 5
// elements are 2,2,2,4,4
// 2 is added into unique (arr[0] is added).
// then next element is arr[1] = 2 which is compared to unique.get(i-1) => 2 is compared with unique.get(0) => 2 is compared with 2...its the same so the elements is not added.
//size of unique DOES NOT CHANGE, but the index pointer in loop is changing for arr[]
//now at i=2, arr[2] = 2 is compared with unique.get(i-1) => unique.get(2-1) => unique.get(1)
//But unique(1) DOES not exist and hence is out of bounds.