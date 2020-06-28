package SelfStudty;

public class Star1 {

	public static void main(String[] args) {
		int st = 0; 
		int end = 2;
		int i = 0, j = 0;
		while (i < 7) {
			st++;
			if (end < j)
				System.out.print("*");
			else
				System.out.print(" ");
			j++;
			if (st % 4 == 0) {
				if (i < 3) {
					System.out.println();
					i++;
					end--;
					j = 0;
				} 
				else if(i==3){
					System.out.println();
					i++;
					end++;
					j = 0;
					end=0;
				}
				else {
					System.out.println();
					i++;
					end++;
					j = 0;
				}

			}
		}
	}
}
