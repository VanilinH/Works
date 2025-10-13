import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть byte: ");
        byte b = sc.nextByte();

        System.out.print("Введіть short: ");
        short s = sc.nextShort();

        System.out.print("Введіть int: ");
        int i = sc.nextInt();

        System.out.print("Введіть long: ");
        long l = sc.nextLong();

        System.out.print("Введіть float: ");
        float f = sc.nextFloat();

        System.out.print("Введіть double: ");
        double d = sc.nextDouble();

        System.out.print("Введіть char: ");
        char c = sc.next().charAt(0);

        System.out.print("Введіть String: ");
        String str = sc.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean bool = sc.nextBoolean();

        System.out.println("Введення данних");

        System.out.println("1) byte = " + b);
        System.out.println("2) short = " + s);
        System.out.println("3) int = " + i);
        System.out.println("4) long = " + l);
        System.out.println("5) float = " + f);
        System.out.println("6) double = " + d);
        System.out.println("7) char = " + c);
        System.out.println("8) String = " + str);
        System.out.println("9) boolean = " + bool);

        System.out.println("Вивід");

        System.out.printf("1) byte = %d%n", b);
        System.out.printf("2) short = %d%n", s);
        System.out.printf("3) int (dec) = %d, (hex) = %x, (oct) = %o%n", i, i, i);
        System.out.printf("4) long = %d%n", l);
        System.out.printf("5) float = %.2f%n", f);
        System.out.printf("6) double = %.3f%n", d);
        System.out.printf("7) char = %c%n", c);
        System.out.printf("8) String = %10s%n", str);
        System.out.printf("9) boolean = %b%n", bool);

        System.out.println("Рядок:");

        String info = String.format("byte=%d, short=%d, int=%d, long=%d, float=%.1f, double=%.2f, char=%c, str=%s, bool=%b",
                b, s, i, l, f, d, c, str, bool);
        System.out.println(info);

        sc.close();
    }
}
