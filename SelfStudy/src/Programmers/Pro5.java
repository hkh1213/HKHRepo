package Programmers;


public class Pro5 {
	static int count=1;
	public static void main(String[] args) {
		long n=36;
		long answer=0;
		if(n==1)
			answer=4;
		if(n==2||n==3)
			answer=-1;
		System.out.println(gb(36,6));
		for(long i=2;i*i<=n;i++) {
			if(gb(n,i)!=-1)
			System.out.println(gb(n,i));
			else
				answer=-1;
		}
		
	}
	public static double gb(long n,long m) {
		if(n==m)
			return Math.pow(m+1, count);
		if(n%m!=0)
			return -1;
		else {
			count+=1;
			return gb(n/m,m);
		}
		
	}

}
