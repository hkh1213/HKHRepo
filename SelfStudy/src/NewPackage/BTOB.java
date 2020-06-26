package NewPackage;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BTOB {
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		int[] arr= {5,9,7,10};
		String[] strarr=arr.toString().split(",");
		int[] answer;
		int div=scn.nextInt();
		int i;
		int count=0;
		
		Arrays.sort(arr);
		ArrayList<String> stList = new ArrayList<>(Arrays.asList(strarr));

		for(i=0;i<arr.length-1;i++) {
		
			if(arr[i]%div!=0) {
					
				stList.remove(i);
			}
			
		
		}
		  
		
		answer =stList.stream().mapToInt(Integer::parseInt).toArray();
		System.out.println(answer.length);
		System.out.println(answer);
		
	        }
	        
			
	}
	

		

