package NewPackage;

public class ObjectClass {
		int num;
		String str;
		int nums[];
		public int x,y;
	public ObjectClass(String n, int[] arr) {
 System.out.println("--ObjectClass--");
 System.out.println("s = "+ n);
 System.out.println("arr = " + arr);
	}
	public ObjectClass(int i) {
		System.out.println("Custom Constructer");
		num = i;
		
	}
	public ObjectClass() {
		System.out.println("Default Constructer");
		
	}
	protected void finalize() throws Throwable {
		System.out.println("--Finalize() method--");
		super.finalize();
	}
public ObjectClass(int x, int y) {	
	this.x=x;
	this.y=y;
}
	public void getInfo() {
		System.out.println("x ="+x);
		System.out.println("y ="+y);
}
}

