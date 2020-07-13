package SelfStudty;

public class Star2 {
public static void main(String[] args) {
	int m=3;

	for(int i=0;i<7;i++) {
		for(int j=3;j>=0;j--) {
			if(i<4) {
			if(i<j)
				System.out.print(" ");
			else
				System.out.print("*");
			}
			if(i>m) {
				if(j<m)
					System.out.print("*");
				else
					System.out.print(" ");
			}

		}

		if(i>=4) 
		m--;
		System.out.println();
	}
}
}
