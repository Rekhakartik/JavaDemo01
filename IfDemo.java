
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// person >45 old otherwise young

		int age = 7;

		if (age < 4) {
			System.out.println("Age is less than allowed range for school");
		}
		if (age == 4) {
			System.out.println("Admit to Pre-K");
		}
		if (age == 5) {
			System.out.println("Admit to Kindergartner");
		}
		if (age == 6) {
			System.out.println("Admit to 1st Grade");
		}
		if (age == 7) {
			System.out.println("Admit to 2nd Grade");
		}
		if (age == 8) {
			System.out.println("Admit to 3rd Grade");
		}
		if (age == 9) {
			System.out.println("Admit to 4th Grade");
		}
		if (age == 10) {
			System.out.println("Admit to 5th Grade");
		}
		if (age == 11) {
			System.out.println("Admit to 6th Grade");
		}
		if (age == 12) {
			System.out.println("Admit to 7th Grade");
		}

		if (age == 13) {
			System.out.println("Admit to 8th Grade");
		} else {
			System.out.println("Age exceeds allowed range for school");
		}

		// Conditional Operators
		// ==, <, >, >=, == !=

		// WAP to calculate the division of the students when the percentage of the
		// marks are given
		int marks = 33;
		if (marks > 60) {
			System.out.println("First class");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("Second class");
		} else if (marks >= 40 && marks <= 50) {
			System.out.println("Third class");
		} else {
			System.out.println("Fail");
		}

	}
}