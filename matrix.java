import java.util.Scanner;

class matrix {
    public static void main(String args[]) {
        int row = 2, col = 2; // For 2x2 matrix
        int i, j;
        Scanner in = new Scanner(System.in);
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Enter the elements of matrix1 (2x2):");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix2 (2x2):");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                mat2[i][j] = in.nextInt();
            }
        }

        System.out.println("\nChoose the operation:");
        System.out.println("1. Matrix Multiplication");
        System.out.println("2. Matrix Addition");
        System.out.println("3. Matrix Transpose");
        int choice = in.nextInt();

        switch (choice) {
            case 1: // Matrix Multiplication
                System.out.println("Matrix Multiplication Result:");
                for (i = 0; i < row; i++) {
                    for (j = 0; j < col; j++) {
                        res[i][j] = 0;
                        for (int k = 0; k < col; k++) {
                            res[i][j] += mat1[i][k] * mat2[k][j];
                        }
                    }
                }
                displayMatrix(res);
                break;

            case 2: // Matrix Addition
                System.out.println("Matrix Addition Result:");
                for (i = 0; i < row; i++) {
                    for (j = 0; j < col; j++) {
                        res[i][j] = mat1[i][j] + mat2[i][j];
                    }
                }
                displayMatrix(res);
                break;

            case 3: // Matrix Transpose
                System.out.println("Transpose of Matrix 1:");
                int[][] transpose = new int[col][row]; // Corrected transpose dimensions
                for (i = 0; i < row; i++) {
                    for (j = 0; j < col; j++) {
                        transpose[j][i] = mat1[i][j];
                    }
                }
                displayMatrix(transpose);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        in.close();
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
