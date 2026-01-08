//Row Sum And Column Sum

import java.util.Scanner;

class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MATRIX 1");
        System.out.print("Enter num of rows: ");
        int m1_row = sc.nextInt();
        System.out.println();
        System.out.print("Enter num of columns: ");
        int m1_col = sc.nextInt();
        System.out.println();
        int i = 0;
        int j = 0;
        
        System.out.println("Enter elements in Matrix 1: ");
        int[][] m1 = new int[m1_row][m1_col];
        for(i = 0; i<m1_row; i++){
            for (j=0; j<m1_col; j++){
                m1[i][j] = sc.nextInt();
            }
        }
           
            
        System.out.println("MATRIX : ");
        for(i = 0; i<m1_row; i++){
            for (j=0; j<m1_col; j++){
                System.out.print(m1[i][j]+ " ");
            }
            System.out.println();
        }
        int[] mat_row_sum = new int[m1_row];
        int[] mat_col_sum = new int[m1_col];
        
        for(i = 0; i<m1_row; i++){
            for (j=0; j<m1_col; j++){
                mat_row_sum[i] += m1[i][j];
            }
        }
        System.out.println("Row Sum: ");
        for(i=0; i< m1_col; i++){
            System.out.print (mat_row_sum[i]+" ");
        }
        
        
        for(i = 0; i<m1_row; i++){
            for (j=0; j<m1_col; j++){
                mat_col_sum[i] += m1[j][i];
            }
        }
        System.out.println("\nColumn Sum: ");
        for(i=0; i< m1_row; i++){
            System.out.print(mat_col_sum[i]+" ");
        }
    }
}