package SingletonDao;

import java.util.ArrayList;
import java.util.Random;

public class MoreEmperpor {
	private MoreEmperpor(){}
	private MoreEmperpor(String name) {
		nameList.add(name);
	}
	private static int maxEmperor = 2;//实例化bean最大个数
	private static ArrayList<String> nameList = new ArrayList<String>();
	private static ArrayList<MoreEmperpor> emperorList = new ArrayList<MoreEmperpor>();
	private static int countNumofEmperor = 0 ;//当前bean序号
	
	static{
		System.out.println("初始化");
		for(int i=0;i<maxEmperor;i++){
			
			emperorList.add(new MoreEmperpor("yunfeng"+i));
		}
	}
	public static MoreEmperpor getInstance(){
		Random random = new Random();
		//随机拉出一个皇帝，只要是个精神领袖就成
		countNumofEmperor = random.nextInt(maxEmperor);
		System.out.println(countNumofEmperor);
		return emperorList.get(countNumofEmperor);
		}
		//皇帝发话了
		public static void say(){
		System.out.println(nameList.get(countNumofEmperor));
		}
}
