package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //获取document对象
        //1.1 根据xml文档来获取
        //1.2获取student.xml的path
        String path = demo2.class.getClassLoader().getResource("student.xml").getPath();
        //解析xml文档,加载文档进内存,获取dom树-->document
        //Document document = Jsoup.parse(new File(path), "utf-8");
        String str="<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t\t<name>tom</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t<name>jerry</name>\n" +
                "\t<age>128</age>\n" +
                "\t<sex>female</sex>\n" +
                "</student>\n" +
                "\n" +
                "</students>";
        Document parse = Jsoup.parse(str);
        System.out.println(parse);

    }
}
