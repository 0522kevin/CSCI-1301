import java.util.Scanner;

public class TemperatureConverter{
	
 public static void main(String[] args) {
  	
  	 // Declare named constants.
	 
	 final double MIN_FAHRENHEIT = -459.67;
	 
	 // Declare the variables. 
 
	 double fahrenheit;
	 double convertedDegrees;
	 int tempScale;
	 String tempScaleStr="";
 
	 // Creating the Scanner object
	 Scanner keyboard =  new Scanner(System.in);
 
	 System.out.print("Enter the temperature in Fahrenheit: ");               
	 fahrenheit =  keyboard.nextDouble();  // Set a breakpoint here   
 
	 // Verify the user's input
	 // wrong inequality used. changed > to <=
	 if (fahrenheit <= MIN_FAHRENHEIT) {   // first if-statement: Set a breakpoint here
		 System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
		 System.exit(0);
	 }
 
	 System.out.print (
			 "Enter the temperature scales you want to convert to:\n"+ 
			 "1. Kelvin \n"+
			 "2. Rankine \n"+
			 "3. Reaumur \n"+
			 "4. Celsius\n"+
			 "Enter a temperature scale: ");
	 tempScale = keyboard.nextInt();
	 
	 //changed > to < and < to >
	 //also changed && to ||
	 if (tempScale < 1 || tempScale > 4) {  // Second-if statement: Set a breakpoint here
		 System.out.println("Unknown temperature scale  -" +
		 					"  cannot do calculation. Bye");
	 }
	 else {
		 if (tempScale == 1) { // Set a breakpoint here
			 convertedDegrees = (fahrenheit - MIN_FAHRENHEIT) * 5 / 9;
			 tempScaleStr="Kelvin"; 
		 } else if (tempScale == 2) { //got rid of || tempScale == 3
 			convertedDegrees = fahrenheit - MIN_FAHRENHEIT; //changed convertedDegrees to fahrenheit 
 			tempScaleStr="Rankine";
 			
		 } else if (tempScale == 3) { //changed fahrenheit - 32*4/9 to (fahrenheit - 32)*4/9
			 convertedDegrees = (fahrenheit - 32.0) * 4 / 9; // Set a breakpoint here
			 tempScaleStr="Reaumur"; //changed rankine to reaumur
				 
		 } else { //changed (fahrenheit - 32)*9/5 to (fahrenheit - 32)*5/9
			 convertedDegrees = (fahrenheit - 32.0) * 5 / 9; // Set a breakpoint here
			 tempScaleStr="Celsius";
		 }

		 System.out.println(fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees "+ tempScaleStr + ".");
	 }
 }
}
