import java.util.Scanner;

public class ClassifyMessage {
	
	//creates an enumeration called MessageCategory
	enum MessageCategory{
		//stores 5 elements called NEED, OFFER, ALERT, INFO, and UNKNOWN
		NEED, OFFER, ALERT, INFO, UNKNOWN;
	}
	
	public static void main(String[] args) {
		
		//creates Scanner object called scan
		Scanner scan = new Scanner(System.in);
		
		//declares variables needed for the lab
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;
		
		//declares and initializes the constants needed for the lab
		//these variables are constants because these values should not change
		final double south = 39.882343;
		final double north = 40.231315;
		final double west = -105.743511;
		final double east = -104.907864;
		
		//asks the user to input the message
		System.out.println("Please enter a formatted message:");
		catString = scan.next();
		latitude = scan.nextDouble();
		longitude = scan.nextDouble();
		payload = scan.nextLine();
		
		//trims catString and payload to remove unnecessary characters
		catString = catString.trim();
		payload = payload.trim();
		
		//if catString equals fire OR smoke
		if(catString.equalsIgnoreCase("fire") || (catString.equalsIgnoreCase("smoke"))) {
			//category is initialized to be ALERT
			category = MessageCategory.ALERT;
		}
		//		//if catString equals need
		else if(catString.equalsIgnoreCase("need")) {
			//category is initialized to be NEED
			category = MessageCategory.NEED;
		}
		//if catString equals offer
		else if(catString.equalsIgnoreCase("offer")) {
			//category is initialized to be OFFER
			category = MessageCategory.OFFER;
		}
		//if catString equals structure, road, photo, OR evac
		else if(catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
			//category is initialized to be INFO
			category = MessageCategory.INFO;
		}
		//if catString equals nothing of the above
		else {
			//category is initialized to be UNKNOWN
			category = MessageCategory.UNKNOWN;
		}
		
		//if latitude is greater than or equal to south AND if latitude is smaller than or equal to north
		if((latitude >= south) && (latitude <= north)){
			//if longitude is greater than or equal to west AND if longitude is smaller than or equal to east
			if((longitude >= west) && (longitude <= east)){
				//the coordinates are in range
				isInRange = true;
			}
			//if longitude is not greater than or equal to west OR if longitude is not smaller than or equal to west
			else {
				//the coordinates are not in range
				isInRange = false;
			}
		}
		//if latitude is not greater than or equal to south OR if latitude is not smaller than or equal to north
		else {
			//the coordinates are not in range
			isInRange = false;
		}
		
		//prints out the parsed message individually
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat  \t" + catString);
		System.out.println("Message: \t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitud:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);
	}
}
