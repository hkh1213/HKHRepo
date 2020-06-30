package Programmers;

public class Pro25 {
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {

	int n=18;
	int m=n/3;
System.out.println(tr(n));
}
	public static int tr(int n) {
		int m=n/3;

		if(m==0) {
			System.out.println(sb.reverse());
			return 0;
		}
			
		if (n % 3 == 1) {
			sb.append("1");
		}
		else if (n % 3 == 2) {
			sb.append("2");
		}
		else if( n%3==0){
			sb.append("4");
		}
		if(m>3) {
		if(m%3==1)
			sb.append("1");
		else if(m%3==2||n%9==0)
			sb.append("2");
		else if(m%3==0&&n%9!=0)
			sb.append("4");
		}
		return tr(m);
	}
}
