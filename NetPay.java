import java.util.Scanner;

public class NetPay {
    public static void main(String[] args){

        //creates a Scanner object used for this class
        Scanner scan = new Scanner (System.in);

        //declares and initiates the constants needed for this program
        final double FEDERAL_TAX_PERCENT = 10.00;
        final double STATE_TAX_PERCENT = 4.5;
        final double SS_PERCENT = 6.2;
        final double MEDICARE_PERCENT = 1.45;
        final double PAY_PER_HOUR = 7.25;

        //prompts the user to type the hours per week a employee has worked
        System.out.print("Hours per Week: \t");
        int hoursPerWeek = scan.nextInt();
        
        //declares the variables needed to calculate net pay
        //calculates the taxes needed to pay for different tax rates and stores the values to variables at the same time
        double grossPay = hoursPerWeek * PAY_PER_HOUR;
        double federalTax = grossPay * FEDERAL_TAX_PERCENT / 100;
        double stateTax = grossPay * STATE_TAX_PERCENT / 100;
        double ssTAX = grossPay * SS_PERCENT / 100;
        double medicareTax = grossPay * MEDICARE_PERCENT / 100;

        //calculates the net pay by subtracting different taxes from gross pay
        double netPay = grossPay - federalTax - stateTax - ssTAX - medicareTax;

        //prints the results
        System.out.println("Gross Pay:      \t" + grossPay);
        System.out.println("Net Pay:        \t" + netPay);
        System.out.println("");
        System.out.println("Deductions");
        System.out.println("Federal:        \t" + federalTax);
        System.out.println("State:          \t" + stateTax);
        System.out.println("Social Security:\t" + ssTAX);
        System.out.println("Medicare:       \t" + medicareTax);
        
        scan.close();
    }
}
