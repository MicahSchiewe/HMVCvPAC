package edu.baylor.cs5352.hmvc.framework;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Controller<M extends Model<?>> {
	private M model;
	private Controller<?> parent;
	private List<Controller<?>> children;

	public abstract void handleRequest(IRequest req);
}
