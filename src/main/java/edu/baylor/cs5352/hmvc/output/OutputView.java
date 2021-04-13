package edu.baylor.cs5352.hmvc.output;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import edu.baylor.cs5352.hmvc.framework.View;

public class OutputView extends View<OutputController, OutputModel> {
	/** */
	private static final long serialVersionUID = 1L;

	private JTextArea output;

	public OutputView(OutputController out, OutputModel model) {
		output = new JTextArea(20, 10);
		output.setEditable(false);
		JScrollPane scrolly = new JScrollPane(output);
		this.add(scrolly);
		this.setController(out);
		this.setModel(model);
	}

	public void update() {
		StringBuilder bldr = new StringBuilder();
		getModel().getLines().getLines().stream().forEach(line -> bldr.append(line).append("\n"));
		output.setText(bldr.toString());
		output.revalidate();
	}
}
