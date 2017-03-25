package com.behavioral.visitor;


public interface CarElementVisitor {

    void visit(Engine engine);

    void visit(Wheel wheel);

    void visit(Body body);

    void visit(Car car);

}
