package edu.baylor.cs5352.pac.window;

import edu.baylor.cs5352.pac.root.Abstraction;

public class WindowAbstraction extends Abstraction<WindowControl> {
	public WindowAbstraction(WindowControl win) {
		setControl(win);
	}
}
