package service;

import service.api.DisplayElement;
import service.api.Observers;
import service.api.Subject;

public class ZyfConditionsDisplay implements Observers, DisplayElement{
	public ZyfConditionsDisplay(Subject w) {
		this.weatherData = w;
		weatherData.registerObserver(this);
	}

	public String Temperature;/* 气温 */
	public String Humidty;/* 湿度*/
	public String Pressure;/* ��ѹ */
	public Subject weatherData;/* ��ѹ */

	@Override
	public void Display() {
		System.out.println("气温:" + Temperature + ",湿度:" + Humidty+",气压:"+Pressure);
		
	}

	@Override
	public void update(String Temperature, String Humidty, String Pressure) {
		this.Temperature = Temperature;
		this.Humidty = Humidty;
		this.Pressure = Pressure;
		Display();
	}

}
