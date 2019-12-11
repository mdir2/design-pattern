package com.design.pattern.observe;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(final Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(final float temp, final float humidity, final float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}
}
