package classDemo;

public class FirstClassDemo {
	int x=90;
	int y=80;

	public static void main(String[] args) {
		FirstClassDemo fcd= new FirstClassDemo();
		fcd.sum();
		System.out.println(fcd.x);
		System.out.println(fcd.y);
		FirstClassDemo fcd1= new FirstClassDemo();
		fcd1.sum();
	
	
	}
	
	public void sum(){
		   int a=80;
		   int b=90;
		   int c=a+b;
		   System.out.println("Sum of two numbers are" + c);
	}

}
