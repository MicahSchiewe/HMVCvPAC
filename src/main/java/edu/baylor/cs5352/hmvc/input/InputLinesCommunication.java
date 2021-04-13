package edu.baylor.cs5352.hmvc.input;

import edu.baylor.cs5352.hmvc.framework.IRequest;
import lombok.Value;

@Value
public class InputLinesCommunication implements IRequest {
	private String lines;
}
