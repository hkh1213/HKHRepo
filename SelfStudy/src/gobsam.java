
public class gobsam {

	public static long gb(long n,long m) {
	
		if(gb(m,m)==1)
			return n+m;
		if(n%m!=0)
			return -1;
		else
			return gb(n/m,m);
		
	}

}
