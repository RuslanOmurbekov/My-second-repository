package compilePolyMorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CompileDemo1 obj1= new CompileDemo1();
         obj1.add(45, 45);
         obj1.add(23, 34, 34);
 
	}
     public void add(int a,int b){
    	 int c=a+b;
    	 System.out.println("Sum of number is" + c);
     }
     public void add(int a,int b, int d){
    	 int c=a+b+d;
    	 System.out.println("Sum of number is" + c);
     }
     
}
