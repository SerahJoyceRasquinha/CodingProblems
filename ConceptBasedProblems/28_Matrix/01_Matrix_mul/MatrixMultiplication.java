//Matrix Multiplication of 2 matrices.

import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MATRIX 1");
        System.out.print("Enter num of rows: ");
        int m1_row = sc.nextInt();
        System.out.println();
        System.out.print("Enter num of columns: ");
        int m1_col = sc.nextInt();
        System.out.println();
        System.out.println("MATRIX 2");
        System.out.print("Enter num of rows: ");
        int m2_row = sc.nextInt();
        System.out.println();
        System.out.print("Enter num of columns: ");
        int m2_col = sc.nextInt();
        System.out.println();
        if(m1_row != m2_col){
            System.out.println("Cannot perform matrix multiplication on these matrices");
        }
        
        else{
            System.out.println("Enter elements in Matrix 1: ");
            int[][] m1 = new int[m1_row][m1_col];
            for(int i = 0; i<m1_row; i++){
                for (int j=0; j<m2_col; j++){
                    m1[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("MATRIX 1: ");
            for(int i = 0; i<m1_row; i++){
                for (int j=0; j<m2_col; j++){
                    System.out.print(m1[i][j]+ " ");
                }
                System.out.println();
            }
            
            System.out.println("Enter elements in Matrix 2: ");
            int[][] m2 = new int[m2_row][m2_col];
            for(int i = 0; i<m2_row; i++){
                for (int j=0; j<m2_col; j++){
                    m2[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("MATRIX 2: ");
            for(int i = 0; i<m1_row; i++){
                for (int j=0; j<m2_col; j++){
                    System.out.print(m2[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            int[][] matrix_mul = new int[m1_row][m2_col];
            System.out.println("Matrix Multiplication");
            for(int i = 0; i<m1_row ; i++){
                for (int j = 0; j<m2_col; j++){
                    for(int k = 0; k<m1_row; k++){
                        matrix_mul[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }
            for(int i = 0; i<m1_row ; i++){
                for (int j = 0; j<m2_col; j++){
                    System.out.print(matrix_mul[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}