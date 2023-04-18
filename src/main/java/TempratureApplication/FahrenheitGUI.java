package TempratureApplication;

import java.awt.Point;

public class FahrenheitGUI extends TemperatureGUI {
	
	public FahrenheitGUI(TemperatureModel model, Point location) {
		super("Fahrenheit Temperature", model, location);
		addRaiseTempListener(() -> getModel().increaseF(1.0));
		addLowerTempListener(() -> getModel().increaseF(-1.0));
		addDisplayListener(() -> {
			double value = getDisplay();
			getModel().setF(value);
			
		});
	}
	@Override
	public void onUpdate(Double change) {
		change = TemperatureConverter.convertCelsiusToFahrenheit(change);
		setDisplay(change.toString());
	}
}