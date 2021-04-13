package edu.baylor.cs5352.hmvc.input;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import edu.baylor.cs5352.hmvc.framework.Model;
import edu.baylor.cs5352.hmvc.framework.View;

public class InputView extends View<InputController, Model<?>> {
	/** */
	private static final long serialVersionUID = 1L;

	private JTextArea input;

	public InputView(InputController in) {
		// Input area
		input = new JTextArea(20, 10);
		input.setEditable(true);
		JScrollPane scrolly = new JScrollPane(input);

		// Submit button
		JButton submit = new JButton("KWIC");
		submit.addActionListener(e -> getController().submitLines(input.getText()));

		// Main panel
		JPanel pane = new JPanel();
		pane.add(scrolly);
		pane.add(submit);

		// Add on
		this.add(pane);
		this.setController(in);
	}

	public void renderLines(String lines) {
		input.setText(lines);
	}
}
