package edu.baylor.cs5352.pac.output;

import java.util.List;

import ecs.baylor.edu.cs5352.kwic_oo.impl.Lines;
import edu.baylor.cs5352.pac.input.InputLinesCommunication;
import edu.baylor.cs5352.pac.root.Control;
import edu.baylor.cs5352.pac.root.ICommunication;

public class OutputControl extends Control<OutputPresentation, OutputAbstraction> {

	@Override
	public void handleEvent(ICommunication c) {
		if (c instanceof InputLinesCommunication) {
			getAbstraction().runKWIC(List.of(((InputLinesCommunication) c).getLines().split("\n")));
		}
	}

	public void pushLines(Lines l) {
		StringBuilder bldr = new StringBuilder();
		l.getLines().stream().forEach(line -> bldr.append(line).append(System.lineSeparator()));
		getPresentation().renderLines(bldr.toString());
	}
}
