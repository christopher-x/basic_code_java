package day05.Net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
    表示服务器的类：
        java.net.ServerSocket:此类实现服务器套接字
    构造方法：
    ServerSocket（int port） 创建绑定到特点端口的服务器套接字

    服务器段必须知道的是那个客户端请求的服务器
    所以可以使用accept方法获取到客户端的请求对象Socket
    成员方法：
        Socket accept（）侦听并接受到此套接字的连接

    服务器的实现步骤：
        创建服务器SrverSocket对象和系统要指定的端口号
        使用ServerSocket对象中的方法，获取到请求的客户端Socket
        使用Socket对象中的方法，getInputStream（）获取网络字节流Input
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("已收到".getBytes(StandardCharsets.UTF_8));
        socket.close();
        ss.close();
    }
}
