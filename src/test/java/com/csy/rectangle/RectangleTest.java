package com.csy.rectangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RectangleTest {
    Rectangle rectangle;

    @Before
    public void setUp(){
        rectangle = new Rectangle(1.5, 2.3);
    }

    @Test
    public void should_getArea() {
        double area = rectangle.getArea();
        Assert.assertEquals(1.5 * 2.3, area, 0.0);
    }

    @Test
    public void should_getPerimeter() {
        double perimeter = rectangle.getPerimeter();
        Assert.assertEquals((1.5 + 2.3) * 2, perimeter, 0.0);
    }
}