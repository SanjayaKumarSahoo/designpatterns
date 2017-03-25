package com.structural.bridge;


public abstract class Shape {

    // composition
    protected final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}
