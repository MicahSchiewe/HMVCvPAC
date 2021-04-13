package edu.baylor.cs5352.pac.window;

import javax.swing.JComponent;

import edu.baylor.cs5352.pac.input.InputLinesCommunication;
import edu.baylor.cs5352.pac.root.Control;
import edu.baylor.cs5352.pac.root.ICommunication;

public class WindowControl extends Control<WindowPresentation, WindowAbstraction> {
	@Override
	public void handleEvent(ICommunication c) {
		// Somewhat lazy; likely work a bit harder to find recipient in a full implementation
		if (c instanceof InputLinesCommunication) {
			for (Control<?,?> child : getChildren()) {
				child.handleEvent(c);
			}
		}
	}

	public void addToUI(JComponent comp) {
		getPresentation().addToRoot(comp);
	}

	public void showUI() {
		getPresentation().showWindow();
	}
}
