import java.util.Scanner;

class Solution {
    int num_i, num_j;
    int a;
    int i,j,k;
    void func (int n) {
        num_i = n;
        num_j = n;
        a = n;
        for(k=n; k>0; k--){
            for(i=num_i;i>0;i--){
                for(j=num_j; j>0;j--){
                    System.out.print(a);
                }
                a--;
            }
            num_j--;
            a = n;
            System.out.print(" ");
        }
    }
    public static void main(String[] args){
        int inp;
        Solution s1 = new Solution();
        Scanner input = new Scanner(System.in);
        inp = input.nextInt();
        s1.func(inp);
    }
}
