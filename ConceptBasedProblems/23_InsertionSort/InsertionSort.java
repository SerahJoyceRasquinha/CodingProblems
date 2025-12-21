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
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;
        }
        
        for(int i =0; i<n; i++){
            System.out.print(arr[i]);        
        }
    }
}



// Working : [2,9,3,8,4]
//========================================================

//--------------------------------------------------------
// OUTER LOOP : i = 1
//--------------------------------------------------------
// key = arr[i] 
// key = arr[1] 
// key = 9
//
// j = i - 1 
// j = 1 - 1 
// j = 0
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 0
// j >= 0        -> true  (j = 0)
// arr[j] > key -> 2 > 9 -> false
// Combined condition becomes false
// --------> inner while loop does NOT execute
//++++++++++++++++++++++++++++
//
// arr[j+1] = key
// arr[0+1] = 9
// arr[1] = 9
//
//############################
// Current state of array: [2,9,3,8,4]
// Sorted portion: [2,9]
//############################


//--------------------------------------------------------
// OUTER LOOP : i = 2
//--------------------------------------------------------
// key = arr[i]
// key = arr[2]
// key = 3
//
// j = i - 1
// j = 2 - 1
// j = 1
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 1
// j >= 0        -> true  (j = 1)
// arr[j] > key -> 9 > 3 -> true
//
// arr[j+1] = arr[j]
// arr[2] = arr[1]
// arr[2] = 9
//
//############################
// Current state of array: [2,9,9,8,4]
//############################
//
// j--
// j = 1 - 1
// j = 0
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 0
// j >= 0        -> true  (j = 0)
// arr[j] > key -> 2 > 3 -> false
// --------> inner while loop stops
//++++++++++++++++++++++++++++
//
// arr[j+1] = key
// arr[0+1] = 3
// arr[1] = 3
//
//############################
// Current state of array: [2,3,9,8,4]
// Sorted portion: [2,3,9]
//############################


//--------------------------------------------------------
// OUTER LOOP : i = 3
//--------------------------------------------------------
// key = arr[i]
// key = arr[3]
// key = 8
//
// j = i - 1
// j = 3 - 1
// j = 2
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 2
// j >= 0        -> true  (j = 2)
// arr[j] > key -> 9 > 8 -> true
//
// arr[j+1] = arr[j]
// arr[3] = arr[2]
// arr[3] = 9
//
//############################
// Current state of array: [2,3,9,9,4]
//############################
//
// j--
// j = 2 - 1
// j = 1
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 1
// j >= 0        -> true  (j = 1)
// arr[j] > key -> 3 > 8 -> false
// --------> inner while loop stops
//++++++++++++++++++++++++++++
//
// arr[j+1] = key
// arr[1+1] = 8
// arr[2] = 8
//
//############################
// Current state of array: [2,3,8,9,4]
// Sorted portion: [2,3,8,9]
//############################


//--------------------------------------------------------
// OUTER LOOP : i = 4
//--------------------------------------------------------
// key = arr[i]
// key = arr[4]
// key = 4
//
// j = i - 1
// j = 4 - 1
// j = 3
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 3
// j >= 0        -> true  (j = 3)
// arr[j] > key -> 9 > 4 -> true
//
// arr[j+1] = arr[j]
// arr[4] = arr[3]
// arr[4] = 9
//
//############################
// Current state of array: [2,3,8,9,9]
//############################
//
// j--
// j = 3 - 1
// j = 2
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 2
// j >= 0        -> true  (j = 2)
// arr[j] > key -> 8 > 4 -> true
//
// arr[j+1] = arr[j]
// arr[3] = arr[2]
// arr[3] = 8
//
//############################
// Current state of array: [2,3,8,8,9]
//############################
//
// j--
// j = 2 - 1
// j = 1
//
//++++++++++++++++++++++++++++
// INNER LOOP : j = 1
// j >= 0        -> true  (j = 1)
// arr[j] > key -> 3 > 4 -> false
// --------> inner while loop stops
//++++++++++++++++++++++++++++
//
// arr[j+1] = key
// arr[1+1] = 4
// arr[2] = 4
//
//############################
// Current state of array: [2,3,4,8,9]
// Sorted portion: [2,3,4,8,9]
//############################


//========================================================
// FINAL RESULT
// Sorted array: [2,3,4,8,9]
//========================================================
