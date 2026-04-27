import java.util.Scanner;

public class Matrix {

    int a[][] = new int[2][2];
    int b[][] = new int[2][2];

    // input method
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first matrix (2x2):");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix (2x2):");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    // addition
    void addition() {
        System.out.println("\nAddition of matrices:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // transpose
    void transpose() {
        System.out.println("\nTranspose of first matrix:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    // sum of rows
    void sumRows() {
        System.out.println("\nSum of rows (first matrix):");
        for(int i = 0; i < 2; i++) {
            int sum = 0;
            for(int j = 0; j < 2; j++) {
                sum = sum + a[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + sum);
        }
    }

    // sum of columns
    void sumColumns() {
        System.out.println("\nSum of columns (first matrix):");
        for(int j = 0; j < 2; j++) {
            int sum = 0;
            for(int i = 0; i < 2; i++) {
                sum = sum + a[i][j];
            }
            System.out.println("Column " + (j + 1) + " = " + sum);
        }
    }

    // sum of diagonal
    void sumDiagonal() {
        int sum = 0;
        for(int i = 0; i < 2; i++) {
            sum = sum + a[i][i];
        }
        System.out.println("\nSum of diagonal = " + sum);
    }

    public static void main(String[] args) {

        Matrix m = new Matrix();

        m.input();
        m.addition();
        m.transpose();
        m.sumRows();
        m.sumColumns();
        m.sumDiagonal();
    }
}