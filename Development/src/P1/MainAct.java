package P1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainAct {

	public static void main(String[] args) throws Exception {
		Date d=new Date();
		SimpleDateFormat date= new SimpleDateFormat("yyyyMMdd");
		
		System.out.println("현재 날짜 :"+date.format(d));
		System.out.println(date.format(d).substring(4));
		int da=Integer.parseInt(date.format(d).substring(4));
	if(da>=515&&da<=1015) {
		Summer_Temperature http = new Summer_Temperature();

		http.SendGet();

	}
	else {
		Other_Temperature http = new Other_Temperature();

		//http.sendGet();

	}
	

	}

}
