package Programmers;
import java.util.Arrays;
public class Pro28 {
	public static void main(String[] args) {
		int[] scoville= {1,2,3,9,10,11};
		int K=172;
		System.out.println(solution(scoville,K));
	}
	public static int solution(int[] scoville, int K) {
        Arrays.sort(scoville);
        int i=0;
        int ans[] =new int[scoville.length];
        int k=0;
        ans[0]=scoville[0]+(2*scoville[1]);
        while(true) {

        	if(ans[i]>K) {
        		k=i+1;
        		break;
        	}
             else if (ans[i]==K){
                 k=i;                                                                       
        		break;
             }
             else if(i+2>=scoville.length&&ans[i]<K){
            	 k=-1;
            	 break;
             }	
        	if(ans[i]>scoville[i+2]) {
        		ans[i+1]=scoville[i+2]+(2*ans[i]);
        	}
        	else {
        		ans[i+1]=ans[i]+(2*scoville[i+2]);
        	}
        	i++;
        }  
        return k;
    }
}