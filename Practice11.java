import java.io.*;
import java.util.Scanner;

public class TextEditor {

    public static final String FILE_NAME = "notes.txt";
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    writeToFile();
                    break;
                case "2":
                    readFileContent();
                    break;
                case "3":
                    System.out.println("Closing program.");
                    running = false;
                    break;
                default:
                    System.out.println("Error: Invalid option.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n Text Editor ");
        System.out.println("1. Write to file");
        System.out.println("2. Read entire file content");
        System.out.println("3. Exit editor");
        System.out.print("Choose an option: ");
    }

    public static void writeToFile() {
        System.out.print("Enter a line to write: ");
        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(text + "\n");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file: " + e.getMessage());
        }
    }

    public static void readFileContent() {
        File file = new File(FILE_NAME);
        
        if (!file.exists()) {
            System.out.println("File not created yet. Please write something first.");
            return;
        }

        System.out.println(" File Content ");
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println("\n " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        System.out.println("\n End of file content.");
    }
}
