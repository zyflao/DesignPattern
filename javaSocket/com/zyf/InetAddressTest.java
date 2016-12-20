package com.zyf;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("ip" + address.getHostAddress());
		System.out.println("主机名" + address.getHostName());
		byte[] bytes = address.getAddress();
		System.out.println("字节形式ip" + Arrays.toString(bytes));
		System.out.println("本机地址：" + address);
	}
}
