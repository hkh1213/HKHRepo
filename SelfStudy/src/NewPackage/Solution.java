package NewPackage;

import java.util.Arrays;

public class Solution{
	public static void main(String[] args) {
	
	int answers[]= {1,2,3,1,2,3,1,2,3,1};

	int arr1[]= {1,2,3,4,5};

	int arr2[]= {2,1,2,3,2,4,2,5};
	
	int arr3[]= {3,3,1,1,2,2,4,4,5,5};
	
for(int j=0;j<=4;j++) {
		if(arr1[j]%5==0) {
			if(arr1[j]==answers[j]) {
				System.out.print(arr1[j]);
			}else {
				
			}
		
			break;
		}else {
			if(arr1[j]==answers[j]) {
				System.out.print(arr1[j]);
			}else {
	
			}
		}
	}
for(int j=0;j<=7;j++) {
	if(arr2[j]%5==0) {
		if(arr2[j]==answers[j]) {
			System.out.print(arr2[j]);
		}else {

		}
	
		break;
	}else {
		if(arr2[j]==answers[j]) {
			System.out.print(arr2[j]);
		}else {
	
		}
	}
}
for(int j=0;j<=9;j++) {
	if(arr3[j]%5==0) {
		if(arr3[j]==answers[j]) {
			System.out.print(arr3[j]);
		}else {
		
		}
	
		break;
	}else {
		if(arr3[j]==answers[j]) {
			System.out.print(arr3[j]);
		}else {
			
		}
	}
}
	}
}

