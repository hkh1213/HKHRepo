package Pro.lv1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Pro1 {

	public static void main(String[] args) {
		int[] answer= {};
		long n=12345;
		String[] arr=Long.toString(n).split("");
		int[] array = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> intarr=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			intarr.add(array[array.length-1-i]);
		}
		answer=intarr.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(answer));
		/* return answer; */
	}

}
