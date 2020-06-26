package StudyJava;

public class Banana {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		
	}
	public static int sum(int a,int b,int c, int d) {
		return a+b+c+d;
	}
	public static int sum(int a,int b) {
		return sum(a,b,0,0);
	}
	public static int sum(int a,int b,int c) {
		return sum(a,b,c,0);
	}
	
}
