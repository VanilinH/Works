import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;



public class home {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

// task 1
        System.out.println("Task 1");
        int[][] py = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

// Pyramid
        System.out.println("Pyramid:");
        for (int[] row : py) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

// reverse of it
        System.out.println("Reverse:");
        for (int i = py.length - 1; i >= 0; i--) {
            for (int val : py[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // task 2
        System.out.println("\nTask 2");

        double[][] arr = new double[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rng.nextDouble() * 50;
                if (i % 2 != 0 || j % 2 != 0) {
                    arr[i][j] = sqrt(arr[i][j]);
                }
            }
        }
        printMatrix(arr);

        // task 3
        System.out.println("\nTask 3");
        System.out.println("Enter 5x5 matrix:");

        double[][] mat = new double[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Determinant: " + det(mat));

        // task 4
        System.out.println("\nTask 4");
        System.out.print("Size: ");
        int n = sc.nextInt();

        double[][] m = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = abs(rng.nextInt(30));
            }
        }
        printMatrix(m);

        System.out.print("Row: ");
        int rr = sc.nextInt();
        System.out.print("Col: ");
        int cc = sc.nextInt();

        double[][] mm = makeMinor(m, rr, cc);

        System.out.println("Minor:");
        printMatrix(mm);

        // task 5
        System.out.println("\nTask 5");

        System.out.print("Matrix size: ");
        int sni = sc.nextInt();

        int[][] A = new int[sni][sni];
        int[][] B = new int[sni][sni];

        for (int i = 0; i < sni; i++) {
            for (int j = 0; j < sni; j++) {
                A[i][j] = rng.nextInt(50);
            }
        }
        System.out.println("Original:");
        printMatrix(A);

        // transpose
        for (int i = 0; i < sni; i++) {
            for (int j = 0; j < sni; j++) {
                B[j][i] = A[i][j];
            }
        }

        System.out.println("Transposed:");
        printMatrix(B);
    }

    // методы
    static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Детерминант и минор
    static double det(double[][] a) {
        int n = a.length;
        if (n == 1) return a[0][0];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (i % 2 == 0 ? 1 : -1) * a[0][i] * det(makeMinor(a, 0, i));
        }
        return sum;
    }

    static double[][] makeMinor(double[][] a, int r, int c) {
        int n = a.length;
        double[][] res = new double[n - 1][n - 1];
        int row = 0;
        for (int i = 0; i < n; i++) {
            if (i == r) continue;
            int col = 0;
            for (int j = 0; j < n; j++) {
                if (j == c) continue;
                res[row][col] = a[i][j];
                col++;
            }
            row++;
        }
        return res;
    }
}
