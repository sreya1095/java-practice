import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while(t-- > 0){

            System.out.println("Enter rows and columns of first matrix:");
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();

            int[][] a = new int[n1][m1];

            System.out.println("Enter elements of first matrix:");
            for(int i = 0; i < n1; i++){
                for(int j = 0; j < m1; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter rows and columns of second matrix:");
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();

            int[][] b = new int[n2][m2];

            System.out.println("Enter elements of second matrix:");
            for(int i = 0; i < n2; i++){
                for(int j = 0; j < m2; j++){
                    b[i][j] = sc.nextInt();
                }
            }

            // Check if multiplication is possible
            if(m1 != n2){
                System.out.println("Matrix multiplication not possible");
                continue;
            }

            int[][] result = multiplyMatrices(a, b, n1, m1, m2);

            System.out.println("Resultant Matrix:");
            for(int i = 0; i < n1; i++){
                for(int j = 0; j < m2; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }

    // Function to multiply matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b, int n1, int m1, int m2){

        int[][] result = new int[n1][m2];

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m2; j++){
                for(int k = 0; k < m1; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}