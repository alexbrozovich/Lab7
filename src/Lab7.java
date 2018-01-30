import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// create a big loop
		char contChar = 'y';
		while (contChar == 'y') {
			// create parallel arrays for students and their related pieces of information
			String students[];
			String favoriteFood[];
			String major[];

			students = new String[] { "Alex Brozovich", "Willoughby McCormick", "Ronald Reagan", "Dave Thomas",
					"Alvah Curtis Roebuck" };
			favoriteFood = new String[] { "Tacos al Pastor", "Raw Peppercorns",
					"Pizza with anchovies, sardines, and pickles", "Square Hamburgers", "Home cooking" };
			major = new String[] { "Leisure Studies", "Agriculture", "Economics", "Culinary Arts", "Sales" };

			// prompt the user for the number of the student to get information about
			int userIn = Validator.getInt(scan,
					"Please enter the number for the student you want information about (1-5 inclusive)", 1,
					students.length);
			System.out.printf("Student number %d's name is %s \n", userIn, students[userIn]);

			// prompt the user for the type of information they would like about the student
			String userStr = Validator.getString(scan,
					"Would you like to know about this student's favorite food or their major? \n Enter 'food' or 'major'\n");

			// make them
			boolean inputGood = false;
			while (inputGood == false) {
				if (userStr.equalsIgnoreCase("food")) {
					System.out.printf("%s's favorite food is %s \n", students[userIn], favoriteFood[userIn]);
					inputGood = true;
				} else if (userStr.equalsIgnoreCase("major")) {
					System.out.printf("%s's major is %s \n", students[userIn], major[userIn]);
					inputGood = true;
				} else {
					System.out.println("Sorry, I didn't recognize that command. Please try again.");
					System.out.println("Enter 'food' or 'major' \n");
				}
			}
			System.out.println("Would you like to continue with another student? y/n \n");
			char userChar = scan.next().charAt(0);
			if (userChar != 'y') {
				contChar = userChar;
				System.out.println("See ya later!");
			}
		}
	}
}
