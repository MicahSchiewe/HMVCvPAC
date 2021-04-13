package edu.baylor.cs5352.pac.window;

import javax.swing.JComponent;
import javax.swing.JFrame;

import edu.baylor.cs5352.pac.root.Presentation;

public class WindowPresentation extends Presentation<WindowControl> {
	/** */
	private static final long serialVersionUID = 1L;

	private JFrame frame;

	public WindowPresentation(WindowControl win) {
		frame = new JFrame();
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setControl(win);
	}

	public void showWindow() {
		frame.pack();
		frame.setVisible(true);
	}

	public void addToRoot(JComponent c) {
		add(c);
	}
}
