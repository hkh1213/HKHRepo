package Programmers;

public class Pro24 {
static int ans=0;
static String str="";
	public static void main(String[] args) {
		String s="abcde";
		int	answer=0;
		
		
		}
		public static int sol(int n) {
		if(n==0)
			return ans;
		else {
			ans+=n;
		return sol(n-1);
		}
	}
		public static String sl(String s,int k) {
			if(k==0)
				return str;
			else{
				str+=s.charAt(k-1)+"";
				
			return sl(s.substring(0,k-1),k-1);
			}
		}
	
}
	
