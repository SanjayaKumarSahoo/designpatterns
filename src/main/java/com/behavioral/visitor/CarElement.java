package com.behavioral.visitor;


public interface CarElement {

    void accept(CarElementVisitor visitor);
}
