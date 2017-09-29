package arrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		
		int student_id[]=new int[5];
         student_id[0]=(int)89.0;
         student_id[1]=10;
         student_id[2]=23;
         student_id[3]=34;
         student_id[4]=45;
         int sizeofArray=student_id.length;
         
         System.out.println("Length of the arrays are "+ sizeofArray);
         for(int i=0; i<sizeofArray; i++){
        	 System.out.println("student id is"+ student_id[i]);
        	 
         }
         String studentname[]= new String[5];	
         studentname[0]= "Ruslan";
         
	
	}

}
