import java.util.Scanner; // Додавання класу для роботи з введеннями з клавіатури

public class Main {
    public static void main(String[] args) {
        //  Завдання 1
        double a = 38.9;
        double b = -4.7;
        double c = 5;
        double z = 0.8;

        // Обчислення значення x за формулою
        double x = a + (b / ((c + Math.sqrt(a)) / (Math.abs(b - a) + Math.sqrt(a))));
        // Обчислення значення y за формулою
        double y = Math.exp(Math.pow(-z, -1)) + Math.asin(z);

        // Виведення результатів першого завдання
        System.out.println("=== Завдання 1 ===");
        System.out.printf("a = %.2f, b = %.2f, c = %.2f, z = %.2f%n", a, b, c, z);
        System.out.printf("x = %.4f%n", x);
        System.out.printf("y = %.4f%n", y);

        //  Завдання 2
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Завдання 2 ===");
        System.out.print("Введіть a: "); // зчитування змінної a
        a = sc.nextDouble();
        System.out.print("Введіть b: "); // зчитування змінної b
        b = sc.nextDouble();
        System.out.print("Введіть x: "); // зчитування змінної x
        x = sc.nextDouble();

        double f; // змінна для результату f(x)

        if (x >= -1 && x < 3) {
            f = Math.sin(x);
        } else if (x == 3) {
            f = Math.sqrt(a * x - 2);
        } else if (x > 3 && x < 5) {
            f = b * x + a;
        } else {
            System.out.println("x не входить у визначену область!");
            return;
        }
        // Вивід результатів другого завдання
        System.out.printf("f(x) = %.4f%n", f);
    }
}
