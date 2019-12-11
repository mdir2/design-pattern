package com.design.pattern.decorator;

public abstract class Beverage {
	Size size = Size.SHORT;
	public enum Size {
		SHORT, TALL, GRANDE, VENTI;
	}
	protected String description;

	public String getDescription() {
		return description;
	}

	public void setSize(final Size size) {
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public abstract double cost();
}
