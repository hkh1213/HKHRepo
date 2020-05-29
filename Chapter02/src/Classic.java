import java.util.Scanner;

public class Classic {
	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
boolean answer=true;
String s;
		s= scn.nextLine();
		if(s.length()==4) {
			for(int i=0;i<4;i++) {
				
				if(48<=s.charAt(i)&&s.charAt(i)<=57) {
					
					}else {
						System.out.println(!answer);
						
		        }
		
		} 
			System.out.println(answer);
			
		}
		else if(s.length()==6){
	         for(int j=0;j<6;j++) {
	        		
	     		if(48<=s.charAt(j)&&s.charAt(j)<=57) {
	     				
	     			}else {
	     				System.out.println(!answer);
	             }
	     	
	     }
	         System.out.println(answer);
}else {
	
}
}
}
