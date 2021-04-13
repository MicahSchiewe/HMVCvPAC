package edu.baylor.cs5352.pac;

import java.util.List;

import edu.baylor.cs5352.pac.input.InputControl;
import edu.baylor.cs5352.pac.input.InputPresentation;
import edu.baylor.cs5352.pac.output.OutputAbstraction;
import edu.baylor.cs5352.pac.output.OutputControl;
import edu.baylor.cs5352.pac.output.OutputPresentation;
import edu.baylor.cs5352.pac.window.WindowAbstraction;
import edu.baylor.cs5352.pac.window.WindowControl;
import edu.baylor.cs5352.pac.window.WindowPresentation;

public class PAC_KWIC {
	public static void main(String[] args) {
		// Output
		var out = new OutputControl();
		out.setAbstraction(new OutputAbstraction(out));
		out.setPresentation(new OutputPresentation(out));

		// Input
		var in = new InputControl();
		in.setAbstraction(null);
		in.setPresentation(new InputPresentation(in));

		// Window
		var win = new WindowControl();
		win.setAbstraction(new WindowAbstraction(win));
		win.setPresentation(new WindowPresentation(win));

		// Register
		win.addToUI(in.getPresentation());
		win.addToUI(out.getPresentation());
		in.setParent(win);
		out.setParent(win);
		win.setChildren(List.of(in, out));
		win.showUI();
	}
}
