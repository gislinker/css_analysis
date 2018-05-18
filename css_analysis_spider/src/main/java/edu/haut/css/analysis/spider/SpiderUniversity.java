package edu.haut.css.analysis.spider;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import edu.haut.css.analysis.spider.pojo.DataImpl;
import edu.haut.css.analysis.spider.pojo.DataInterface;
import edu.haut.css.analysis.spider.pojo.University;

public class SpiderUniversity {
	public static void main(String[] args) throws Exception {

		int page = 1;

		String resource = "mybatis-config.xml";

		InputStream in = Resources.getResourceAsStream(resource);

		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);

		SqlSession sqlSession = sessionFactory.openSession(true);
		
		DataInterface data= new DataImpl(sqlSession);
//		FileWriter file = new FileWriter("D:\\2.txt", true);
//		BufferedWriter out = null;
		for (int i = 1; i < 5; i++) {
			String url = "http://api.map.baidu.com/place/v2/search?query=大学&region=北京市海淀区&page_num=" + page
					+ "&page_size=20&output=json&ak=zL4FeviIgblHUimikN1ZLEaGKK3GsTbl";

			CloseableHttpClient httpClient = HttpClients.createDefault();

			HttpGet get = new HttpGet(url);

			CloseableHttpResponse response = httpClient.execute(get);
			HttpEntity entity = response.getEntity();
			String content = EntityUtils.toString(entity);

			JSONObject object = new JSONObject();

			if (object.toString().startsWith("{")) {

				Map map = object.parseObject(content, Map.class);

				List<University> list = JSON.parseArray(map.get("results").toString(),University.class);
				for (University university : list) {
					university.setName(university.getName());
					university.setAddress(university.getAddress());
					university.setLocation(university.getLocation());
					
					data.insertUniversity(university);
				}

//				String s = parseArray.toString();

				//System.out.println(s);
//				file.write(s);
//				file.flush();
			}
			page = i + 1;
		}
//		file.close();
	}

}