package NewPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BtoBB {

	public static void main(String[] args) throws IOException,NumberFormatException {
		
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] arr=s.split(" ");
		
		int r=Integer.parseInt(arr[0]);
		int g=Integer.parseInt(arr[1]);
		int b=Integer.parseInt(arr[2]);
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.print(i+" ");
					System.out.print(j+" ");
					System.out.print(k);
					System.out.println();
				}
			}
		}
		System.out.println(r*g*b);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}