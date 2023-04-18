package TempratureApplication;

import java.awt.Point;

public class CelsiusGUI extends TemperatureGUI {
	
	public CelsiusGUI(TemperatureModel model, Point location) {
		super("Celsius Temperature", model, location);
		addRaiseTempListener(() -> getModel().increaseC(1.0));
		addLowerTempListener(() -> getModel().increaseC(-1.0));
		addDisplayListener(() -> {
			double value = getDisplay();
			getModel().setC(value);
		});
	}
	
	@Override
	public void onUpdate(Double change) {
		
		setDisplay(change.toString());
	}
}