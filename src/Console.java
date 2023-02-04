import java.util.Scanner;

public class Console {
    // Instantiate a Scanner object to access Terminal input
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, int min, int max) {
        double input = 0;

        while (true) {
            System.out.print(prompt);
            input = scanner.nextDouble();
            if (input <= max && input >= min) {
                break;
            }

            System.out.println("Enter a value between " + min + " and " + max);
        }

        return input;
    }
}
