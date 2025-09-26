import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Інформація про примітивні типи даних:\n");

        System.out.println("byte:   розмір = " + Byte.SIZE + " біт, " +
                "мін = " + Byte.MIN_VALUE + ", макс = " + Byte.MAX_VALUE);

        System.out.println("short:  розмір = " + Short.SIZE + " біт, " +
                "мін = " + Short.MIN_VALUE + ", макс = " + Short.MAX_VALUE);

        System.out.println("int:    розмір = " + Integer.SIZE + " біт, " +
                "мін = " + Integer.MIN_VALUE + ", макс = " + Integer.MAX_VALUE);

        System.out.println("long:   розмір = " + Long.SIZE + " біт, " +
                "мін = " + Long.MIN_VALUE + ", макс = " + Long.MAX_VALUE);

        System.out.println("float:  розмір = " + Float.SIZE + " біт, " +
                "мін = " + Float.MIN_VALUE + ", макс = " + Float.MAX_VALUE);

        System.out.println("double: розмір = " + Double.SIZE + " біт, " +
                "мін = " + Double.MIN_VALUE + ", макс = " + Double.MAX_VALUE);

        System.out.println("char:   розмір = " + Character.SIZE + " біт, " +
                "мін = " + (int) Character.MIN_VALUE + ", макс = " + (int) Character.MAX_VALUE);

        System.out.println("boolean: значення = " + Boolean.FALSE + " або " + Boolean.TRUE);

        System.out.println("\n==============================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число типу int: ");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.println("int значення = " + intValue);

        System.out.print("Введіть число типу double: ");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        System.out.println("double значення = " + doubleValue);

        System.out.print("Введіть число типу byte: ");
        byte byteValue = Byte.parseByte(scanner.nextLine());
        System.out.println("byte значення = " + byteValue);

        System.out.print("Введіть число типу short: ");
        short shortValue = Short.parseShort(scanner.nextLine());
        System.out.println("short значення = " + shortValue);

        System.out.print("Введіть число типу long: ");
        long longValue = Long.parseLong(scanner.nextLine());
        System.out.println("long значення = " + longValue);

        System.out.print("Введіть число типу float: ");
        float floatValue = Float.parseFloat(scanner.nextLine());
        System.out.println("float значення = " + floatValue);

        System.out.print("Введіть символ типу char: ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("char значення = " + charValue);

        System.out.print("Введіть true/false (boolean): ");
        boolean boolValue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("boolean значення = " + boolValue);

        scanner.close();
    }
}
