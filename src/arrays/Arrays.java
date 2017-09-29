package arrays;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		  
		
		
//		 int a []= new int[5];
//		 a[0]=1;
//		 a[1]=2;
//		 a[2]=3;
//		 a[3]=4;
//		 a[4]=5;
		 
		     Random r= new Random();
		     int a[]=new int[50];
		  for(int i=0;i<a.length; i++){
			 
			  a[i]=r.nextInt(50);
		  }
		  try{
			  
		  
		 System.out.println(a[51]);
		  }
		 catch(Exception e){
		 }
		  
		  for (int i :a){
			  System.out.println(i);
		  }
	}

}
