package com.structural.adapter;


public class Line implements Shape {

    LegacyLine legacyLine = new LegacyLine();

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        legacyLine.draw(x1, y1, x2, y2);
    }
}
