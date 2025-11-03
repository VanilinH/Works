import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Завдання 1
        System.out.println("Завдання 1:");
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();
        System.out.print("Введіть a: ");
        double a = sc.nextDouble();
        System.out.print("Введіть b: ");
        double b = sc.nextDouble();

        double f;
        if (x >= 1) {
            if (x < 3) {
                f = 9 / (a * x);
            } else if (x == 3) {
                f = a * x * x + x + b;
            } else {
                System.out.println("x поза межами області визначення");
                f = Double.NaN;
            }
        } else {
            System.out.println("x поза межами області визначення");
            f = Double.NaN;
        }
        System.out.println("f(x) = " + f);


        //  Завдання 2
        System.out.println("\nЗавдання 2:");
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        int guess, attempts = 0;

        do {
            System.out.print("Введіть число: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > number) System.out.println("Занадто багато");
            else if (guess < number) System.out.println("Занадто мало");
        } while (guess != number);
        System.out.println("Вірно! Спроб: " + attempts);

        System.out.println("Гра ще раз! :");
        number = rand.nextInt(100) + 1;
        attempts = 0;
        guess = -1;
        while (guess != number) {
            System.out.print("Введіть число: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > number) System.out.println("Занадто багато");
            else if (guess < number) System.out.println("Занадто мало");
        }
        System.out.println("Вірно! Спроб: " + attempts);


        //  Завдання 3
        System.out.println("\nЗавдання 3:");
        System.out.print("Введіть N: ");
        int N = sc.nextInt();
        System.out.print("Прості числа від 1 до " + N + ": ");

        boolean first = true;
        for (int i = 2; i <= N; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println(".");
    }
}
