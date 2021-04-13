package edu.baylor.cs5352.hmvc.window;

import edu.baylor.cs5352.hmvc.framework.Model;

public class WindowModel extends Model<WindowView> {
	public WindowModel(WindowView win) {
		setView(win);
	}
}
