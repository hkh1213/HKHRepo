package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro26 {

	public static void main(String[] args) {
		int[] numbers= {6,52,1,21,45,7,106,25,226};
		String answer="";
		List<Integer> list=new ArrayList<Integer>();
		String starr[]=Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
		System.out.println(Arrays.toString(starr));
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(starr[i].charAt(0)>starr[j].charAt(0)) {
					String s=starr[i];
					starr[i]=starr[j];
					starr[j]=s;
				}
				
			}
	}for(int i=0;i<numbers.length-1;i++) {
		for(int j=0;j<Math.min(starr[i].length(),starr[i+1].length());j++) {
			if(starr[i].charAt(j)==starr[i+1].charAt(j)) {
				String s=starr[i];
				starr[i]=starr[i+1];
				starr[i+1]=s;
			}
			else if(starr[i].length()<starr[i+1].length()&&starr[i].charAt(j)==starr[i+1].charAt(j)) {
				if(starr[i].charAt(0)<starr[i+1].charAt(starr[i].length())) {
					String s=starr[i];
					starr[i]=starr[i+1];
					starr[i+1]=s;
				}
			}
			else if(starr[i].length()>starr[i+1].length()&&starr[i].charAt(j)==starr[i+1].charAt(j)) {
				if(starr[i].charAt(starr[i+1].length())>starr[i+1].charAt(0)) {
					String s=starr[i];
					starr[i]=starr[i+1];
					starr[i+1]=s;
				}
			}
			
		}
}

		System.out.println(Arrays.toString(starr));

}
}
