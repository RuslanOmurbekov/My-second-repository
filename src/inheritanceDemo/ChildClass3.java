package inheritanceDemo;

public class ChildClass3 extends BaseClass {
	public static void  main(String[]args) {
		
		
		ChildClass3 obj1= new ChildClass3();
		obj1.add();
		obj1.sub();
		
	} 

	
	
         public void mul(){
        	 System.out.println("Hey i am in class and multiplication is 2500");
         }
         public void div(){
        	 System.out.println("Hey i am in class and div is 50");
         }
}
