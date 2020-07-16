package Pro.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro22 {

	public static void main(String[] args) {
		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30,1,21, 17,28};
		
		String str1="";
		String str2="";
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<n;i++) {
			String a1 = Integer.toBinaryString(arr1[i]);
			StringBuilder sb1=new StringBuilder();
			int count=a1.length();
			
			String a2 = Integer.toBinaryString(arr2[i]);
			StringBuilder sb2=new StringBuilder();
			int count2=a2.length();
			
			for(int j=0;j<n;j++) {
				if(count<n) {
				while(count<n) {
				sb1.append("0");
				count++;
				}
				}
				if(count2<n) {
					while(count2<n) {
					sb2.append("0");
					count2++;
					}
					}
			}
			sb1.append(a1);
			sb2.append(a2);
			String st1=sb1.toString();
			String st2=sb2.toString();
			for(int k=0;k<n;k++) {
			if(st1.charAt(k)=='0'&&st2.charAt(k)=='0') {
				sb3.append('0');
			}
			else {
				sb3.append('1');
			}
			}
		}
		String str=sb3.toString();
		String str4=str.replace('1','#');
		String st3=str4.replace('0',' ');
		List<String> list=new ArrayList<String>();
		String ans="";
		for(int l=0;l<n;l++) {
			int lastIndex = (l + 1) * n; 
			if(n > 1){
			    ans = st3.substring(l * n, lastIndex);
			  }else{
			    ans = st3.substring(l * n);
			  }
			list.add(ans);
		}
		String[] answer=new String[n];
		  for(int i=0;i<n;i++) {
			  answer[i]=list.get(i);
		  }
		  System.out.println(Arrays.toString(answer));
	}
		
	}


