import java.util.Random;
import java.util.Scanner;

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

// making pyramid
        for (int i = 0; i < py.length; i++) {
            for (int s = 0; s < py.length - 1 - i; s++) {
            }
            for (int j = 0; j < py[i].length; j++) {
                System.out.print(py[i][j] + " ");
            }
            System.out.println();
        }
// reversing pyramid:P
        System.out.println("Reverse:");
        for (int i = py.length - 1; i >= 0; i--) {
            for (int s = 0; s < py.length - 1 - i; s++) {
            }
            for (int j = 0; j < py[i].length; j++) {
                System.out.print(py[i][j] + " ");
            }
            System.out.println();
        }

 // Намагався використати такий вигляд коду но тоді reverse піраміди виходив не правильний: чому?
//        for (int[] row : p) {
//            for (int value : row) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Reverse:");
//        for (int i = p.length - 1; i >= 0; i--) {
//            // print leading spaces
//            for (int s = 0; s < p.length - 1 - i; s++) {
//                System.out.print(" ");
//            }
//
//            for (int value : p[i]) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

// task 2
        System.out.println("\nTask 2");

        double[][] arr = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = rng.nextDouble() * 50;
                if (i % 2 != 0 || j % 2 != 0) {
                    arr[i][j] = Math.sqrt(arr[i][j]);
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f ", arr[i][j]);
            }
            System.out.println();
        }

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
                m[i][j] = rng.nextInt(30);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Row: ");
        int rr = sc.nextInt();
        System.out.print("Col: ");
        int cc = sc.nextInt();

        double[][] mm = makeMinor(m, rr, cc);

        System.out.println("Minor:");
        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm[i].length; j++) {
                System.out.print(mm[i][j] + " ");
            }
            System.out.println();
        }

// task 5
        System.out.println("\nTask 5");

        System.out.print("Matrix size: ");
        int sni = sc.nextInt();

        int[][] A = new int[sni][sni];
        int[][] B = new int[sni][sni];

        for (int i = 0; i < sni; i++) {
            for (int j = 0; j < sni; j++) {
                A[i][j] = rng.nextInt(50);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sni; i++) {
            for (int j = 0; j < sni; j++) {
                B[j][i] = A[i][j];
            }
        }

        System.out.println("Transposed:");
        for (int i = 0; i < sni; i++) {
            for (int j = 0; j < sni; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

// determinant
    static double det(double[][] a) {
        int n = a.length;
        if (n == 1) return a[0][0];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (i % 2 == 0 ? 1 : -1) * a[0][i] * det(makeMinor(a, 0, i));
        }

        return sum;
    }

// minor
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
