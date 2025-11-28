import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp,i,j;
        System.out.print("Enter number of elements for integer: ");
        int n = sc.nextInt();
        int [] num = new int[n];
        System.out.print("Enter integer elements: ");
        for(i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            for(j=0;j<n;j++){
                if(num[j] > num[i]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(i=0; i<n; i++){
            System.out.print(num[i]);
        }
    }
}
