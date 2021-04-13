package edu.baylor.cs5352.pac.input;

import edu.baylor.cs5352.pac.root.Abstraction;
import edu.baylor.cs5352.pac.root.Control;
import edu.baylor.cs5352.pac.root.ICommunication;

public class InputControl extends Control<InputPresentation, Abstraction<?>> {

	@Override
	public void handleEvent(ICommunication c) {
		// No events expected
	}

	public void submitLines(String text) {
		getParent().handleEvent(new InputLinesCommunication(text));
	}
}
