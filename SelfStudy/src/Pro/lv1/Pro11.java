package Pro.lv1;

import java.util.Arrays;

public class Pro11 {

	public static void main(String[] args) {
		int[][] arr1= {{1,2},{3,4,8}}; int[][] arr2= {{2,3},{5,6,10}};
		System.out.println(arr1.length);
		System.out.println(arr2[0].length);

		int[][] result=new int[arr1.length][arr2[0].length];
		int[][] result2=new int[arr1.length][arr2[0].length];

		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				result[i][j]=arr1[i][j]+arr2[i][j];
				Integer a=result[i][j];
				result2[i][j]=a;
				System.out.println(a);
				a=null;
				
			}
			System.out.println(result2);
		}
		
	}

}
