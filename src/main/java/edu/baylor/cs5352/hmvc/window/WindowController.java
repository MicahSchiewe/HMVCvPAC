package edu.baylor.cs5352.hmvc.window;

import edu.baylor.cs5352.hmvc.framework.Controller;
import edu.baylor.cs5352.hmvc.framework.IRequest;
import edu.baylor.cs5352.hmvc.input.InputLinesCommunication;

public class WindowController extends Controller<WindowModel> {
	@Override
	public void handleRequest(IRequest c) {
		// Somewhat lazy; likely work a bit harder to find recipient in a full implementation
		if (c instanceof InputLinesCommunication) {
			for (Controller<?> child : getChildren()) {
				child.handleRequest(c);
			}
		}
	}
}
