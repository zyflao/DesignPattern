package service;

import java.util.ArrayList;

import service.api.Observers;
import service.api.Subject;

public class WaterData implements Subject {

	public WaterData() {
		observers = new ArrayList();

	}

	public String Temperature;/* ���� */
	public String Humidty;/* ʪ�� */
	public String Pressure;/* ��ѹ */
	public ArrayList<Observers> observers;/* ��ѹ */

	/* ���� */
	public String getTemperature() {
		return "100";
	}

	/* ʪ�� */
	public String getHumidty() {
		return "251";
	};

	/* ��ѹ */
	public String getPressure() {
		return "1111";
	};

	void measurementsChanged() {
		notifyObserver();
	};

	@Override
	public void registerObserver(Observers o) {
		observers.add(o);

	}

	@Override
	public void removerObserver(Observers o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observers observer = (Observers) observers.get(i);
			observer.update(Temperature, Humidty, Pressure);
		}

	}

	public void setMeasurements(String Temperature, String Humidty,
			String Pressure) {
		this.Temperature = Temperature;
		this.Humidty = Humidty;
		this.Pressure = Pressure;
		measurementsChanged();
	}
	public static void main(String arg[]) {

		WaterData waterData = new WaterData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(waterData);
		ZyfConditionsDisplay zyfConditionsDisplay = new ZyfConditionsDisplay(waterData);
		waterData.setMeasurements("223", "33", "上升");
		waterData.setMeasurements("11", "3", "xiajiang");

	}
}
