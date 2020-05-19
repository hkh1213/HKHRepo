package NewPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class date {

	public static void main(String[] args)throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd") ;
	Scanner scn=new Scanner(System.in);
	int a,b;
	a=scn.nextInt();
	b=scn.nextInt();

		String day="";
		String date="2016";
		StringBuilder sb=new StringBuilder(date);
			sb.append("0"+a);
			sb.append("0"+b);
		
		String s=sb.toString();
		date=s;
		
	    Date nDate = dateFormat.parse(date) ;	
	     
	    Calendar cal = Calendar.getInstance() ;
	    cal.setTime(nDate);
	     
	    int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
	    
	    switch(dayNum){
        case 1:
            day = "SUN";
            break ;
        case 2:
            day = "MON";
            break ;
        case 3:
            day = "TUE";
            break ;
        case 4:
            day = "WED";
            break ;
        case 5:
            day = "THR";
            break ;
        case 6:
            day = "FRI";
            break ;
        case 7:
            day = "SAT";
            break ;
             
    }
     
     System.out.println(day);
	}
	}

