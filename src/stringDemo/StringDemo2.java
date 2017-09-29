package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expected= "Welcome to Selenium webDriver world";
		String actual= "Welcome to selenium WebDriver world";
		boolean status= expected.equalsIgnoreCase(actual);
		System.out.println("the status is " + status);

	}

}
