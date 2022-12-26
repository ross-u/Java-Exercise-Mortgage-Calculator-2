import java.util.Scanner;
import java.text.NumberFormat;


public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Instantiate a Scanner object to access Terminal input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("\n Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("\nPeriod (Years): ");
        byte years = scanner.nextByte();

        int paymentMonths = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, paymentMonths))
                / (Math.pow(1 + monthlyInterestRate, paymentMonths) - 1);

        String monthlyMortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + monthlyMortgageFormatted);

    }
}