package Pro.lv1;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Pro20 {
static int n=0;
	public static void main(String[] args) {
	    int[] answer = {};
	    int[] arr= {3,2,6};
	    int divisor=10;
	    int count=0;
	    List<Integer> list=new ArrayList<Integer>();
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]%divisor==0) {
	    	list.add(arr[i]);
	    	count++;
	    	}
	    }
	    if(count==0)
	    	list.add(-1);
	    answer = list.stream().mapToInt(i->i).toArray();
	}
	

}
