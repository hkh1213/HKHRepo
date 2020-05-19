package NewPackage;

public class aboutequals {

	public static void main(String[] args) {
		String answer="";
	String[] seoul = {"jung","eun","fuck","kim"};
	int a=0;
	for(int i=0;i<seoul.length;i++) {
		if(seoul[i].equals("kim")) {
			a=i;
		} //배열값을 같다고해줄때 배열은 객체이므로 equals.()를 사용해야함
		
	}

	StringBuilder sb =new StringBuilder();
	   sb.append("김서방은 ");
	   sb.append(a);
	   sb.append("에 있다");
	   answer=sb.toString();
	System.out.println(answer);
	}
}
