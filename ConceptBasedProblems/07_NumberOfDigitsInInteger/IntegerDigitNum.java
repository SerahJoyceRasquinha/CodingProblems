mport java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int modd;
        System.out.print("Enter integer: ");
        int num = sc.nextInt();
        while(num>0){
            modd = num%10;
            num = num/10;
            count++;
        }
        System.out.println("Number of digits: "+count);
    }
}
