package Programmers;

public class Pro6 {

	public static void main(String[] args) {
		int n=4;
		long answer = 0;
		if(Math.sqrt(n)%1==0)
			answer=(long)Math.pow(Math.sqrt(4)+1, 2);
		else
			answer=-1;
		
		System.out.println(answer);
	}
	

}
