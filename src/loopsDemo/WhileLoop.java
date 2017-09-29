package loopsDemo;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int grade= 50;
		while(grade<80){
			
		
		System.out.println("the grade is"+ grade);
		grade+=2;
		}
		
		
		for(int inner=1; inner<10; inner++){
			for(int outer=1; outer<=inner; outer++){
				System.out.print(outer);
			}
			System.out.println();
			
		}

		for(int outer=1; outer<10; outer++){
			for(int inner=1; inner<=outer; inner++){
				System.out.print(inner);
			}
			System.out.println();
	}
			
		}
}
	


