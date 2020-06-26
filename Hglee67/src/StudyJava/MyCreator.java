package StudyJava;

public class MyCreator {
	MyCreator(){
		System.out.println("나는 기본적으로 메모리 올라갈때 실행되는 생성자 함수");
	}
	MyCreator(String pName){
		this.name=pName;
		System.out.println("나는 원래 없지만,강제적으로 만든 되는 생성자 함수");

		System.out.println("pName :"+pName);
	}
	private String name;
	private String dept;
	private String email;

	public static void main(String[] args) {
		
		System.out.println("----1-----");

		MyCreator mc=new MyCreator();
		System.out.println("----2-----");
		MyCreator mc1=new MyCreator("기현");
		System.out.println("----3-----");
		}
	

}
