package edu.baylor.cs5352.pac.root;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Abstraction<C extends Control<?,?>> {
	private C control;
}
