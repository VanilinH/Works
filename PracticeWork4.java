import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Завдання 1
        double x, a, b, f;
        System.out.print("Введіть x: ");
        x = sc.nextDouble();
        System.out.print("Введіть a: ");
        a = sc.nextDouble();
        System.out.print("Введіть b: ");
        b = sc.nextDouble();

        if (x >= 1 && x < 3) f = 9 / (a * x);
        else if (x == 3) f = a * x * x + x + b;
        else {
            System.out.println("x поза межами області визначення");
            f = Double.NaN;
        }
        System.out.println("f(x) = " + f);


        //  Завдання 2
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        int guess, attempts = 0;
        do {
            System.out.print("Введіть число: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > number) System.out.println("Занадто багато");
            else if (guess < number) System.out.println("Занадто мало");
            else System.out.println("Вірно!");
        } while (guess != number);
        System.out.println("Кількість спроб: " + attempts);


        //  Завдання 3
        System.out.print("Введіть N: ");
        int N = sc.nextInt();
        System.out.println("Прості числа від 1 до " + N + ":");
        for (int i = 2; i <= N; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println(i + " ");
        }
    }
}
