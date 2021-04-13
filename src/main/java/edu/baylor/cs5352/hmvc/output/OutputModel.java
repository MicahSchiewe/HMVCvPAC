package edu.baylor.cs5352.hmvc.output;

import java.util.List;

import ecs.baylor.edu.cs5352.kwic_oo.InputOutputHandle;
import ecs.baylor.edu.cs5352.kwic_oo.MasterController;
import ecs.baylor.edu.cs5352.kwic_oo.impl.Alphabetizer;
import ecs.baylor.edu.cs5352.kwic_oo.impl.CircularShift;
import ecs.baylor.edu.cs5352.kwic_oo.impl.Lines;
import edu.baylor.cs5352.hmvc.framework.Model;
import lombok.Getter;

public class OutputModel extends Model {
	private InputOutputHandle handle = new InputOutputHandle();

	private MasterController kwic = new MasterController(handle, new CircularShift(), new Alphabetizer(), handle);

	@Getter
	private Lines lines;

	public OutputModel(OutputView view) {
		setView(view);
	}

	public void runKWIC(List<String> lines) {
		// Run algorithm
		handle.setBuffer(new Lines(lines));
		kwic.kwic();
		this.lines = handle.getBuffer();
		getView().update();
	}
}
