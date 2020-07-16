package Pro.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro21 {

	public static void main(String[] args) {
		int N=10;
		int[] stages= {2,1,5,3,4,6,8,7,9,4,1,10,11,1,1,2,2,3,4,5,5,6,6,6};  //24명 중 10번 응시 2명 성공 1명
		Arrays.sort(stages);
		int[] err= new int[N+1];
		int count=0;
		int hap=0;
		for(int i=0;i<N;i++) {
			count=0;
			for(int j=0;j<stages.length;j++) {
			if(stages[j]==i+1) {
				count++;
			}
			err[i]=count;
		}
		}
		double[] ans= new double[N+1];
		for(int i=0;i<N+1;i++) {
			if(i==N)
				err[i]=0;
			ans[i]=(double)err[i]/(stages.length-hap);
			hap+=err[i];
			
			
	}
		int ans1[] = new int[N+1];
	for(int i=0;i<N+1;i++) {
		int j=0;
		while(true) {
			if((double)ans[i]>(double)ans[j]) {
				ans1[i]+=1;
			}
			j++;
			if(j==N	)
				break;
		}
		
		}
	List<Integer> dlist = new ArrayList<>();
	for(int k=0;k<N+1;k++) {
		int i=0;

		while(i<N) {
			
		if(ans1[i]==N-k)
			dlist.add(i+1);
			
		i++;
	}
	}
	int[] answer = dlist.stream().mapToInt(i->i).toArray();
	System.out.println(answer);
	}
}

