package NewPackage;

public class Star22 {

	public static void main(String[] args) {
		int i=1;
		int j=3;
		int count=0;
	
		while(j<9) {
			System.out.println(j+"*"+i+"="+i*j);
			i++;
			count++;
			if(count%9==0) {
				j++;
				i=i-9;
			}
		
		}
		
	}

}
