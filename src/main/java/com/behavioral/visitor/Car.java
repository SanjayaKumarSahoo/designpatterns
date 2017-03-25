package com.behavioral.visitor;


public class Car implements CarElement {

    private final CarElement[] elements;

    public Car() {
        this.elements = new CarElement[]{
                new Wheel(),
                new Engine(),
                new Body()};
    }


    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
