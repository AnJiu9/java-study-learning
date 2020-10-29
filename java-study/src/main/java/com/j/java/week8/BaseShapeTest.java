package com.j.java.week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseShapeTest {

    @Test
    public void print() {
        BaseShape bs = new BaseShape() {
            @Override
            public double getArea() {
                return 0;
            }
        };
//        bs.print();
//        String name = bs.getName();
//        assertEquals("hello",name);

    }
}