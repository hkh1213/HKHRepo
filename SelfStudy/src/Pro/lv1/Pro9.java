package Pro.lv1;

public class Pro9 {

	public static void main(String[] args) {
		String answer="";
		String phone_number="1234567890";
		String[] arr=phone_number.split("");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<phone_number.length();i++) {
			sb.append(arr[i]);
		}
		for(int i=0;i<phone_number.length()-4;i++) {
			sb.replace(i, i+1, "*");
		}
		System.out.println(sb);
	}

}
