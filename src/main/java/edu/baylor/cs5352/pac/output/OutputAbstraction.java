package edu.baylor.cs5352.pac.output;

import java.util.List;

import ecs.baylor.edu.cs5352.kwic_oo.MasterController;
import ecs.baylor.edu.cs5352.kwic_oo.impl.Alphabetizer;
import ecs.baylor.edu.cs5352.kwic_oo.impl.CircularShift;
import ecs.baylor.edu.cs5352.kwic_oo.impl.Lines;
import edu.baylor.cs5352.pac.root.Abstraction;
import lombok.Getter;

public class OutputAbstraction extends Abstraction<OutputControl> {
	private InputOutputHandle handle = new InputOutputHandle();

	private MasterController kwic = new MasterController(handle, new CircularShift(), new Alphabetizer(), handle);

	@Getter
	private Lines lines;

	public OutputAbstraction(OutputControl out) {
		setControl(out);
	}

	public void runKWIC(List<String> lines) {
		// Run algorithm
		handle.setBuffer(new Lines(lines));
		kwic.kwic();
		this.lines = handle.getBuffer();

		// Ship results
		getControl().pushLines(this.lines);
	}
}
