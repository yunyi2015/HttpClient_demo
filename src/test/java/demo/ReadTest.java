package demo;

import java.io.IOException;


public class ReadTest {
	
	private static void readjson() throws IOException{
//		UserInfo userinfo = new UserInfo();
//        String url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token="+get_acctoken()+"&openid="+OpenID+"&lang=zh_CN";
//        HttpWebRequest req = (HttpWebRequest)WebRequest.Create(url);//请求数据
//        //use GET method to get url's html
//        req.Method = "GET";
//        //use request to get response
//        HttpWebResponse resp = (HttpWebResponse)req.GetResponse();//获取返回结果
//        //otherwise will return messy code
//        //  Encoding htmlEncoding = Encoding.GetEncoding(htmlCharset);
//        StreamReader sr = new StreamReader(resp.GetResponseStream(), Encoding.UTF8);//以UTF8标准读取流
//        //read out the returned html
//        Dtring respHtml = sr.ReadToEnd();//将从头到尾读到的数据存成字符串
//        //以上是数据的读取，将json数据包转换成字符串的过程，下面解析字符串           
//        JObject obj = (JObject)JsonConvert.DeserializeObject(respHtml);//引用using Newtonsoft.Json.Linq;将json字符串转换成一个json对象
//        userinfo.nickname = obj["nickname"].ToString();//要访问json数据包的哪个值直接访问json对象就可以了
//        userinfo.headimgurl = obj["headimgurl"].ToString();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadTest.readjson();

	}

}
