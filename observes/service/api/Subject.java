package service.api;

import java.awt.DisplayMode;

/**
 * 观察者模式就是 两个对象之间1对多依赖关系。单一（主题）对象改变了通知（观察者）多个对象去改变，推送
 */
public interface Subject {

	public void removerObserver(Observers observers);

	public void notifyObserver();

	public void registerObserver(Observers observers);
}
