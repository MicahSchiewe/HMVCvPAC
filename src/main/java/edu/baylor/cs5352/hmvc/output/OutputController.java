package edu.baylor.cs5352.hmvc.output;

import java.util.List;

import edu.baylor.cs5352.hmvc.framework.Controller;
import edu.baylor.cs5352.hmvc.framework.IRequest;
import edu.baylor.cs5352.hmvc.input.InputLinesCommunication;

public class OutputController extends Controller<OutputModel> {
	@Override
	public void handleRequest(IRequest c) {
		if (c instanceof InputLinesCommunication) {
			getModel().runKWIC(List.of(((InputLinesCommunication) c).getLines().split("\n")));
		}
	}
}
