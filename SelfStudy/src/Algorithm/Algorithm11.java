package Algorithm;

public class Algorithm11 {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		StringBuffer s=new StringBuffer();
		s.append(bin(10,sb));
		System.out.println(s.reverse());
	}
	public static String bin(int n,StringBuilder sb) {
		if(n==0)
			return sb.toString();
	
		else if(n%2==1)
			sb.append("1");
			
		else if(n%2==0) 
			sb.append("0");
		
		return bin(n/2,sb);
		
			
		
	}
}
