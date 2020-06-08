package Dr.OH;

import java.util.Arrays;

public class Code1 {

	public static void main(String[] args) {
		Person01 first;
		first=new Person01();
		first.name="John";
		first.number="202001";
		
		Person01[] members=new Person01[10];
		members[0]=first;
		members[1]=new Person01();
		members[1].name="Jane";
		members[1].number="202002";
		
		System.out.println(first.name);
		System.out.println(first.number);

		System.out.println(members[1].name);
		System.out.println(members[1].number);

	}

}
