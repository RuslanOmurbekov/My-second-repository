package loopsDemo;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		for(int i = 1; i<20;i=i+2){
			System.out.println("value is "+ i);
			
		}
		
		String name= "Rus the best";
		for(int ruske= 1; ruske<=20; ruske+=5){
		System.out.println("this is " + name +  ruske);
	}
		int arr[]={1,2,3,4};
		for(int j:arr){
			System.out.println(j);
		
	}
		int i=0;
		while(i<10){
        i++;
        System.out.println(i);
	

	}
		int j=0;
		do{
			System.out.println(j);
			j++;
		} while(j<=10);
			System.out.println(j);
		
			for(i=0; i<=10; i++){
				if(i==5){
					break;
				}
					System.out.println(i);
				
			}

}
}
