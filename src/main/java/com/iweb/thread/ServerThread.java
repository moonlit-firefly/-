package com.iweb.thread;

import com.iweb.DAO.FunctionDAO;
import com.iweb.DAO.impl.FunctionImplementation;
import com.iweb.pojo.Humidity;
import com.iweb.pojo.Temperature;

import java.io.*;
import java.net.Socket;

/**服务器用来处理客户端的socket线程
 * 智能客服回复客户的线程
 * @author 陈郅治
 */
public class ServerThread extends Thread{
    //定义成员变量 方便访问和使用
    Socket socket;
    InputStream is;
    OutputStream os;
    DataInputStream dis;
    DataOutputStream dos;
    //定义一个ProductDAOImpl对象，方便在这个测试类中调用他的方法

    private static FunctionDAO fdi=new FunctionImplementation();

    /** 提供一个构造方法 用来服务器端调用线程的时候进行引用的传递
     * @param socket 当前操作的客户端socket对象
     */
    public ServerThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try{
            //服务器端智能回复
//            replay("你好，有什么需要我帮忙的吗？你可以问我一些关于我们产品的问题，" +
//                    "我是十分智能的客服，您一定会很满意我的服务。");
            while(true){
                //获取当前接入的客户端的输入流 并封装
                is = socket.getInputStream();
                dis = new DataInputStream(is);
                //借助输入流 读取socket对象中客户端所发送的消息
                String str = dis.readUTF();
                //将获取的数据通过,拆分成字符串数组
                String[] info=str.split(",");
                //如果接收的数据是湿度
                if(info[0].equals("hum")){
                    fdi.insertHumInfo(info[1]);
                }
                if(info[0].equals("temp")){
                    fdi.insertTempInfo(info[1]);
                }
                if(info[0].equals("lightIntensity")){
                    fdi.insertLightInfo(info[1]);
                }
                if(info[0].equals("soundIntensity")){
                    fdi.insertSoundInfo(info[1]);
                }
                //服务器端打印该消息
                System.out.println(str);

            }
        }catch (IOException e){
            try {
                socket.close();
            } catch (IOException ex) {
            }
        }

    }

    /**将str发送给客户端
     * @param str 需要回复给客户端的内容
     * @throws IOException
     */
    public  void replay(String str) throws IOException {
        os = socket.getOutputStream();
        dos = new DataOutputStream(os);
        dos.writeUTF("智能客服:"+str);
    }
}
