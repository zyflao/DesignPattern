package server.Impl;

import server.Component;

/**
 * @author yunfeng.zang
 * @createTime 2017年3月1日上午10:59:21 代理类，用来代理ProxyBase
 */
public class ProxyC {

	private void dosomthing(Component c) {
		System.out.println("before do somthing！");
		c.dosomting();
		System.out.println("after do somthing！");
	}

	public static void main(String[] args) {
		ProxyC c = new ProxyC();
		ProxyBase pb = new ProxyBase();
		pb.dosomting();
		c.dosomthing(pb);
	}

}
