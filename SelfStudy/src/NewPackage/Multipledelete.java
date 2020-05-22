package NewPackage;

import java.util.ArrayList;
import java.util.List;

public class Multipledelete {

	public static void main(String[] args) {
		int []arr= {5,5,6,6,1,1,2,2,3,4,6,5,5};
    	int[] answer = {};
       ArrayList num = new ArrayList();
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i+1]==arr[i]) 
        		continue;
        		num.add(arr[i]);
        }
        		num.add(arr[arr.length-1]);
        		
        	System.out.println(num);	
	}
		
}
