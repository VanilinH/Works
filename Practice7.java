import java.security.SecureRandom;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();

        int x = 5;

        int [][] array = new int [x][]; 

        for (int i = 0; i < x; i++) {
            array[i] = new int[i + 1]; 
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sr.nextInt(100);
            }

            System.out.println(Arrays.toString(array[i])); 
        }

        for  (int i = array.length - 1; i >=0; i--) {
            System.out.println(Arrays.toString(array[i]));
        }


    }
}

import java.security.SecureRandom;
import java.util.Arrays;
import java.lang.Math;
public class Task2 {
    public static void main(String[] args) {

        SecureRandom sr = new SecureRandom();

        int row = 3;
        int colw = 3;
        double [][] array = new double [row][colw];

        System.out.println("Массив:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colw; j++) {
                array[i][j] = sr.nextDouble(100);

            }
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("Исправленный массив:");
        for  (int i = 0; i < row; i++) {
            for (int j = 0; j < colw; j++) {

                if (i % 2 == 1 || j % 2 == 1) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }

            }
            System.out.println(Arrays.toString(array[i]));
        }


    }
}


import java.util.Scanner;
import java.security.SecureRandom;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();

        System.out.println("Введите размер квадратной матрицы:");
        int n = sc.nextInt();

        int[][] array = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sr.nextInt(10);
            }
        }

        System.out.println("Матрица:");
        print(array);


        int[][] transposed = transpose(array);

        System.out.println("Транспонированная матрица:");
        print(transposed);

        sc.close();
    }


    static void print(int[][] m) {
        for (int[] row : m) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    static int[][] transpose(int[][] m) {
        int n = m.length;
        int[][] t = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }
}
