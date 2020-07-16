package Pro.lv1;

import java.util.Arrays;

public class Pro14 {

	public static void main(String[] args) {
		int[] d= {2,2,3,3};
		int budget =10;
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
		int hap=0;
		int count=0;
		for(int i=0;i<d.length;i++) {
			hap+=d[i];
			if(hap<=budget)
				count++;
			else
				break;
			
		}
		System.out.println(hap);
		System.out.println(count);
	}

}
