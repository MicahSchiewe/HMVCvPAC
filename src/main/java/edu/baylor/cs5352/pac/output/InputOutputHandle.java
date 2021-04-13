package edu.baylor.cs5352.pac.output;

import ecs.baylor.edu.cs5352.kwic_oo.impl.Lines;
import ecs.baylor.edu.cs5352.kwic_oo.interfaces.IInput;
import ecs.baylor.edu.cs5352.kwic_oo.interfaces.IOutput;
import lombok.Data;

@Data
public class InputOutputHandle implements IInput, IOutput {
	private Lines buffer;

	@Override
	public void output(Lines lines) {
		buffer = lines;
	}

	@Override
	public Lines readInput() {
		return buffer;
	}
}