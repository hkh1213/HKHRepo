package Pro.lv2;

import java.util.Arrays;

public class Pro28 {
	public static void main(String[] args) {
		int[] scoville = { 10,11,2,7,1 }; // > {3,5,9,10,11} > {9,10,11,13}
		int K =21;
		solution(scoville, K);
	}

	public static void solution(int[] scoville, int K) {
		Arrays.sort(scoville);
		
		int i = 0;
		int ans[] = new int[scoville.length];
		ans[0] = scoville[0] + (2 * scoville[1]);
		while (K >= ans[i]) {
			if (ans[i] >= scoville[i + 2])
				ans[i + 1] = 2 * ans[i] + scoville[i + 2];
			else
				ans[i+1]=2*scoville[i+2]+ans[i];
			
			Arrays.sort(scoville);
			System.out.println(Arrays.toString(ans));
			System.out.println(Arrays.toString(scoville));
			
			i++;
			System.out.println(i+1);
		}
	}
}