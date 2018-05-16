package edu.haut.css.analysis.spider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class SpiderDessert {
	public static void main(String[] args) throws Exception {

		int page = 1;
		
		FileWriter file = new FileWriter("D:\\甜品.txt",true);
		BufferedWriter out = null;
		for (int i = 1; i < 10; i++) {
			String url = "http://api.map.baidu.com/place/v2/search?query=甜品&region=北京市海淀区&page_num=" + page
					+ "&page_size=20&output=json&ak=zL4FeviIgblHUimikN1ZLEaGKK3GsTbl";

			CloseableHttpClient httpClient = HttpClients.createDefault();

			HttpGet get = new HttpGet(url);

			CloseableHttpResponse response = httpClient.execute(get);
			HttpEntity entity = response.getEntity();
			String content = EntityUtils.toString(entity);

			JSONObject object = new JSONObject();

			if (object.toString().startsWith("{")) {

				Map map = object.parseObject(content, Map.class);

				JSONArray parseArray = JSON.parseArray(map.get("results").toString());

				String s = parseArray.toString();

				System.out.println(s);
				file.write(s);
				file.flush();
			}
			page = i + 1;
		}
		file.close();
	}
}
