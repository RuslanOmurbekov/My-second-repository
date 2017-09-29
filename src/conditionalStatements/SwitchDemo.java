package conditionalStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		int x= 6;
		switch(x){
		case 1:
			System.out.println("Performance is poor");
			break;
		case 2:
			System.out.println("Slow performer");
			break;
		case 3:
			System.out.println("Meeting expectation");
			break;
		case 4:
			System.out.println("emp of the year");
			break;
			default:
				System.out.println("You are fired");
		}
          
		int days= 8;
		switch (days){
		case 1:
			System.out.println("Today is Sunday");
			break;
		case 12:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday");
			break;
			default:
				System.out.println("There is no such a day");
			
			
		}
	}

}
