package inheritanceDemo;

public class ChildClass2 extends BaseClass {
	public static void  main(String[]args) {
		
		
		BaseClass obj1= new ChildClass2();
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
