import java.util.Random;
import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмірність квадратної матриці: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("\nГенерація матриці " + n + "×" + n + " з випадковими значеннями...");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100); // Випадкові числа від 0 до 99
            }
        }

        System.out.println("\n Початкова матриця ");
        printMatrix(matrix);

        int[][] transposed = transposeMatrix(matrix);

        printMatrix(transposed);

        verifyTranspose(matrix, transposed);

        scanner.close();
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] transposed = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    private static void printMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void verifyTranspose(int[][] original, int[][] transposed) {
        int n = original.length;
        boolean correct = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (original[i][j] != transposed[j][i]) {
                    correct = false;
                    break;
                }
            }
            if (!correct) break;
        }

        System.out.println("\nПриклад відповідності елементів:");
        System.out.printf("A[0][0] = %d  ←→  A^T[0][0] = %d\n",
                original[0][0], transposed[0][0]);
        if (n > 1) {
            System.out.printf("A[0][1] = %d  ←→  A^T[1][0] = %d\n",
                    original[0][1], transposed[1][0]);
            System.out.printf("A[1][0] = %d  ←→  A^T[0][1] = %d\n",
                    original[1][0], transposed[0][1]);
        }
    }
}
