package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
       //获取文件路径
        String path = demo3.class.getClassLoader().getResource("student.xml").getPath();
        //获取document对象
        Document document = Jsoup.parse(new File(path),"utf-8");
        //获取元素对象
        //获取所有student对象
        Elements student = document.getElementsByTag("student");
//        System.out.println(student);

        //获取属性名id为1的对象
        Element elementById = document.getElementById("1");
        System.out.println(elementById);
        //获取number属性值为001的值
        Elements number = document.getElementsByAttributeValue("number", "001");
//        System.out.println(number);

        Elements id1 = document.getElementsByAttribute("id");
        System.out.println(id1);
    }

}
