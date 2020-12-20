package day05.Net.upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    /*
    文件上传案例的客户端，读取本地文件，上传到服务器，读取服务器回写的数据

    明确：
        数据源：
        目的地：服务器
    实现步骤：
        创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        创建一个客户端Socket对象，构造方法中绑定服务器的IP和的端口号
        使用socket中的方法getOutputStream获取网络字节流输出流outputStream对象
        使用本地字节输入流FileInputStream对象中的read方法，读取本地文件
        使用网络字节输出流getOutputStream获取网络字节输入流InputStream对象
        使用网络字节输入流InputStream对象对象中的read读取服务器回写的数据
        释放资源（FileInputStream，Socket）
     */

    public static void main(String[] args) throws IOException {
        //创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("/Volumes/资料/下载.jpeg");
        //创建一个客户端Socket对象，构造方法中绑定服务器的IP和的端口号
        Socket so = new Socket("127.0.0.1",8888);
        //使用socket中的方法getOutputStream获取网络字节流输出流outputStream对象
        OutputStream os = so.getOutputStream();
        //使用本地字节输入流FileInputStream对象中的read方法，读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!= -1){
            //使用网络字节输出流getOutputStream获取网络字节输入流InputStream对象
            os.write(bytes,0,len);
        }
        so.shutdownOutput();
        //使用网络字节输入流InputStream对象对象中的read读取服务器回写的数据
        InputStream is = so.getInputStream();
        while((len = is.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        so.close();
    }
}
