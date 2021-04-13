package edu.baylor.cs5352.pac.root;

import javax.swing.JPanel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Presentation<C extends Control<?,?>> extends JPanel {
	/**
	 * Sate the serialization gremlins
	 */
	private static final long serialVersionUID = 1L;

	private C control;
}
