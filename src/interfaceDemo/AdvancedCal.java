package interfaceDemo;

public class AdvancedCal implements Calc {

	public static void main(String[] args)
	{
		
		 AdvancedCal obj1= new  AdvancedCal();
		 obj1.add();
		 obj1.sub();
		 obj1.calculateSin();
		 obj1.calculateCos();

	}
	
	public void calculateSin()
	{
		System.out.println("i am in advance Calc- sin method");
		
	}

	@Override
	public void add() 
	{
		 System.out.println("I am in add class");
		
	}
	public void calculateCos()
	{
		System.out.println("i am in advance Calc- cos method");
		
	}

	@Override
	public void sub() 
	{
		 System.out.println("I am in sub class");
		
	}

}
