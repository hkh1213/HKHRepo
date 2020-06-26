package Programmers;

public class Pro251 {
static int n=0;
	public static void main(String[] args) {
		System.out.println(sol(3));
	}
	public static double sol(int num) {
		
		if(num==0)
			return 0;
		else 
			return sol(num-1)+Math.pow(3, num);
		
	}

}
