package NewPackage;

public class Arrayclass3 {

	public static void main(String[] args) {
		
		int[][] arr=new int[3][4];
		int i,k;
		int val=1;
		
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++) {
				arr[i][k] = val;
				val++;
			}
		}
		
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
	}

}
