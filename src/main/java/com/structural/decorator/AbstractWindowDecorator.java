package com.structural.decorator;

public abstract class AbstractWindowDecorator implements Window {

	private final Window windowToBeDecorated;

	public AbstractWindowDecorator(Window windowToBeDecorated) {
		this.windowToBeDecorated = windowToBeDecorated;
	}

	@Override
	public void draw() {
		windowToBeDecorated.draw();
	}

	@Override
	public String getDescription() {
		return windowToBeDecorated.getDescription();
	}

}
