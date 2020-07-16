package Pro.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro3 {

	public static void main(String[] args) {
		System.out.println("java start!!");
		
		int[] answer= {};
		int[] arr= {10};

		int[] arr1= {10};
		Integer b[] = Arrays.stream(arr).boxed().toArray(Integer[]::new); 
		for(int i=0; i< b.length; i++) {
			System.out.println("b  :" + b[i]);
		}
		
		
		//List<Integer> numList = Arrays.asList(b); 
		//asList 는 고정된 사이즈 리스트를 반환하기 때문에 구조를 수정하는 어떤 메소드도 지원하지 않는다고 하네요
		List<Integer> numList = new ArrayList<>();
		for(Integer temp : b) 
			numList.add(temp);
		for(int i=0; i< numList.size(); i++) 
			System.out.println("numList : " + numList.get(i));
		
		
		int iInt =(Math.min(arr[0], findMin(arr,0,arr.length-1)));
		
		System.out.println("iInt : "+ iInt);
		
		Integer iInteger =new Integer(iInt);
		System.out.println("iInteger : "+ iInteger);
		
			if(Arrays.equals(arr, arr1)) {
					numList.add(-1);
					numList.remove(numList.get(0));
			}
				else 
				numList.remove(iInteger);
			
		answer=numList.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(answer));
	
		System.out.println("java end!!");
	}
	public static int findMin(int[] answer,int st,int end) {
		int min;
		if(st==end) {
			min= answer[st];
		}
		else 
			min= Math.min(answer[st], findMin(answer, st+1,end));
		
		return min;
	}

}
