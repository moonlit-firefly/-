package com.iweb.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**智能客服
 * @author 陈郅治
 */
public class Server {
    public static void main(String[] args) {
        try{
            //建立服务器对象
            ServerSocket ss = new ServerSocket(8888);
            //服务器需要不断的去接受来自客户端的请求
            //并且将客户端发送过来的socket对象的引用进行传递
            while (true){
                //获取客户端socket
                Socket socket = ss.accept();
                //将获取到的客户端socket对象的引用存入到list集合中
                synchronized (socket){
                    System.out.println("客户已经成功连接");
                }
                //每有一个新用户接入 都应该新建一个服务器端的线程 对该用户的数据进行处理
                new ServerThread(socket).start();
            }
        }catch (IOException e){
        }
    }
}
