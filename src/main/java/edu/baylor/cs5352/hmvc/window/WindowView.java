package edu.baylor.cs5352.hmvc.window;

import javax.swing.JComponent;
import javax.swing.JFrame;

import edu.baylor.cs5352.hmvc.framework.View;

public class WindowView extends View<WindowController, WindowModel> {
	/** */
	private static final long serialVersionUID = 1L;

	private JFrame frame;

	public WindowView(WindowController win) {
		frame = new JFrame();
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setController(win);
	}

	public void showWindow() {
		frame.pack();
		frame.setVisible(true);
	}

	public void addToRoot(JComponent c) {
		add(c);
	}
}
