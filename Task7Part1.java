import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рівнів піраміди: ");
        int levels = scanner.nextInt();

        int[][] pyramid = new int[levels][];

        int counter = 1;
        for (int i = 0; i < levels; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = counter++;
            }
        }

        System.out.println("\n Піраміда у звичайному порядку ");
        printPyramid(pyramid, false);

        System.out.println("\n Піраміда у зворотньому порядку ");
        printPyramid(pyramid, true);

        scanner.close();
    }

    private static void printPyramid(int[][] pyramid, boolean reverse) {
        if (reverse) {
            for (int i = pyramid.length - 1; i >= 0; i--) {
                for (int k = 0; k < pyramid.length - i - 1; k++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < pyramid[i].length; j++) {
                    System.out.printf("%3d ", pyramid[i][j]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < pyramid.length; i++) {
                for (int k = 0; k < pyramid.length - i - 1; k++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < pyramid[i].length; j++) {
                    System.out.printf("%3d ", pyramid[i][j]);
                }
                System.out.println();
            }
        }
    }
}
