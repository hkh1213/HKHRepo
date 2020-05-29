
public class algorithm1 {
public static void main(String[] args) {

	System.out.println(fb(10));
}

		public static int fb(int n){
			int result; 
			if (n<2)
			result=n;
			else
			result= fb(n-1) + fb(n-2);
		return result;
	}

}
