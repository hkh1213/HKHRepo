package Algorithm;

public class Algorithm4 {
public static void main(String[] args) {
	System.out.println(cd(12,5));
}
	
	public static int cd(int m, int n) {
		
		if(m<n) {
			int tmp=m; m=n; n=tmp;
		}
		if(m%n==0)
			return n;
		else
			return cd(n,m%n);
		
	}

}