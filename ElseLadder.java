
public class ElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month = Integer.parseInt(args[0]);

		if (month==12||(month>=1&&month<=2)) {
			System.out.println("Winter season");
			
			
		}
		else if (month>=3 && month<=5) {
			System.out.println("Spring season");
			
			
		}else if (month>=6&&month<=8) {
			System.out.println("Summer season");
			
			
		}else if (month>=9&&month<=11) {
			System.out.println("Fall season");
			
			
		}	else {
			System.out.println("Invalid month");
		}
		
	}

}
