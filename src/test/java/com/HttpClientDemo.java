package com;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSONObject;
/**
 * @author Yunyi
 *
 */
public class HttpClientDemo {

  @Test//(id="3",name="UAT 页面返回验证")
  public void testuat() throws IOException {
	  //save result
	 // HttpGet get = new HttpGet("http://www.weather.com.cn/data/sk/101110101.html");
	  String result;
	  HttpPost post = new HttpPost("https://uattest.tppension.cntaiping.com/");
	  CloseableHttpClient client = HttpClients.createDefault();
	  CloseableHttpResponse response = client.execute(post);

	  Map<String, String> head = new TreeMap<String, String>();//封装请求头
	  head.put("subsystem", "ZYT_APP");
	  head.put("subject", "ZYT_WT_001");
	  head.put("userId", "14641240");
	  head.put("APPID", "355312082256934");
	  head.put("serialNo", "ZYT_sdfsWT_001_sdsdfsdfs035");
	  head.put("transDate", "2018-11");
	  head.put("token", "TPP_ZYT");
	  head.put("sign", "ZYT_Tpp3ret58Opw");

	  Map<String, String> busi = new TreeMap<String, String>();//封装请求参数
	  busi.put("flag", "1"); 
	  busi.put("userName", "13761737854"); 
	  busi.put("pwd", "www123456"); 
	  busi.put("valicateCode", "0000");

	  Map<String, Map<String, String>> data = new  HashMap<String, Map<String, String>>();
	  data.put("head", head);
	  data.put("busi", busi);

	  //run post
	  System.out.println(JSONObject.toJSONString(data));
	  StringEntity entity = new StringEntity(JSONObject.toJSONString(data), Charset.forName("UTF-8"));
	  post.setEntity(entity);
	  System.out.println("----------------");

	  //return response
	  result = EntityUtils.toString(response.getEntity(),"utf-8");
	  System.out.println(result);
	  System.out.println(response.getStatusLine());
	  response.close();
	  client.close();
  }
}
