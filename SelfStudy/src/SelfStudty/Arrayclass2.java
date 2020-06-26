package SelfStudty;

public class Arrayclass2 {

	public static void main(String[] args) {
		
		long[] arr= {10,20,30,40,50};
		long count,size;
		count=arr.length;
		size=count*Integer.BYTES;
		System.out.println("배열 arr[]의 요소의 개수는 :" +count);
		System.out.println("배열 arr[]의 요소의 전체 크기는 :" +size);
	}

}
