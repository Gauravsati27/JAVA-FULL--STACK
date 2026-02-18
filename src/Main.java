import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter loan duration in months: ");
        int m = sc.nextInt();
        sc.close();
        Loan loan=new Loan(p,r,m);

        System.out.printf("Loan Details:%n");
        System.out.printf("Principal: %.2f%n", loan.getPrincipal());
        System.out.printf("Interest Rate: %.2f%%%n", loan.getInterestRate());
        System.out.printf("Duration: %d months%n", loan.getDurationMonths());
    }
}
class Loan{
    private double principal;
    private double interestRate;
    private int durationMonths;

    public Loan(double principal,double interestRate,int durationMonths) {
        if(principal<=0||interestRate<=0||durationMonths<=0) {
            System.out.println("Invalid Input");
            System.exit(0);

        }
        this.principal=principal;
        this.interestRate=interestRate;
        this.durationMonths=durationMonths;
    }

    public double getPrincipal() {
        return principal;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public int getDurationMonths() {
        return durationMonths;
    }
}
