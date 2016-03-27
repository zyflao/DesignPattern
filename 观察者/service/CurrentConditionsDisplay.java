package service;

import service.api.DisplayElement;
import service.api.Observers;
import service.api.Subject;

public class CurrentConditionsDisplay implements Observers, DisplayElement {

	public CurrentConditionsDisplay(Subject w) {
		this.weatherData = w;
		weatherData.registerObserver(this);
	}

	public String Temperature;/* ���� */
	public String Humidty;/* ʪ�� */
	public String Pressure;/* ��ѹ */
	public Subject weatherData;/* ��ѹ */

	@Override
	public void Display() {
		System.out.println("�¶�:" + Temperature + ",ʪ��:" + Humidty);

	}

	@Override
	public void update(String Temperature, String Humidty, String Pressure) {
		this.Temperature = Temperature;
		this.Humidty = Humidty;
		Display();
	}

	public static void main(String arg[]) {

		WaterData waterData = new WaterData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(
				waterData);
		waterData.setMeasurements("22", "33", "");

	}
}
