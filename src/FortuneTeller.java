import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		String firstName, lastName, roygbiv, modeOfTravel, vacationSpot;
		int age, birthMonth, siblings, retirementAge, retirementBalance;

		Scanner input = new Scanner(System.in);
		
		//Ask the user for the user’s first name.
		System.out.println("Welcome to Midnite Owl's Fortune Teller Program!\n Please enter your first name: ");
		firstName = input.nextLine();
		
		 //Ask the user for the user’s last name.
		System.out.println("Please enter your last name: ");
		lastName = input.nextLine();
		
		//Ask the user for the user’s age.
		System.out.println("Please enter your age: ");
		age = input.nextInt();
		
		//Ask the user for the user’s birth month (as an 'int').
		System.out.println("Please enter your birth month \"e.g.: 8 = August\"");
		birthMonth = input.nextInt();
		if (birthMonth <=0 || birthMonth >= 12) {
			retirementBalance = 0;
		}
		input.nextLine();
		
		//Ask the user for the user’s favorite ROYGBIV color.
		System.out.println("Please enter your favorite ROYGBIV color: \nDon't know what an ROYGBIV color is? Type 'help'.");
		roygbiv = input.next().toLowerCase();

		//If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
		if (roygbiv.contentEquals("help")) {
			System.out.println("ROYGBIV is an acronym for the following colors: red, orange, yellow, green, blue, indigo and violet.\nPlease enter one of these colors: ");
			roygbiv = input.next();
		} else {
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
				input.close();
			}
		}

		System.out.println("How many siblings do you have?");//Ask the user for the user's number of siblings.*/
		siblings = input.nextInt();
		
		//Retirement Years
		int retireEven = (birthMonth / age) * siblings;
		int retireOdd = (siblings / age) * birthMonth;
		if (age % 2 == 0) {
		retirementAge = retireEven;
		} else {
		retirementAge = retireOdd;
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
		
		if (roygbiv.contains("red")){
			modeOfTravel = "Horse!";
		}else if (roygbiv.contains("orange")) {
			modeOfTravel = "Dune Buggy!";
		}else if (roygbiv.contains("yellow")) {
			modeOfTravel = "Skateboard!";
		}else if (roygbiv.contains("green")) {
			modeOfTravel = "Row Boat!";
		}else if (roygbiv.contains("blue")) {
			modeOfTravel = "Bycicle!";
		}else if (roygbiv.contains("indigo")) {
			modeOfTravel = "Seguay!";
		}else {
			modeOfTravel = "Foot!";
		}
		
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
		a vacation home in *[location]*, and travel by *[mode of transporation]*.*/

		System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years with $" + retirementBalance + " in the bank, a vacation home in " + vacationSpot + ", and travel by " + modeOfTravel);
		
		
	}

}
