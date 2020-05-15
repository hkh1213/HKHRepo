import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			System.out.println("년도를 입력하시오 : ");
			int a=scn.nextInt();
			if(a%4==0&&a%100!=0||a%400==0) {
				System.out.println(a+"년은 윤년입니다.");
			}else {
				System.out.println(a+"년은 윤년이 아닙니다.");
			}
		
	}

}
