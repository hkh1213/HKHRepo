package Algorithm;

public class Algorithm10 {
	public static void main(String[] args) {
		fbn(10);
	}
	public static void fbn(int n) {
		 if(n!=0) {
	            int bn = n%2; 
	            fbn(n/2);
	            System.out.print(bn);
	        }
}
}
