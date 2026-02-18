import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double principal = sc.nextDouble();
        double time = sc.nextDouble();

        BankAccount original = new BankAccount(name, principal, time);
        BankAccount updated = new BankAccount(original);

        double interestAdded = updated.getFinalAmount() - principal;
        System.out.println(original);

        System.out.println("--- Updated Account Details (After Interest Calculation using Copy Constructor) ---");
        System.out.println(updated);
        System.out.println("Interest Added : " + interestAdded);
        System.out.println("Final Amount : " + updated.getFinalAmount());

    }
}
     class BankAccount {
        // Encapsulated fields
        private String accountHolderName;
        private double principalAmount;
        private double timeInMonths;
        private double interestRate;
        private double finalAmount;

        // Parameterized constructor
        public BankAccount(String accountHolderName, double principalAmount, double timeInMonths) {
            this.accountHolderName = accountHolderName;
            this.principalAmount = principalAmount;
            this.timeInMonths = timeInMonths;
            this.interestRate = calculateRate(timeInMonths);
            this.finalAmount = principalAmount;
        }

        public BankAccount(BankAccount other) {
            this.accountHolderName = other.accountHolderName;
            this.principalAmount = other.principalAmount;
            this.timeInMonths = other.timeInMonths;
            this.interestRate = other.interestRate;

            double interest = calculateInterest();
            this.finalAmount = this.principalAmount + interest;
        }

        public double calculateRate(double timeInMonths) {
            if (timeInMonths == 1) {
                return 20.0;
            } else if (timeInMonths > 1 && timeInMonths <= 1.5) {
                return 22.0;
            } else {
                return 25.0;
            }
        }

        public double calculateInterest() {
            return (principalAmount * interestRate * timeInMonths) / 100.0;
        }

        public double getFinalAmount() {
            return finalAmount;
        }

        public String toString() {
            return "Account Holder Name: " + accountHolderName + "\n" + "Principal Amount: " + principalAmount + "\n" + "Time In Months: " + timeInMonths +"\n" + "Interest Rate : " + interestRate + "%";
        }
    }
