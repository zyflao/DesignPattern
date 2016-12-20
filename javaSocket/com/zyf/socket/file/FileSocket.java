package com.zyf.socket.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileSocket {
	public static void main(String[] args) {
		try {
			// 第一步闯将serverSocket 制定绑定的端口，并监听此端口
			ServerSocket serverSocket = new ServerSocket(8888);
			// 第二部开始监听，创建accept(),等待客户端调用
			System.out.println("***服务器启动，等待客户端链接***");
			Socket socket = serverSocket.accept();
			// 第三部 获取输入流
			InputStream is = socket.getInputStream();
			File f = new File("d:\\zyf1.txt");
			inputstreamtofile(is, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void inputstreamtofile(InputStream isr, File file) {
		try {
			FileOutputStream os = new FileOutputStream(file);
			int bytesRead = 0;
			byte[] buffer = new byte[8192];
			while ((bytesRead = isr.read(buffer, 0, 8192)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			os.close();
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}