package jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class demo5 {
    public static void main(String[] args) throws IOException , XpathSyntaxErrorException {
       //获取文件路径
        String path = demo5.class.getClassLoader().getResource("student.xml").getPath();
        //获取document对象
        Document document = Jsoup.parse(new File(path),"utf-8");
        //根据document对象,创建jxdocument对学校
        JXDocument jxDocument = new JXDocument(document);
        //结合xpath查询
        //查询所有的student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("=============");
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name");
        for (JXNode jxNode1 : jxNodes1) {
            System.out.println(jxNode1);
        }
        System.out.println("=============");
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode2 : jxNodes2) {
            System.out.println(jxNode2);
        }
        System.out.println("=============");
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id=1]");
        for (JXNode jxNode2 : jxNodes3) {
            System.out.println(jxNode2);
        }
    }
}
