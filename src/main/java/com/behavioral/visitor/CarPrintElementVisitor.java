package com.behavioral.visitor;


public class CarPrintElementVisitor implements CarElementVisitor {

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting Engine");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting Wheel");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting Body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting Car");
    }
}
