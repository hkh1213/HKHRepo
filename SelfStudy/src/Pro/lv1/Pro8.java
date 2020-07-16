package Pro.lv1;

public class Pro8 {
	static long count=0;
	static long ans=0;

	
	  public int solution(int num) { 
		  long answer = 0;
		  answer=sol(num);
	  
		  return (int)answer;
	  
	  
	  }
	 
	
	public static long sol(long n) {
		
		if(n==1) {
			if(count>=500)
				return -1;
			else
			return count;
		}
		if(n%2==1) {
			count+=1;
			ans= sol((n*3)+1);
		}	
		if(n%2==0) {
			count+=1;
			ans= sol(n/2);

		}
		
		return ans;
	}
	

}
