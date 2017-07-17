package headfirst.designpatterns.observer.weather;

public class CelsiusDisplay implements Observer, DisplayElement {

	WeatherData weatherData;
	float cTemp;
	
	
	public CelsiusDisplay(WeatherData w){
		weatherData = w;
		weatherData.registerObserver(this);
	}
	
	public void display(){
		System.out.println("Temperature in Celsius: " + cTemp);
	}
	
	public void update(float temp, float humidity, float pressure) {		
		cTemp = ((temp - 32)*5/9);
		display();
	}
}
