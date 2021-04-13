package edu.baylor.cs5352.hmvc.input;

import edu.baylor.cs5352.hmvc.framework.Controller;
import edu.baylor.cs5352.hmvc.framework.IRequest;
import edu.baylor.cs5352.hmvc.framework.Model;

public class InputController extends Controller<Model<?>> {

	public void submitLines(String text) {
		getParent().handleRequest(new InputLinesCommunication(text));
	}

	@Override
	public void handleRequest(IRequest req) {
		// No events expected
	}
}
