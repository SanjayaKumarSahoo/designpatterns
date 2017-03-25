package com.structural.adapter;


public class Rectangle implements Shape {

    LegacyRectangle legacyRectangle = new LegacyRectangle();

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        legacyRectangle.draw(x1, y1, x2, y2);
    }
}
