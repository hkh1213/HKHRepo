package NewPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class phonenumber {

	public static void main(String[] args) {
		
		int n=123;
		String s = Integer.toString(n);
		String[] arr=s.split("");
		Integer[] intarray=new Integer[arr.length];
	    int i=0;
	    int count=0;
	    for(String str:arr){
	        intarray[i]=Integer.parseInt(str);
	        count= count+intarray[i];
	        i++;
	       
	    }
        System.out.println(count);

		
		
	}

}
