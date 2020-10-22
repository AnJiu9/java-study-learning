package com.j.java.week7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormatUtilTest {

    @Test
    public void format() {
        
    }

    @Test
    public void add(){
        int actual = FormatUtil.add(3,4);
        assertNotEquals(7,actual);
    }
}