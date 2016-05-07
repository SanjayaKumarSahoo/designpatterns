package com.structural.decorator;

public class VerticalScrollBarDecorator extends AbstractWindowDecorator {

	public VerticalScrollBarDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", including vertical scrollbars";
	}

	private void drawVerticalScrollBar() {
		System.out.println("Drawing vertical scroll bar");
	}

}
