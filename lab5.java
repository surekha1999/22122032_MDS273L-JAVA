
import java.util.Scanner;

public class lab5 {

    private static final String PLAIN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CYPHER = "XYZABCDEFGHIJKLMNOPQRSTUVW";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message = scanner.nextLine();

        System.out.println("Choose an option:");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Exit");

        int option = scanner.nextInt();
        scanner.nextLine(); 

        String result;
        if (option == 1) {
            result = encrypt(message);
            System.out.println("Encrypted message: " + result);
        } else if (option == 2) {
            result = decrypt(message);
            System.out.println("Decrypted message: " + result);
        } else if (option ==3) {
            System.out.println("Exiting program...");
            }
        else {
            System.out.println("Invalid option.");
        }
    }

    public static String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toUpperCase().toCharArray()) {
            int index = PLAIN.indexOf(c);
            if (index >= 0) {
                result.append(CYPHER.charAt(index));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toUpperCase().toCharArray()) {
            int index = CYPHER.indexOf(c);
            if (index >= 0) {
                result.append(PLAIN.charAt(index));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
    