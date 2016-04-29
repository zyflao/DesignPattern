package SingletonTest;

import SingletonDao.MoreEmperpor;


public class EmperporTest {
	public static void main(String[] args) {
		int day = 2;
		for(int i=0;i<day;i++){
			//Emperpor em = Emperpor.getInstance();
			MoreEmperpor em = MoreEmperpor.getInstance();
			em.say();
		}
	}
}
