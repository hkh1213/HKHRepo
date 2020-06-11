package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Pro23 {

	public static void main(String[] args) {
		int[] answers= {1,2,3,4,5};
		int[] arr1= {1,2,3,4,5};
		int count1=0;
		
		int[] arr2= {2,1,2,3,2,4,2,5};
		int count2=0;

		int[] arr3= {3,3,1,1,2,2,4,4,5,5};
		int count3=0;
		int j=0;
		for(int i=0;i<answers.length;i++) {
			
			if(answers[i]==arr1[j]) 
				count1++;
			j++;
			if((i+1)%arr1.length==0)
				j=0;
		}
		j=0;
		for(int i=0;i<answers.length;i++) {
		
			if(answers[i]==arr2[j]) 
				count2++;
			j++;
			if((i+1)%arr2.length==0)
				j=0;
		}
		j=0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==arr3[j]) 
				count3++;
			
			j++;
			if((i+1)%arr3.length==0)
				j=0;
		}
		List<Integer> list =new ArrayList<Integer>();
		int result=(count2>count1)?count2:count1;
		int result2= count3 > result? count3: result;
		if(result==count1)
			list.add(1);
		if(result==count2)
			list.add(2);
		if((count1==count2&&count2<count3)||result2==count3)
			list.add(3);
		
		
	}

}
