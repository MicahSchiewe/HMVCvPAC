package edu.baylor.cs5352.pac.root;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Control<P extends Presentation<?>, A extends Abstraction<?>> {

	protected P presentation;
	protected A abstraction;

	private Control<?, ?> parent;
	private List<Control<?, ?>> children = new ArrayList<>();

	public abstract void handleEvent(ICommunication c);
}
