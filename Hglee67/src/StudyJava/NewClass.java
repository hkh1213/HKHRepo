package StudyJava;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int res;
		int oper,a,b;
		System.out.println("계산 입력(1:+,2:-,3:*,4:/,5:%)");
		oper=scn.nextInt();
		System.out.println("첫번쨰 숫자를 입력 :");
		a=scn.nextInt();
		System.out.println("두번째 숫자를 입력 :");
		b=scn.nextInt();
		res=calc(a,b,oper);
		System.out.printf("계산 결과는 : %d\n",res);
	}
	public static int calc(int a,int b,int op) {
		int result;
		switch(op) {
		case 1: result=a+b; break;
		case 2: result=a-b; break;
		case 3: result=a*b; break;
		case 4: result=a/b; break;
		case 5: result=a%b; break;
		default: result=0;break;
		}
		return result;
	}
}
