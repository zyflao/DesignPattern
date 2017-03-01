package com.zyf.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		// 1 创建socket ，制定服务器地址和端口
		try {
			Socket socket = new Socket("localhost", 8888);
			// 输出流 ，给服务端发送消息
			OutputStream os = socket.getOutputStream();

			PrintWriter pw = new PrintWriter(os);
			pw.write("用户名：admin ,密码:1234");
			pw.flush();
			// 关闭输出流
			socket.shutdownOutput();

			// 获取输入流 得到服务器响应
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("服务端传送的消息:" + info);
			}
			socket.shutdownInput();

			br.close();
			is.close();
			pw.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
