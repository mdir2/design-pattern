package com.design.pattern.observe;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(final Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(final Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		this.notifyObservers();
	}

	public void setMeasurements(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
