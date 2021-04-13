package edu.baylor.cs5352.pac.input;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import edu.baylor.cs5352.pac.root.Presentation;

public class InputPresentation extends Presentation<InputControl> {
	/** */
	private static final long serialVersionUID = 1L;

	private JTextArea input;

	public InputPresentation(InputControl in) {
		// Input area
		input = new JTextArea(20, 10);
		input.setEditable(true);
		JScrollPane scrolly = new JScrollPane(input);

		// Submit button
		JButton submit = new JButton("KWIC");
		submit.addActionListener(e -> {
			getControl().submitLines(input.getText());
		});

		// Main panel
		JPanel pane = new JPanel();
		pane.add(scrolly);
		pane.add(submit);

		// Add on
		this.add(pane);
		this.setControl(in);
	}

	public void renderLines(String lines) {
		input.setText(lines);
	}
}
