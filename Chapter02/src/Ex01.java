import java.util.Scanner;

public class Ex01{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	int a,m,d,n,result,i;
	a= scn.nextInt();
	m= scn.nextInt();
	d= scn.nextInt();
	n= scn.nextInt();
	result=a*m+d;
	if(n==1) {
		System.out.println(a);
	}
	else {
	for(i=1;i<n-1;i++) {
		result= result*m+d;
	}
	System.out.println(result);
	}

}
}