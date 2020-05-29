package NewPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
public class Setusing {
	  public static List<Integer> getDistinctStream(List<Integer> originList) {
		  
	        List<Integer> resultList = new ArrayList<Integer>();
	 
	        resultList = originList.stream().distinct().collect(Collectors.toList());
	 
	        return resultList;
	    }
	

 
    public static void main(String[] args) {
    	int []arr= {5,5,6,6,1,1,2,2,3,4,5,5};
    	int[] answer = {};
        List<Integer> originList = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++) {
        	originList.add(arr[i]);
        }
        
        resultList = getDistinctStream(originList);
 
        System.out.println(resultList);
		/* return answer; */
 
        }
}