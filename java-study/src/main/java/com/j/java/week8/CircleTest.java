package com.j.java.week8;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    //父类的引用可以接收子类对象
    BaseShape shape = new Circle(3);

    @Test
    void getName() {
        shape.getName();
    }

    @Test
    void getArea() {
    }

    @Test
    void printArea() {
    }
}