package Programmers;

public class Pro18 {
	public static void main(String[] args) {
		int answer = 0;
		int n=10;
		int[] lost= {1,3,5,6,10};
		int[] reserve={1,2,3,4,5,6,9,10};
		answer=n-lost.length;
		for(int i=0; i<lost.length; i++){
            boolean isc = false;
            int reversenum =0;
            int lostnum =lost[i];
            while(!isc){
                if(reversenum == reserve.length)
                	break;

                if(lostnum == reserve[reversenum]-1){ 
                    reserve[reversenum] = -1;
                    isc = true;
                }
                else if(lostnum == reserve[reversenum]+1){ 
                    reserve[reversenum] = -1;
                    isc = true;
                }
                else if(lostnum == reserve[reversenum]){ 
                    reserve[reversenum] = -1;
                    isc = true;
                }
                else
                	reversenum += 1;
            }
            if(isc) answer++;
        }
		System.out.println(answer);
	}
}
