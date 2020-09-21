package P1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Summer_Temperature {
	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		Summer_Temperature http = new Summer_Temperature();

		http.SendGet();

	}

	public void SendGet() throws Exception {
		/*
		 * Date d=new Date(); SimpleDateFormat date= new SimpleDateFormat("yyyyMMdd");
		 * System.out.println("date :"+date.format(d));
		 */
		String date = "2020092006";
		String key = "ErAsOKr9XXxDlVbGwGEARx5X%2BO5sTL0Ark1N59jOP6KusH%2BMLk2L05SbnYSPSVjt0ln%2FWPZb2YQ6DLqMAG22eg%3D%3D";
		String url = "http://apis.data.go.kr/1360000/LivingWthrIdxService/getSenTaIdx?serviceKey=ErAsOKr9XXxDlVbGwGEARx5X%2BO5sTL0Ark1N59jOP6KusH%2BMLk2L05SbnYSPSVjt0ln%2FWPZb2YQ6DLqMAG22eg%3D%3D&areaNo=1100000000&time=2020092006&requestCode=A41";
		Node h = null;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestMethod("GET");
		con.addRequestProperty("User-Agent", USER_AGENT);
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			// System.out.println(inputLine);
			response.append(inputLine);

		}
		in.close();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			FileOutputStream output = new FileOutputStream("./PM10");
			output.write(response.toString().getBytes());
			output.close();

			Document doc = dBuilder.parse("./PM10");
			doc.getDocumentElement().normalize();

			Element body = (Element) doc.getElementsByTagName("body").item(0);
			Element items = (Element) body.getElementsByTagName("items").item(0);
			Element item = (Element) items.getElementsByTagName("item").item(0);

			int sum = 0;
			for (int i = 1; i < 9; i++) {
				int n = i * 3;
				h = item.getElementsByTagName("h" + n).item(0);
				sum += Double.parseDouble(h.getChildNodes().item(0).getNodeValue());

			}
			System.out.println(sum / 8);

			System.out.println(h.getChildNodes().item(0).getNodeValue());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
