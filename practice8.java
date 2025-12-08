import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(input));
        System.out.println("Reversed: " + reverse(input));
        System.out.println("Longest word: " + findLongestWord(input));
        System.out.println("Shortest word: " + findShortestWord(input));
        System.out.println("Camel case: " + toCamelCase(input));
        System.out.println("Censored: " + censorWords(input));
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    public static String reverse(String s) {
        if (s.length() == 1) return s;
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest + " (" + longest.length() + " characters)";
    }

    public static String findShortestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest + " (" + shortest.length() + " characters)";
    }

    public static String toCamelCase(String str) {
        String[] parts = str.split("[-_\\s]+");
        StringBuilder camelCase = new StringBuilder();
        for (String part : parts) {
            if (part.length() > 0) {
                camelCase.append(Character.toUpperCase(part.charAt(0)))
                         .append(part.substring(1).toLowerCase());
            }
        }
        return camelCase.toString();
    }

    public static String censorWords(String input) {
        String[] profanityList = {"Female", "Gay"}; 
        for (String word : profanityList) {
            StringBuilder replacement = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                replacement.append("*");
            }
            input = input.replaceAll("(?i)\\b" + word + "\\b", replacement.toString());
        }
        return input;
    }
}
