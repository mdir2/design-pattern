package com.design.pattern.observe;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(final Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(final float temperature, final float humidity, final float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
