package Programmers;

public class Pro27 {

	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        int i=0;
        int j=0;
        while(i<phone_book.length) {
        	
        	if(phone_book[i].length()<phone_book[j].length()&&phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))&&i!=j) {
        		answer=false;
        		break;
        	}
        	else if(j==phone_book.length-1) {
        		j=-1;
        		i++;
        		answer=true;
        	}
        	j++;
        	
        	
        }
        return answer;
    }
	public static void main(String[] args) {
		String[] starr= {"119","97674223","11195524421"};
		System.out.println(solution(starr));
	}
}
