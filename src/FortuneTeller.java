import java.util.Scanner;

public class FortuneTeller {
	
	public static void main(String[] args) {
		
		String firstName, lastName, roygbiv, modeOfTravel = null, vacationSpot, exit = "quit";
		int age, retirementAge, retirementBalance, siblings;

		Scanner input = new Scanner(System.in);
	
		
		//Ask the user for the user’s first name.
		System.out.println("Welcome to Midnite Owl's Fortune Teller Program!\n Please enter your first name: ");
		firstName = input.nextLine();
		if (firstName.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}
		
		 //Ask the user for the user’s last name.
		System.out.println("Please enter your last name: ");
		lastName = input.nextLine();
		if (lastName.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}
		//Ask the user for the user’s age.
		System.out.println("Please enter your age: ");
		
		age = input.nextInt();
				
		
		//Ask the user for the user’s birth month (as an 'int').
		System.out.println("Please enter your birth month \"e.g.: 8 = August\"");
		String birthMonth;
		if (birthMonth.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}
		Integer.parseInt(birthMonth);
		
		//input.nextLine();
		
		//Ask the user for the user’s favorite ROYGBIV color.
		System.out.println("Please enter your favorite ROYGBIV color: \nDon't know what an ROYGBIV color is? Type 'help'.");
		
		roygbiv = input.next().toLowerCase();
		if (roygbiv.contentEquals("quit")) {
			System.exit(0);
		}

		//If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
		 else if (roygbiv.contentEquals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. \nPlease enter your favorite ROYGBIV color; \n");
			roygbiv = input.next().toLowerCase();
		} 
		switch(roygbiv) {
			case "red":
			case "orange":
			case "yellow":
			case "green":
			case "blue":
			case "indigo":
			case "violet":
				break;
			default:
				System.out.println("Not a color, goodbye.");
				System.exit(0);
			}
		
		//Ask the user for the user's number of siblings.
		System.out.println("How many siblings do you have?");
		siblings = input.nextInt();
		if (Integer.toString(siblings).contains("quit")){
			System.exit(0);
		} 
		
		
		//Retirement Age
		if (age % 2 == 0) {
			retirementAge = (birthMonth * age) / siblings;
		} else {
			retirementAge = (siblings * age) / birthMonth;
		}
		
		//Vacation Home Location
		if (siblings < 0) {
			vacationSpot = "North Pole, Alaska";
		} else
			
		switch(siblings) {
		case 0:
		case 1:
			vacationSpot = "Honolulu, Hawaii";
		break;
		case 2:
		case 3:
			vacationSpot = "Reykjavik, Iceland";
		break;
		case 4:
		case 5:
		case 6:
			vacationSpot = "Hong Kong, China";
		break;
		case 7:
		case 8:
		case 9:
			vacationSpot = "Tokyo, Japan";
		break;
		default:
			vacationSpot = "That's a lot of siblings! You might want to consider a \"Stay-cation\"";
		}
		
		
		switch(roygbiv) {
		case "red": 
			modeOfTravel = "Horse!";
		case "orange": 
			modeOfTravel = "DuneBuggy!";
		case "yellow": 
			modeOfTravel = "Skateboard!";
		case "green": 
			modeOfTravel = "Row Boat!";
		case "blue": 
			modeOfTravel = "Bycicle";
		case "indigo": 
			modeOfTravel = "Seguay";
		case "violet": 
			modeOfTravel = "Hang Glider";
			break;
			default: System.out.println("Foot");
		}
		
		//Retirement Balance
		switch(birthMonth) {
		case 1:
		case 2:
		case 3:
		case 4:
			retirementBalance = (birthMonth * age) * siblings;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			retirementBalance = (siblings * age) * birthMonth;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			retirementBalance = (age * siblings) * birthMonth;
			break;
			default: retirementBalance = 0;
		}
		
/*		Display the user's fortune in this format:
		*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
		a vacation home in *[location]*, and travel by *[mode of transportation]*.*/

		System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years with $" + retirementBalance + " in the bank, a vacation home in " + vacationSpot + "\n and travel by " + modeOfTravel);
			
	}
}
