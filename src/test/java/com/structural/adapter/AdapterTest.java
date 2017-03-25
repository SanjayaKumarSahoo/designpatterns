package com.structural.adapter;


import com.structural.adapter.Line;
import com.structural.adapter.Rectangle;
import com.structural.adapter.Shape;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void shouldDraw() {
        Shape[] shapes = {new Line(), new Rectangle()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; ++i)
            shapes[i].draw(x1, y1, x2, y2);
    }
}
