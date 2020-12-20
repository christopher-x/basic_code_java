package day05.Net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    TCP通信的客户端，向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
    表示客户端的类
        java.net.Socket:此类实现客户端套接字（也可以叫"套接字"）套接字是两台机器间通信的端点
        套接字：包含了IP地址和端口号的网络单位

    构造方法：
        Socket（String host，int port）创建一个流套接字并将其连接到指定主机上的指定端口号
        参数：
            String host：服务器主机的名称/服务器的IP地址
            IP port ：服务端口
    实现步骤：
        创建一个客户端对象socket，构造方法绑定服务器的IP地址和端口号
        使用Socket对象中的getoutStream获取网络字节输入流对象
        使用网络字节输出流对象总的write方法，给服务器发送数据
        使用socket对象中的方法，获取网络字节输入流对象
        使用网络字节输入流对象中的read方法，读取服务器回写的数据
        关闭连接
            
 */
public class TCPClient {
    public static void main(String[] args) throws  Exception{
        Socket socket = new Socket("127.0.0.1",8888);
        //使用Socket对象中的getoutStream获取网络字节输入流对象
        OutputStream os = socket.getOutputStream();
//        使用Socket对象中的getoutStream获取网络字节输入流对象
        os.write("你好，我是你爹～".getBytes(StandardCharsets.UTF_8));
        InputStream is = socket.getInputStream();
        int read = is.read();
//        关闭连接
        System.out.println(read);

    }
}
