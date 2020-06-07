package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pro18 {
	public static void main(String[] args) {
		
		int answer = 0;
		int n=10;
		int[] lost= {1,3,5,6,10}; // notlost={3,5,6,9};
		int[] reserve={1,2,3,4,5,6,9,10};	// notlost={1,2,3,4,5,6,7,9}
		answer=n-lost.length;
		for(int l=0; l<lost.length; l++){
            boolean isChk = false;
            int reverseIdx =0;
            int tmpLost =lost[l];
            while(!isChk){
                if(reverseIdx == reserve.length) break;

                if(tmpLost == reserve[reverseIdx]-1){ 
                    reserve[reverseIdx] = -1;
                    isChk = true;
                }else if(tmpLost == reserve[reverseIdx]+1){ 
                    reserve[reverseIdx] = -1;
                    isChk = true;
                }else if(tmpLost == reserve[reverseIdx]){ 
                    reserve[reverseIdx] = -1;
                    isChk = true;
                }else {reverseIdx += 1;};
            }
            if(isChk) answer++;
        }

		/*
		 * Arrays.sort(lost); Arrays.sort(reserve);
		 */

		int count=0;
		
	}
}
