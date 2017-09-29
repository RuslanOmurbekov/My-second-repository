package conditionalStatements;

public class IfElseDemo {

	public static void main(String[] args) {
		
		
	String browser= "IE";
	if(browser.equalsIgnoreCase("Chrome")){
       System.out.println("TC executed on Chrome" );
       
		}else if(browser.equalsIgnoreCase("	Fairfox")){
			System.out.println("TC executed on  Fairfox" );
		       
			
		}
	else if (browser.equalsIgnoreCase("IE")){
		System.out.println("TC executed on  Fairfox" );
		
	}
	System.out.println("close");
	                
	
	   String name= "Ruslan";
	   String result="N";
	   int grade= 80;
	    if(grade>=90){
	    	result="A";
	    	
	    }else if (grade<95){
	    	result= "B";
	    }if (grade==99){
	    		result="A+";
	    	}else{
	    			result="B+";
	    		}if(grade<85){
	    		result="C";
	    			
	    		}
	    		System.out.println(name + " your score is " + result );
	    	}
	    	
	    
}    
	    	
	    

	


