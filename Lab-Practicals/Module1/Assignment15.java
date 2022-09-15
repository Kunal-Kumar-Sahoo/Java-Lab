import java.util.*;

class Assignment15 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter dimensions of first matrix: ");
        int rows1 = sc.nextInt(); int cols1 = sc.nextInt();

        System.out.println("Enter dimensions of second matrix: ");
        int rows2 = sc.nextInt(); int cols2 = sc.nextInt();

        int[][] mat1 = new int[rows1][cols1];
        int[][] mat2 = new int[rows2][cols2];

        System.out.println("Enter elements of first matrix:");
        inputMatrix(mat1);

        System.out.println("Enter elements of second matrix:");
        inputMatrix(mat2);

        System.out.println("Given matrices:");
        printMatrix(mat1);
        System.out.println();
        printMatrix(mat2);

        System.out.println("Product of above matrices:");
        printMatrix(multiplyMatrix(mat1, mat2));
    }

    static void printMatrix(int[][] mat) {
        for(int i=0; i<mat.length; i++)
            System.out.println(Arrays.toString(mat[i]));
    }

    static void inputMatrix(int[][] mat) {
        for(int i=0; i<mat.length; i++)
            for(int j=0; j<mat[i].length; j++)
                mat[i][j] = sc.nextInt();
    }

    static int[][] multiplyMatrix(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length; int cols1 = mat1[0].length;
        int rows2 = mat2.length; int cols2 = mat2[0].length;

        if(cols1 != rows2) {
            System.out.println("Enter matrices of compatible dimensions");
            return new int[][] {{0}};
        }
        
        int[][] mat3 = new int[rows1][cols2];

        for(int i=0; i<rows1; i++)
            for(int j=0; j<cols2; j++)
                for(int k=0; k<rows2; k++)
                    mat3[i][j] += mat1[i][k] * mat2[k][j];

        return mat3;
    }
}
