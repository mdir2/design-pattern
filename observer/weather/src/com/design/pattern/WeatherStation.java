package com.design.pattern;


// 자바 내부 라이브러리 이용
//import com.design.pattern.internal.CurrentConditionsDisplay;
//import com.design.pattern.internal.ForecastDisplay;
//import com.design.pattern.internal.StatisticsDisplay;
//import com.design.pattern.internal.WeatherData;

// 생성한 옵저버 패턴
import com.design.pattern.observe.CurrentConditionsDisplay;
import com.design.pattern.observe.ForecastDisplay;
import com.design.pattern.observe.StatisticsDisplay;
import com.design.pattern.observe.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

		currentConditionsDisplay.update(20, 44, 11.2f);
	}

}
