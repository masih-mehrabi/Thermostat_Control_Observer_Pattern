package TempratureApplication;

import java.awt.*;

public class KelvinGUI extends TemperatureGUI {
	
	public KelvinGUI(TemperatureModel model, Point location) {
		super("Kelvin Temperature", model, location);
		addDisplayListener(() -> {
			addRaiseTempListener(() -> getModel().increaseC(1.0));
			addLowerTempListener(() -> getModel().increaseC(-1.0));
			double value = getDisplay();
			getModel().setC(value);
		});
	}
	@Override
	public void onUpdate(Double change) {
		
		change = TemperatureConverter.convertCelsiusToKelvin(change);
		setDisplay(change.toString());
		
	}
}