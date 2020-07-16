package Pro.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pro17 {

	public static void main(String[] args) {
		int answer = 0;
		int n=10;
		int[] lost= {1,3,5,6,10}; // notlost={3,5,6,9};
		int[] reserve={1,2,3,4,5,9};	// notlost={1,2,3,4,5,6,7,9}
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		List<Integer> iList=new ArrayList<Integer>();
		List<Integer> rList=new ArrayList<Integer>();
		List<Integer> lList=new ArrayList<Integer>();
		List<Integer> resultList=new ArrayList<Integer>();
		for(int i=0;i<lost.length;i++)
			iList.add(lost[i]);
		for(int i=0;i<reserve.length;i++)
			rList.add(reserve[i]);
		System.out.println(iList);
		System.out.println(rList);
		int count=0;
		for(int i=0;i<lost.length-count;i++) {
			for(int j=0;j<reserve.length;j++) {
				int it1=iList.get(i);
				int it2=rList.get(j);
				if((it1==it2||it1+1==it2||it1==it2+1)) {
					lList.add(iList.get(i));
					iList.remove(iList.get(i));
					count++;
					
					if(lost.length-count==0)break;
				}
			}
		}
		int result1=lost.length-lList.size();
		  resultList = lList.parallelStream().distinct().collect(Collectors.toList());
		System.out.println(resultList);
		int result=n-result1;
		System.out.println(result);
	}
	
	}

	
