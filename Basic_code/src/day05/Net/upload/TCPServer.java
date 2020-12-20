package day05.Net.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/*
    文件上传案例的服务器，读取客户端上传的文件，保存到服务器的硬盘，给客户端回写：上传成功

    明确：
        数据源：客户端上传的文件
        目的地：服务器的硬盘

    实现步骤：
        创建一个服务器ServerSocket对象，和系统要指定的端口号
        使用ServerSocket对象中的方法accept，获取到请求的客户端socket对象
        使用socket对象中的方法getInputStream，获取到网络输入流InputStream对象
        判断网络文件夹是否存在，不存在则创建
        创建一个本地字节输出流FileOutStream对象，构造方法中绑定要输出的目的地
        使用网络字节输入流getInputStream，对象中的方法read，读取客户端上传的文件
        使用本地字节输出流FileOutStream对象中的方法，write，把服务器得到的文件保存到服务器的硬盘上
        使用socket对象中的方法，getInputStream获取到网络字节输出流outputStream对象
        使用网络字节输出流outputStream对象中的方法，write，给客户端回写，上传成功
        释放资源：FileOutStream，socket，serversocket
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        // 创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);


        while (true){
            new Thread(new Runnable(){
                @Override
                public void run() {
                    try{
                        Socket sk = server.accept();
                        InputStream is = sk.getInputStream();
                        String filename = "TestForMac"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                        File file = new File("/Users/christopher/Downloads/"+filename);
                        if(file.exists()){
                            file.mkdirs();
                        }
                        FileOutputStream fos = new FileOutputStream(file);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes))!= -1){
                            fos.write(bytes,0,len);
                        }
                        sk.getOutputStream().write("上传成功，".getBytes(StandardCharsets.UTF_8));
                        fos.close();
                        sk.close();
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
        //server.close();
    }
}
