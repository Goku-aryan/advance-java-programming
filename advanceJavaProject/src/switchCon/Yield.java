package switchCon;

public class Yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 1;
		switch(day) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesdat");
		break;
		default : System.out.println("No-Day");
	    
		}
		String result = switch(day) {
			case 1 -> {
				System.out.println("This is day 1");
				yield "Monday";  // this will return without terminating the program
			}
			case 2 -> "Tuesday";
			default -> " No - Day";
		};
		System.out.println(result);
	}

}
