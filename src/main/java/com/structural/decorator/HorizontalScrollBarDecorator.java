package com.structural.decorator;

public class HorizontalScrollBarDecorator extends AbstractWindowDecorator {

	public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}

	@Override
	public String getDescription() {	
		return super.getDescription() + ", including horizontal scrollbars";
	}

	private void drawHorizontalScrollBar() {
		System.out.println("Drawing horizontal scroll bar");
	}

}
