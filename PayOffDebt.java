import java.util.Scanner;

public class PayOffDebt{
    public static void main(String[] args){
        
        //creates a scanner object called scan
        Scanner scan = new Scanner (System.in);

        //declares variables needed for the program
        double principal;
        double monthlyPayment;
        double annualInterestRate;
        double monthsNeededToPayOff;
        double totalAmountPaid;
        double totalInterestPaid;
        double Overpayment;

        //gathers information needed to calculate months needed to pay off debt
        System.out.print("Principal:               \t");
        principal =  scan.nextDouble();
        System.out.print("Annual Interest Rate (%):\t");
        annualInterestRate = scan.nextDouble();
        System.out.print("Monthly Payment:         \t");
        monthlyPayment = scan.nextDouble();
        
        //calculates months needed to pay off debt in decimals based on the formula given
        monthsNeededToPayOff = (Math.log(monthlyPayment) - Math.log(monthlyPayment - annualInterestRate/1200*principal))/Math.log(annualInterestRate/1200 + 1.0);
        
        //Calculates months needed to pay off debt and its ceiling, total amount paid, total interest paid, and the overpayment
        int monthsNeededToPayOffCeiling = (int) Math.ceil(monthsNeededToPayOff);
        totalAmountPaid = monthlyPayment * monthsNeededToPayOffCeiling;
        totalInterestPaid = totalAmountPaid - principal;

        //Since monthsNeededToPayOffCeiling is slightly greater than monthsNeededToPayOff, there is an overpayment between where the debtor overpays the bank
        //To found this value, you multiply the difference between monthsNeededToPayOffCeiling and monthsNeededToPayOff to monthlyPayment
        //because the difference is the amount months where the debtor overpays the bank so the product of the difference and monthlyPayment will yield overpayment
        //overpayment is multiplied by 100.00 to produce two decimal points
        Overpayment = (monthsNeededToPayOffCeiling - monthsNeededToPayOff) * monthlyPayment;
        Overpayment = Math.round(Overpayment * 100.00) / 100.00;

        //prints the calculations
        System.out.println("");
        System.out.println("Months Needed To Pay Off:\t" + monthsNeededToPayOffCeiling);
        System.out.printf("Total Amount Paid:      \t$%.2f\n", totalAmountPaid);
        System.out.printf("Total Interest Paid:    \t$%.2f\n", totalInterestPaid);
        System.out.println("Overpayment:            \t$" + Overpayment);

        //closes scanner to avoid warning
        scan.close();
    }
}
