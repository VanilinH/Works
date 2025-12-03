import java.util.Random;
import java.util.Scanner;

public class home {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Task 1");
        task1();

        System.out.println("\nTask 2");
        task2();

        System.out.println("\nTask 3");
        task3();

        System.out.println("\nTask 4");
        task4();

        System.out.println("\nTask 5");
        task5();

    }

    private static void task1() {

        int[][] pyramid = {
                {1},
                {2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };

        System.out.println("Pyramid:");
        for (int[] row : pyramid) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\nPyramid (reverse order):");
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int value : pyramid[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void task2() {

        Random rnd = new Random();
        double[][] arr = new double[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextDouble(50);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    arr[i][j] = Math.sqrt(arr[i][j]);
                }
            }
        }

        System.out.println("Processed array:");
        for (double[] row : arr) {
            for (double v : row) {
                System.out.printf("%.2f ", v);
            }
            System.out.println();
        }
    }

    private static void task3() {

        double[][] matrix = new double[5][5];

        System.out.println("Enter the elements of a 5x5 matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Determinant: " + determinant(matrix));
    }

    private static double determinant(double[][] m) {
        int n = m.length;

        if (n == 1) return m[0][0];

        double det = 0;

        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col)
                    * m[0][col]
                    * determinant(minor(m, 0, col));
        }

        return det;
    }

    private static double[][] minor(double[][] m, int row, int col) {
        int n = m.length;
        double[][] result = new double[n - 1][n - 1];

        int r = 0;

        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int c = 0;

            for (int j = 0; j < n; j++) {
                if (j == col) continue;

                result[r][c] = m[i][j];
                c++;
            }
            r++;
        }
        return result;
    }

    private static void task4() {

        Random rnd = new Random();

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(30);
            }
        }

        System.out.println("\nMatrix:");
        for (double[] row : matrix) {
            for (double v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter row for minor: ");
        int r = sc.nextInt();

        System.out.print("Enter column for minor: ");
        int c = sc.nextInt();

        double[][] M = minor(matrix, r, c);

        System.out.println("\nMinor:");
        for (double[] row : M) {
            for (double v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    private static void task5() {

        Random rnd = new Random();

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(50);
            }
        }

        System.out.println("\nOriginal matrix:");
        for (int[] row : matrix) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }

        int[][] transposed = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTransposed matrix:");
        for (int[] row : transposed) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
