package com.structural.bridge;


import org.junit.Test;

public class BridgePatternTest {

    @Test
    public void shouldPaintWithColor() {

        Shape redColorRectangle = new Rectangle(new RedColor());
        redColorRectangle.applyColor();

        Shape greenColorRectangle = new Rectangle(new GreenColor());
        greenColorRectangle.applyColor();
    }
}
