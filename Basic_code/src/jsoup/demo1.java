package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //获取document对象
        //1.1 根据xml文档来获取
        //1.2获取student.xml的path
        String path = demo1.class.getClassLoader().getResource("student.xml").getPath();
        //解析xml文档,加载文档进内存,获取dom树-->document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取元素对象 Element
        Elements name = document.getElementsByTag("name");
        System.out.println(name.size());
        //获取第一个element对象
        Element element = name.get(0);
        String text = element.text();
        System.out.println(text);

    }
}
