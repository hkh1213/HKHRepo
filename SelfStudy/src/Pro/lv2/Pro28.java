package Pro.lv2;

import java.util.Arrays;

public class Pro28 {
	static int i = 0;
	public static void main(String[] args) {
		int[] scoville = {1 ,3 ,5 ,8 ,9}; // > {3,5,9,10,11} > {9,10,11,13}
		int K =72;
		System.out.println(solution(scoville, K));

	}

	public static int solution(int[] scoville, int K) {
		int b;
		while(scoville[i]<K) {
		Arrays.sort(scoville);
		if(scoville[scoville.length-1]<K&&i==scoville.length-1)
			return -1;
		int a=scoville[i]+scoville[i+1]*2;
		scoville[i]=0;scoville[i+1]=a;
		i++;
		for(int j=0;j<scoville.length;j++) {
			for(int k=j+1;k<scoville.length-1;k++) {
				if(scoville[k]>scoville[k+1]) {
					b = scoville[k];
					scoville[k] = scoville[k+1];
					scoville[k+1] = b;
				}
			}
		}
	}
		return i;
	}
	
}