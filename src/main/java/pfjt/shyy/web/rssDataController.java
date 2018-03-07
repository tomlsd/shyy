package pfjt.shyy.web;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "/rssxml")

public class rssDataController {
    @RequestMapping("/news")
    public String rsslei(@RequestParam("url") String url) {
        String lei = url;
        String result = "";
        //        String url = "http://board2.finance.daum.net/gaia/do/xml/finance/read?bbsId=stock&articleId=1673473&pageIndex=1&viewObj=1:2:0";
        try {
            StringBuilder temp = new StringBuilder();
            URLConnection uc = new URL(url).openConnection();
            uc.setConnectTimeout(10000);
            uc.setDoOutput(true);
            InputStream in = new BufferedInputStream(uc.getInputStream());
            Reader rd = new InputStreamReader(in, "UTF-8");
            int c = 0;
            while ((c = rd.read()) != -1) {
                temp.append((char) c);
            }
            result = temp.toString();
//            System.out.println("XML: " + result);

            Document document = null;
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(url); // 读取XML文件,获得document对象
            Element root = document.getRootElement();
//          root.getName()
            System.out.println("lei:"+root.getName());
            for (Iterator i = root.elementIterator(); i.hasNext();) {
                Element el = (Element)i.next();
//                root.getName()
//                System.out.println("Element: " + el.getStringValue());
            }

//           获得指定节点下面的子节点
                   Element channel = root.element("channel");//首先要知道自己要操作的节点。
//            Element contactElem = root.element("channel");//首先要知道自己要操作的节点。
            System.out.println("根节点为:"+channel.getName());

            List<Element> contactList = channel.elements("item");
//            System.out.println("length:"+contactElem.);
int i=0;
            for (Element e:contactList){

                  System.out.println("channel根节点下边的所有子节点为:" + e.getName());

                System.out.println(i+"条新闻:title:" + e.element("title").getText());
                System.out.println(i+"条新闻:link:" + e.element("link").getText());
                System.out.println(i+"条新闻:comments:" + e.element("comments").getText());
                System.out.println(i+"条新闻:pubDate:" + e.element("pubDate").getText());
//                System.out.println(i+"条新闻:title:" + e.element("title").getText());

i++;
            }


            rd.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        return null;


    }
}
