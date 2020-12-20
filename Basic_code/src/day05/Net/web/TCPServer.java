package day05.Net.web;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8081);

        //创建一个socket连接，来接收访问信息
        Socket socket = server.accept();

        //将socket信息赋值给该函数进行输出
        InputStream is = socket.getInputStream();

        //每次去读的字节大小
        byte[] bytes = new byte[1024];
        int len = 0;
        //将读取到的内容全部输出
        while ((len = is.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = br.readLine();

    }
}
