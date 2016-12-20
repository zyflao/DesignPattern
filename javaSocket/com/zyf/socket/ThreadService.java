package com.zyf.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CountDownLatch;

public class ThreadService extends Thread {

	Socket socket;

	ThreadService(Socket socket) {
		this.socket = socket;
	}

	public static void main(String[] args) {
		// 第一步闯将serverSocket 制定绑定的端口，并监听此端口
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			// 第二部开始监听，创建accept(),等待客户端调用
			System.out.println("***服务器启动，等待客户端链接***");
			int count = 0;
			while (true) {
				Socket socket = serverSocket.accept();
				ThreadService ts = new ThreadService(socket);
				ts.setPriority(4);// 多线程设置优先级
				ts.start();
				count++;
				System.out.println(count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		// 第三部 获取输入流
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		// 输出流 ，给服务端发送消息
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String info = null;
			String userName = null;
			while ((info = br.readLine()) != null) {
				System.out.println("客户传送的消息:" + info);
				userName = info.substring(4).split(",")[0];
			}
			socket.shutdownInput();

			os = socket.getOutputStream();

			pw = new PrintWriter(os);
			pw.write("欢迎您" + userName);
			pw.flush();
			// 关闭输出流
			socket.shutdownOutput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				if (os != null)
					os.close();
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
				if (is != null)
					is.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
