package com.zyf.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServiceTest {

	public static void main(String[] args) {

		try {
			// 第一步闯将serverSocket 制定绑定的端口，并监听此端口
			ServerSocket serverSocket = new ServerSocket(8888);
			// 第二部开始监听，创建accept(),等待客户端调用
			System.out.println("***服务器启动，等待客户端链接***");
			Socket socket = serverSocket.accept();
			// 第三部 获取输入流
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String info = null;
			String userName = null;
			while ((info = br.readLine()) != null) {
				System.out.println("客户传送的消息:" + info);
				userName = info.substring(4).split(",")[0];
			}
			System.out.println(userName);
			socket.shutdownInput();

			// 输出流 ，给服务端发送消息
			OutputStream os = socket.getOutputStream();

			PrintWriter pw = new PrintWriter(os);
			pw.write("欢迎您" + userName);
			pw.flush();
			// 关闭输出流
			socket.shutdownOutput();
			pw.close();
			os.close();

			br.close();
			isr.close();
			is.close();
			socket.close();
			serverSocket.close();
			System.out.println("***服务器启动，等待客户端链接***");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
