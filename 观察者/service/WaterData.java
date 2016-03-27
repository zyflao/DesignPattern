package service;

import java.util.ArrayList;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;

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
		return "1��";
	}

	/* ʪ�� */
	public String getHumidty() {
		return "25";
	};

	/* ��ѹ */
	public String getPressure() {
		return "�½�";
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

}
