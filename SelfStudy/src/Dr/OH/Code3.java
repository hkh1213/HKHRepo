package Dr.OH;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code3 {
	static Person01[] members=new Person01[5];
	static int n=0;
	public static void main(String[] args) {
		try {
			Scanner scn=new Scanner(new File("input.txt"));
			while(scn.hasNext()) {
				String nm=scn.next();
				String num=scn.next();
				members[n]=new Person01();
				members[n].name=nm;
				members[n].number=num;
				n++;
			}
			scn.close();
		} catch (FileNotFoundException e) {
			System.out.println("warning");
		}
	bubbleSort();
	for(int i=0;i<n;i++) {
		System.out.println(members[i].name+""+members[i].number);
	}
	}
	private static void bubbleSort() {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(members[j].name.compareTo(members[j+1].name)>0) {//compare names of j=th and j+1-th person
					//swap two person
					Person01 tmp=members[j];
					members[j]=members[j+1];
					members[j+1]=tmp;
			}
			}
		}
	}
}