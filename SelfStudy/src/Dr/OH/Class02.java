package Dr.OH;

import java.util.Arrays;

public class Class02 {

	public static void main(String[] args) {
		int data[] = {5,4,3,2,1};
		int count=5;
		System.out.println(Arrays.toString(bubblesort(data,count)));
	}
	public static int[] bubblesort(int[] data2,int n) {
		
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(data2[j]>data2[j+1]) {
					int tmp=data2[j];
					data2[j]=data2[j+1];
					data2[j+1]=tmp;
				}
			}
		}
		return data2;
		
	}
}
