
/*
 *	2 - contorl flow statements
 *
 * if-else,switch case
 * 
 * 2 - loopings
 *  do..while, for loop
 * 
 */

public class Greeting {

	public static void main(String[] args) {

		int age = 18;

		if (age > 18) {
			System.out.println("Age is greater than 18");
		} else if (age == 18) {
			System.out.println("Age is equal 18");
		} else {
			System.out.println("Age is under 18");
		}

		int dayOfWeek = 3;

		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("number is not defined!");
		}

		// looping statement

		/*
		 * Multiline comments
		 */
		for (int i = 1; i <= 10; i++) {
			for (int j=1 ; j<=10; j++) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}

//		// while staement
//		int i = 11;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//
//		// do..while loop
//		i = 11;
//		do {
//			System.out.print(i++);
//		} while (i <= 10);

	}

}
