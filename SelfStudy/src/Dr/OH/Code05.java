package Dr.OH;

import java.util.Scanner;

public class Code05 {
	static Polynomial[] polys = new Polynomial[100];
	static int n = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while (true) {
			String command = kb.next();
			if (command.equals("create")) {
				char name = kb.next().charAt(0);
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].nTerms = 0;
				n++;
			} else if (command.equals("add")) { // add f 2 3
				char name = kb.next().charAt(0);
				int index=find(name);
				if(index==-1)
					System.out.println("Such Polynomial doesn't exsist");
				else {
					int c=kb.nextInt();
					int e=kb.nextInt();
					addTerm(polys[index],c,e);
				}
			} else if (command.equals("calc")) {

			} else if (command.equals("print")) {
				char name = kb.next().charAt(0);
				int index=find(name);
				if(index==-1)
					System.out.println("Such Polynomial doesn't exsist");

			} else if (command.equals("exit")) {

			}
		}
	}

	private static void addTerm(Polynomial p, int c, int e) {
		int index=findTerm(p,e);
		if(index!=-1) {
			p.terms[index].coef+=c;
		}
		else {
			int i=p.nTerms-1;
			while(i>=0&&p.terms[i].expo<e) {
				p.terms[i+1]=p.terms[i];
				i--;
			}
			p.terms[i+1]=new Term();
			p.terms[i+1].coef=c;
			p.terms[i+1].expo=e;
			p.nTerms++;
		}
		}

	private static int findTerm(Polynomial p, int e) {
		for(int i=0;i<p.nTerms&&p.terms[i].expo>=e;i++) {
			if(p.terms[i].expo==e)
				return i;
		}
		return -1;
	}

	private static int find(char name) {
		for(int i=0;i<n;i++) {
			if(polys[i].name==name)
				return 1;
			
		}
		return -1;
	}

}
