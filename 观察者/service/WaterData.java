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

	public String Temperature;/* 气温 */
	public String Humidty;/* 湿度 */
	public String Pressure;/* 气压 */
	public ArrayList<Observers> observers;/* 气压 */

	/* 气温 */
	public String getTemperature() {
		return "1°";
	}

	/* 湿度 */
	public String getHumidty() {
		return "25";
	};

	/* 气压 */
	public String getPressure() {
		return "下降";
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
