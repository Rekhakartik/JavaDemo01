import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class DoWhile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num = -1;
		do {
			// if condition is true , statement inside while loop is executed

			System.out.println("num is: " + num--);
		} while (num > 0);
		// evaluate (condition)==true

		// System.out.print(ln);

		char choice = '0';
		do {
			System.out.println("'1'.Condition statements");
			System.out.println("'2'.Loops");
			System.out.println("'3'.Push code to Remote repository");
			System.out.println("Choose one:");
			choice = (char)System.in.readNBytes(3)[0];
		} while (choice < '1' || choice > '3');
		System.out.println();
		switch (choice) {
		case '1':
			System.out.println("Today we have learned condition statement");
			break;

		case '2':
			System.out.println("Today we have learned Loops");
			break;
		case '3':
			System.out.println("Today we have learned Remote repository");
			break;

		}

	}

}
