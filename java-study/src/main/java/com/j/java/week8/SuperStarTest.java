package com.j.java.week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperStarTest {
    SuperStar ss = new SuperStar("周杰伦");
//    Filmable ss2 = new SuperStar("林俊杰");

    @Test
    void actFilm() {
        ss.actFilm();
    }

    @Test
    void sing() {
        ss.sing();
    }

    @Test
    void showTV() {
        ss.showTV();
    }

    @Test
    void introduce() {
        ss.introduce();
    }
}