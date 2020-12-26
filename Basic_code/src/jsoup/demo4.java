package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class demo4 {
    public static void main(String[] args) throws IOException {
       //获取文件路径
        String path = demo4.class.getClassLoader().getResource("student.xml").getPath();
        //获取document对象
        Document document = Jsoup.parse(new File(path),"utf-8");

        //查询Name标签
        /*
            div{

            }
         */
        Elements name = document.select("name");
//        System.out.println(name);
        //查询id值为1的元素
        Elements select = document.select("#1");
//        System.out.println(select);

        //获取student标签并且number属性值为001的age子标签
        Elements select1 = document.select("student[number=\"001\"]");
        System.out.println(select1);
        System.out.println("=============");
        Elements select2 = document.select("student[number=\"001\"] > age");
        System.out.println(select2);
    }

}
