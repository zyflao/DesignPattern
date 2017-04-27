package collection.set.settree;

import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月19日下午3:43:36 底层使用Treemap 实现，TreeMap
 *             是基于红黑树实现的（一种平衡二叉树，保证左右两个子树，高度差不超过1） 在排序的时候用到它，非线程安全，时间复杂度O(log2)
 */
public class SetTree {
	public static void main(String[] args) {
		Set ts = new TreeSet();
		ts.add("abc");
		ts.add("xyz");
		ts.add("rst");
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private void add(String string) {
		// TODO Auto-generated method stub

	}

}
