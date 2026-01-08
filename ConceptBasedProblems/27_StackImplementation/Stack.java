// Stack Implementation program

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        int top = -1;
        int len = n-1;
        char ch = 'Y';
        while(ch == 'Y' || ch == 'y'){
            System.out.println("\nEnter operation you want to perform on stack: ");
            System.out.println("1 : PUSH");
            System.out.println("2 : POP");
            System.out.println("3 : PEEK");
            System.out.println("4 : EMPTY CHECK");
            System.out.println("5 : SIZE");
            System.out.print("Choice: ");
            int op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("\n===================================");
                    System.out.println("PUSH OPERATION");
                    System.out.print("Enter item you want to push: ");
                    int item = sc.nextInt();
                    if (top == len){
                        System.out.println("Stack is full");
                        System.out.println("\nThe stack Pointer TOP value: "+top);
                        break;
                    }
                    else{
                        top++;
                        arr[top] = item;
                        System.out.print("\nNew Array after push: [");
                        for(i = 0; i<=top ; i++){
                            System.out.print(arr[i]+ " ");
                        }
                        System.out.print("]");
                        System.out.println("\nThe stack Pointer TOP value: "+top);
                    }
                    System.out.println("\n===================================");
                    break;
                    
                case 2:
                    System.out.println("\n===================================");
                    System.out.println("POP OPERATION");
                    if (top == -1){
                        System.out.println("Stack is empty");
                        System.out.println("\nThe stack Pointer TOP value: "+top);
                        break;
                    }
                    
                    else{
                        top--;
                        System.out.print("\nNew Array after pop: [");
                        for(i = 0; i<=top ; i++){
                            System.out.print(arr[i]+ " ");
                        }
                        System.out.print("]");
                        System.out.println("\nThe stack Pointer TOP value: "+top);
                    }
                    System.out.println("\n===================================");
                    break;
                    
                case 3:
                    System.out.println("\n===================================");
                    System.out.println("PEEK OPERATION");
                    if (top == -1){
                        System.out.println("No element in stack");
                        break;
                    }
                    System.out.println("Most Recent Element inserted: "+arr[top]);
                    System.out.println("\nThe stack Pointer TOP value: "+top);
                    System.out.println("\n===================================");
                    break;
                
                case 4:
                    System.out.println("\n===================================");
                    System.out.println("STACK EMPTY OR NOT OPERATION");
                    if (top == -1){
                        System.out.println("Stack is empty");
                        System.out.println("\nThe stack Pointer TOP value: "+top);
                        break;
                    }
                    System.out.println("Stack is not empty");
                    System.out.println("\nThe stack Pointer TOP value: "+top);
                    System.out.println("\n===================================");
                    break;
                    
                case 5:
                    System.out.println("\n===================================");
                    System.out.println("SIZE OPERATION");
                    if (top == -1){
                        System.out.println("Stack is empty so SIZE = 0");
                        break;
                    }
                    int count = 0;
                    for(i = 0; i<=top; i++){
                        count++;
                    }
                    
                    System.out.println("Size of the array WITH elements: "+count);
                    System.out.println("\n===================================");
                    break;
            }
            System.out.println("--------------------------------");
            System.out.print("Continue(Y/N): ");
            ch = sc.next().charAt(0);
            System.out.println("\n--------------------------------");
        }
        sc.close();
    }
}