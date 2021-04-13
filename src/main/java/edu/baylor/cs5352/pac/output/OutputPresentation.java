package edu.baylor.cs5352.pac.output;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import edu.baylor.cs5352.pac.root.Presentation;

public class OutputPresentation extends Presentation<OutputControl> {
	/** */
	private static final long serialVersionUID = 1L;

	private JTextArea output;

	public OutputPresentation(OutputControl out) {
		output = new JTextArea(20, 10);
		output.setEditable(false);
		JScrollPane scrolly = new JScrollPane(output);
		this.add(scrolly);
		this.setControl(out);
	}

	public void renderLines(String lines) {
		output.setText(lines);
		output.revalidate();
	}
}
