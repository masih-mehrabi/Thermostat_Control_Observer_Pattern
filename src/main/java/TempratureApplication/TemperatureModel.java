package TempratureApplication;

public class TemperatureModel extends Subject<Double> {
	
	private double celsiusTemperature;
	public TemperatureModel() {
		super();
	}
	public void setF(double tempF) {
		setC(TemperatureConverter.convertFahrenheitToCelsius(tempF));
	}
	public void setC(double tempC) {
		celsiusTemperature = tempC;
		super.notifyObservers(celsiusTemperature);
		
	}
	public void increaseF(double amount) {
		final double currentFahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsiusTemperature);
		final double newFahrenheit = currentFahrenheit + amount;
		
		setC(TemperatureConverter.convertFahrenheitToCelsius(newFahrenheit));
	}
	public double getCelsiusTemperature() {
		return this.celsiusTemperature;
	}
	public void increaseC(double amount) {
		setC(celsiusTemperature + amount);
	}
	public void setK(double tempK) {
		setC(TemperatureConverter.convertKelvinToCelsius(tempK));
	}
	
	public void increaseK(double amount) {
		final double currentKelvin = TemperatureConverter.convertCelsiusToKelvin(celsiusTemperature);
		final double newKelvin = currentKelvin + amount;
		setC(TemperatureConverter.convertKelvinToCelsius(newKelvin));
	}
}