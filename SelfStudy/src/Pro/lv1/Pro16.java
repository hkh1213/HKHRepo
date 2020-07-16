package Pro.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pro16 {

	public static void main(String[] args) {
		
		String[] participant= {"a","mislav","b","c","mislav","b"};
		String[] completion= {"mislav","c","mislav","b","b"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		List<String> list =new ArrayList<String>();
		for(int i=0;i<participant.length;i++) {
		list.add(participant[i]);
		}
		
		for(int i=0;i<participant.length-1;i++) {
			list.remove(completion[i]);
			}
		System.out.println(list);
		String result=list.stream().map(n->String.valueOf(n)).collect(Collectors.joining());
	}

}
