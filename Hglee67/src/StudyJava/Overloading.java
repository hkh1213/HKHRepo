package StudyJava;

public class Overloading {

	public static void main(String[] args) {
		Banana ol=new Banana();
		
		System.out.println(ol.sum(1, 1));
		sum(1,2);
		ol=null;
	}
	public static void sum(int a,int b) {
		System.out.println(a+"+"+b+":"+(a+b));
	}

}
