package edu.baylor.cs5352.hmvc.framework;

import javax.swing.JPanel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class View<C extends Controller<?>, M extends Model<?>> extends JPanel {
	/** */
	private static final long serialVersionUID = 1L;

	private C controller;

	private M model;
}
