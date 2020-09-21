package P1;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
	public static void main(String[] args) throws IOException {

		/*
		 * String serviceKey=
		 * "ErAsOKr9XXxDlVbGwGEARx5X%2BO5sTL0Ark1N59jOP6KusH%2BMLk2L05SbnYSPSVjt0ln%2FWPZb2YQ6DLqMAG22eg%3D%3D";
		 * StringBuilder urlBuilder = new StringBuilder(
		 * "http://apis.data.go.kr/1360000/LivingWthrIdxService/getWindChillIdx"); URL
		 * urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") +
		 * "="+serviceKey); Service Key urlBuilder.append("&" +
		 * URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
		 * 지점코드 urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" +
		 * URLEncoder.encode("10", "UTF-8")); 2017년6월8일6시 urlBuilder.append("&" +
		 * URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("xml",
		 * "UTF-8")); xml, json 선택(미입력시 xml) urlBuilder.append("&" +
		 * URLEncoder.encode("areaNo","UTF-8") + "=" + URLEncoder.encode("1100000000",
		 * "UTF-8")); xml, json 선택(미입력시 xml) urlBuilder.append("&" +
		 * URLEncoder.encode("time","UTF-8") + "=" + URLEncoder.encode("2020081806",
		 * "UTF-8")); xml, json 선택(미입력시 xml) urlBuilder.append("&" +
		 * URLEncoder.encode("requestCode","UTF-8") + "=" + URLEncoder.encode("A41",
		 * "UTF-8")); xml, json 선택(미입력시 xml)
		 */
		
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1360000/LivingWthrIdxService/getSenTaIdx?serviceKey=ErAsOKr9XXxDlVbGwGEARx5X%2BO5sTL0Ark1N59jOP6KusH%2BMLk2L05SbnYSPSVjt0ln%2FWPZb2YQ6DLqMAG22eg%3D%3D&pageNo=1&numOfRows=10&dataType=json&areaNo=1100000000&time=2020081806&requestCode=A41");
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;

		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {

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
		System.out.println(sb.toString());
	}
}
