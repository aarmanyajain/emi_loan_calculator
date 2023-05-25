import java.util.Scanner;

class EmiCalculation {
    double emi;

    EmiCalculation(double p, double r, double t) {
        emi = (p * r * Math.pow(1 + r, t)) / (Math.pow(1 + r, t) - 1);
    }
}

class Emi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate per month (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter tenure in months: ");
        double tenureMonths = scanner.nextDouble();

        double rate = interestRate / 100 / 12;
        double time = tenureMonths; 

        EmiCalculation emiCalculation = new EmiCalculation(principal, rate, time);

        System.out.println("Principal Amount: " + principal);
        System.out.println("Interest Rate (per month): " + interestRate + "%");
        System.out.println("Tenure (months): " + tenureMonths);
        System.out.println("EMI: " + emiCalculation.emi);

        scanner.close();
    }
}