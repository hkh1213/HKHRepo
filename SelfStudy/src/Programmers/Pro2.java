package Programmers;

public class Pro2 {

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
