package service.api;

import java.awt.DisplayMode;

/**
 * �۲���ģʽ���� ��������֮��1�Զ�������ϵ����һ�����⣩����ı���֪ͨ���۲��ߣ��������ȥ�ı䣬����
 */
public interface Subject {

	public void removerObserver(Observers observers);

	public void notifyObserver();

	public void registerObserver(Observers observers);
}
