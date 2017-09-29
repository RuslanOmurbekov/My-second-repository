package interfaceDemo;

public class AdvancedCal2 implements Calc {

	public static void main(String[] args)
	{
		
		 Calc obj1= new  AdvancedCal2();
		 obj1.add();
		 obj1.sub();
		
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
