package edu.baylor.cs5352.hmvc.framework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model<V extends View<?,?>> {
	private V view;
}
