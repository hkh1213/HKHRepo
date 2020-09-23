package P1;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Other_Temperature {

	public static void main(String[] args) throws Exception{
		
		
		
		String apiUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst";
		// �솃�럹�씠吏��뿉�꽌 諛쏆� �궎
		String serviceKey = "ErAsOKr9XXxDlVbGwGEARx5X%2BO5sTL0Ark1N59jOP6KusH%2BMLk2L05SbnYSPSVjt0ln%2FWPZb2YQ6DLqMAG22eg%3D%3D";
		
        StringBuilder urlBuilder = new StringBuilder(apiUrl);
		String nx = "60";	//�쐞�룄
		String ny = "127";	//寃쎈룄
		String baseDate = "20200920";	//議고쉶�븯怨좎떢�� �궇吏� �씠 �삁�젣�뒗 �뼱�젣 �궇吏� �엯�젰�빐 二쇰㈃ �맖
		String baseTime = "2300";	//API �젣怨� �떆媛꾩쓣 �엯�젰�븯硫� �맖
		String dataType = "json";	//���엯 xml, json �벑�벑 ..
		String numOfRows = "153";	//�븳 �럹�씠吏� 寃곌낵 �닔 
		
		//�쟾�궇 23�떆 遺��꽣 153媛쒖쓽 �뜲�씠�꽣瑜� 議고쉶�븯硫� �삤�뒛怨� �궡�씪�쓽 �궇�뵪瑜� �븣 �닔 �엳�쓬
		
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "="+serviceKey);
		urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode(nx, "UTF-8")); //寃쎈룄
		urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode(ny, "UTF-8")); //�쐞�룄
		urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(baseDate, "UTF-8")); /* 議고쉶�븯怨좎떢�� �궇吏�*/
		urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode(baseTime, "UTF-8")); /* 議고쉶�븯怨좎떢�� �떆媛� AM 02�떆遺��꽣 3�떆媛� �떒�쐞 */
		urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode(dataType, "UTF-8"));	/* ���엯 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode(numOfRows, "UTF-8"));	/* �븳 �럹�씠吏� 寃곌낵 �닔 */
		
        /*
         * GET諛⑹떇�쑝濡� �쟾�넚�빐�꽌 �뙆�씪誘명꽣 諛쏆븘�삤湲�
         */
        URL url = new URL(urlBuilder.toString());
        //�뼱�뼸寃� �꽆�뼱媛��뒗吏� �솗�씤�븯怨� �떢�쑝硫� �븘�옒 異쒕젰遺� 二쇱꽍 �빐�젣
        //System.out.println(url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        String result= sb.toString();
        System.out.println(result);
        
        JSONParser parser = new JSONParser(); 
		JSONObject obj = (JSONObject) parser.parse(result); 
		// response �궎瑜� 媛�吏�怨� �뜲�씠�꽣瑜� �뙆�떛 
		JSONObject parse_response = (JSONObject) obj.get("response"); 
		// response 濡� 遺��꽣 body 李얘린
		JSONObject parse_body = (JSONObject) parse_response.get("body"); 
		// body 濡� 遺��꽣 items 李얘린 
		JSONObject parse_items = (JSONObject) parse_body.get("items");

		// items濡� 遺��꽣 itemlist 瑜� 諛쏄린 
		JSONArray parse_item = (JSONArray) parse_items.get("item");
		String category;
		JSONObject weather; // parse_item�� 諛곗뿴�삎�깭�씠湲� �븣臾몄뿉 �븯�굹�뵫 �뜲�씠�꽣瑜� �븯�굹�뵫 媛��졇�삱�븣 �궗�슜
		// 移댄뀒怨좊━�� 媛믩쭔 諛쏆븘�삤湲�
		String day="";
		String time="";
		
		
	
		
		
		try {
			for(int i=0;i<parse_item.size();i++) {
				JSONObject row=(JSONObject)parse_item.get(i);
				String wind=(String)row.get("category");
				if(wind.equals("WSD")) {
					String speed=(String)row.get("obsrValue");
					System.out.println("Wind Speed :"+speed);
				}
			}
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
}
			
	
	/*	for(int i = 0 ; i < parse_item.size(); i++) {
			weather = (JSONObject) parse_item.get(i);
			Object fcstValue = weather.get("fcstValue");
			Object fcstDate = weather.get("fcstDate");
			Object fcstTime = weather.get("fcstTime");
			//double�삎�쑝濡� 諛쏄퀬�떢�쑝硫� �븘�옒�궡�슜 二쇱꽍 �빐�젣
			//double fcstValue = Double.parseDouble(weather.get("fcstValue").toString());
			category = (String)weather.get("category"); 
			// 異쒕젰
			if(!day.equals(fcstDate.toString())) {
				day=fcstDate.toString();
			}
			if(!time.equals(fcstTime.toString())) {
				time=fcstTime.toString();
				System.out.println(day+"  "+time);
			}
			System.out.print("\tcategory : "+ category);
			System.out.print(", fcst_Value : "+ fcstValue);
			System.out.print(", fcstDate : "+ fcstDate);
			System.out.println(", fcstTime : "+ fcstTime);
		}catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		}
        
         * POP	媛뺤닔�솗瑜�	 %
         * PTY	媛뺤닔�삎�깭	肄붾뱶媛�
         * R06	6�떆媛� 媛뺤닔�웾	踰붿＜ (1 mm)
         * REH	�뒿�룄	 %
         * S06	6�떆媛� �떊�쟻�꽕	踰붿＜(1 cm)
         * SKY	�븯�뒛�긽�깭	肄붾뱶媛�
         * T3H	3�떆媛� 湲곗삩	 �꼦
         * TMN	�븘移� 理쒖�湲곗삩	 �꼦
         * TMX	�궙 理쒓퀬湲곗삩	 �꼦
         * UUU	�뭾�냽(�룞�꽌�꽦遺�)	 m/s
         * VVV	�뭾�냽(�궓遺곸꽦遺�)	 m/s
         
	        
	     */   
	   