import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Gene's Fortune Teller Program!");

		String firstName;
		System.out.println("Please enter your first name: ");
		firstName = input.nextLine();
		if (firstName.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}

		String lastName;
		System.out.println("Please enter your last name: ");
		lastName = input.nextLine();
		if (lastName.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}

		String age;
		System.out.println("Please enter your age: ");
		age = input.nextLine();
		if (age.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}
		int age1 = Integer.parseInt(age);

		String birthMonth;
		System.out.println("Please enter your birth month \"e.g.: 8 = August\"");
		birthMonth = input.nextLine();
		if (birthMonth.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}
		int birthMonth1 = Integer.parseInt(birthMonth);

		// Ask for ROYGBIV
		String roygbiv;
		System.out.println(
				"Please enter your favorite ROYGBIV color: \nDon't know what an ROYGBIV color is? Type 'help'.");
		roygbiv = input.nextLine().toLowerCase();
		if (roygbiv.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}

		// Type "Help" for ROYGBIV colors
		else if (roygbiv.contentEquals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet."
					+ " \nPlease enter your favorite ROYGBIV color; \n");
			roygbiv = input.nextLine().toLowerCase();
			
		
			while (roygbiv.contentEquals("help")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. "
						+ "\nPlease enter your favorite ROYGBIV color; \n");
				roygbiv = input.next().toLowerCase();
				if (roygbiv.contentEquals("quit")) {
					System.out.println("Thanks for using my program");
					System.exit(0);
				}
			}
		}
		
		switch (roygbiv) {
		case "red":
		case "orange":
		case "yellow":
		case "green":
		case "blue":
		case "indigo":
		case "violet":
			break;
		default:
			System.out.println("That was not a color, goodbye.");
			System.exit(0);
		}

		String siblings;
		System.out.println("How many siblings do you have?");
		siblings = input.next();
		if (siblings.contentEquals("quit")) {
			System.out.println("Thanks for using my program");
			System.exit(0);
		}
		int siblings1 = Integer.parseInt(siblings);

		
		int retirementAge;
		if (age1 % 2 == 0) {
			retirementAge = (birthMonth1 + age1) + siblings1;
		} else {
			retirementAge = (siblings1 + age1) + birthMonth1;
		}

		String vacationSpot;
		if (siblings1 < 0) {
			vacationSpot = "North Pole, Alaska";
		}

		switch (siblings1) {
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
		
		String modeOfTravel;
		switch (roygbiv) {
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
		default:
			modeOfTravel = "Foot";
		}
		
		double retirementBalance;
		switch (birthMonth1) {
		case 1:
		case 2:
		case 3:
		case 4:
			retirementBalance = birthMonth1 * age1 * siblings1;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			retirementBalance = siblings1 * age1 * birthMonth1;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			retirementBalance = age1 * siblings1 * birthMonth1;
			break;
		default:
			retirementBalance = 0;
		}

		
		System.out.println(
				firstName + " " + lastName + " will retire in " + retirementAge + " years with $" + retirementBalance
						+ " in the bank, a vacation home in " + vacationSpot + " \nand travel by " + modeOfTravel);

	}
}
