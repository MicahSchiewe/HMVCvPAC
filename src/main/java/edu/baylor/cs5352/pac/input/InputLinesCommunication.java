package edu.baylor.cs5352.pac.input;

import edu.baylor.cs5352.pac.root.ICommunication;
import lombok.Value;

@Value
public class InputLinesCommunication implements ICommunication {
	private String lines;
}
