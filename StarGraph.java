import java.util.Scanner;

public class StarGraph {
    public static void main(String[] args) {
        //creates Scanner object called scan
        Scanner scan = new Scanner(System.in);

        //creates instance variables that are needed for this program
        int adderCount = 0;
        int arraySize;
        double minimumValueForX;
        double incrementX;

        //asks the user to enter the size of arrays
        System.out.print("Please enter the number of x values to process: ");
        arraySize = scan.nextInt();

        //the size of arrays needs to be greater than 0
        //so the program will close if the user inputs a value equal to or lower than 0
        if(arraySize <= 0) {
            System.out.println("The number of x values must be an integer greater than 0.");
            System.exit(-1);
        }

        //asks the user to enter the minimum value for x
        //this will be the base of x values
        System.out.print("Enter a minimum value for x: ");
        minimumValueForX = scan.nextDouble();

        //asks the user to enter the increment to increase x
        System.out.print("Enter the amount to increment x: ");
        incrementX = scan.nextDouble();

        //increment has to be greater than 0
        //so the program will close if the user inputs a value equal to or lower than 0
        if(incrementX <= 0) {
            System.out.println("The increment must be a decimal number greater than 0.");
            System.exit(-1);
        }

        //creates two arrays; one for x and one for y
        double[] xValues = new double[arraySize];
        double[] yValues = new double[arraySize];

        //for each index, the increment is added once compared to the index one lower
        for(int i = 0; i < arraySize; i++) {
            xValues[i] = minimumValueForX + (incrementX * adderCount);
            adderCount++;
        }

        //assigns value for yValues based on values in xValues
        //given formula is used
        for(int i = 0; i < arraySize; i++) {
            yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
        }

        //prints the values for each array
        System.out.println("");
        System.out.println("Values");
        for(int i = 0; i < arraySize; i++) {
            //formats the decimals to have three decimal points
            System.out.printf("x: %.3f", xValues[i]);
            System.out.print(", ");
            System.out.printf("y: %.3f", yValues[i]);
            System.out.println("");
        }

        //prints the star graph
        System.out.println("");
        System.out.println("Graph");
        for(int i = 0; i < arraySize; i++) {
            //truncates the decimal points in yValues
            yValues[i] = Math.floor(yValues[i]);
            System.out.print(":");
            //while yValues[i] is greater than 0
            //the while loop will print one * and subtract yValues[i] by one
            //so that a star will be printed properly based on yValues[i]
            while(yValues[i] > 0) {
                System.out.print("*");
                yValues[i]--;
            }
            System.out.println("");
        }
    }
}
