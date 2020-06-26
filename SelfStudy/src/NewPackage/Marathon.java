package NewPackage;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Marathon {

	public static void main(String[] args) {
		
		LinkedList<String> arr1=new LinkedList<String>();
		String[] participant= {"Steve", "Lion", "Tiger","Tiger"};
		String[] completion= {"Lion","Steve","Tiger"};
		
		for(int i=0;i<participant.length;i++) {
		arr1.add(participant[i]);
		
		}
		for(int i=0;i<participant.length-1;i++) {
			arr1.remove(completion[i]);
			
			}
		String answer=arr1.stream().map(n -> String.valueOf(n)).collect(Collectors.joining());
		
		System.out.println(answer);
	}

}
