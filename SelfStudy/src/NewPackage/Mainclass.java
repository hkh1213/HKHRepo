package NewPackage;

public class Mainclass {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		ObjectClass obj1 = new ObjectClass("Hello", arr);
		ObjectClass obj4;
		obj4 = new ObjectClass();
		obj4 = new ObjectClass();
		
		System.gc(); // 가급적 gc가 빠르게 작동하도록 하는 명령어
		ObjectClass obj2 = new ObjectClass(10,20);
		obj2.getInfo();
	}

}
