package com.zyf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.text.AbstractDocument.BranchElement;

public class UrlTest {
	public static void main(String[] args) {
		try {
			URL imooc = new URL("http://www.imooc.com");
			URL url = new URL(imooc, "/video/2858?username=tom");

			System.out.println("协议：" + url.getProtocol());
			System.out.println("主机：" + url.getHost());
			// 没有设置端口号则返回默认-1
			System.out.println("端口：" + url.getPort());
			System.out.println("文件名：" + url.getPath());
			System.out.println("文件路径：" + url.getFile());
			System.out.println("相对路径：" + url.getRef());
			System.out.println("查询字符串：" + url.getQuery());

			InputStream iStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(iStream, "UTF-8");

			// 添加缓冲
			BufferedReader bReader = new BufferedReader(isr);
			String data = bReader.readLine();
			while (data != null) {
				System.out.println(data);
				data = bReader.readLine();
			}
			bReader.close();
			isr.close();
			iStream.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
