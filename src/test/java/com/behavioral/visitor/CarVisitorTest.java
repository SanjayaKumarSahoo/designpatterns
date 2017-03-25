package com.behavioral.visitor;


import org.junit.Test;

public class CarVisitorTest {

    @Test
    public void shouldVisitAllElements() {
        Car car = new Car();
        car.accept(new CarPrintElementVisitor());
    }
}
