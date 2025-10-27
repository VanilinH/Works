import java.util.Scanner;
import java.util.Random;


//              ЗАВДАННЯ 1

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double a = sc.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Введіть друге число: ");
        double b = sc.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Помилка: ділення на нуль");
                }
                break;
            default:
                System.out.println("Невідомий оператор");
        }

        sc.close();
    }
}


//                          ЗАВДАННЯ 2

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random rand = new Random();
//
//        int secret = rand.nextInt(10) + 1;
//        int guess;
//        int attempts = 0;
//
//        System.out.println("Вгадай число від 1 до 10");
//
//        do {
//            System.out.print("Введіть число: ");
//            guess = sc.nextInt();
//            attempts++;
//
//            if (guess < secret) {
//                System.out.println("Більше");
//            } else if (guess > secret) {
//                System.out.println("Менше");
//            } else {
//                System.out.println("Ви вгадали число " + secret + " за " + attempts + " спроб");
//            }
//        } while (guess != secret);
//
//        sc.close();
//    }
//}

//                   ЗАВДАННЯ 3

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Таблиця Келі для множення від 1 до 10:");
//
//        System.out.print("\t");
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + "\t");
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + "\t");
//            for (int j = 1; j <= 10; j++) {
//                System.out.print((i * j) + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

