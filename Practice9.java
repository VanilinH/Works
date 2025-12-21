public class Main {

}
public static void main(String[] args) {
    String input = getUserInput();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Обери операцію: 1 - Зворотне перетворення рядка, 2 - Зворотне перетворення слів");
    int choice = scanner.nextInt();
    scanner.nextLine();

    if (choice == 1) {
        System.out.println(reverseString(input));
    } else if (choice == 2) {
        System.out.println(reverseWords(input));
    }
    scanner.close();
}

public static String getUserInput() {
    Scanner scanner = new Scanner(System.in);
    String input;

    while (true) {
        System.out.println("Введіть рядок щонайменше з 2 слів та 3+ символів у кожному:");
        input = scanner.nextLine().trim();

        String[] words = input.split("\\s+");
        if (words.length >= 2 && words[0].length() >= 3 && words[1].length() >= 3) {
            return input;
        }
        System.out.println("Недійсний ввід. Спробуйте ще раз.");
    }
}

public static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
}

public static String reverseWords(String str) {
    String[] words = str.split("\\s+");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        result.append(new StringBuilder(words[i]).reverse().toString());
        if (i < words.length - 1) result.append(" ");
    }
    return result.toString();
}
