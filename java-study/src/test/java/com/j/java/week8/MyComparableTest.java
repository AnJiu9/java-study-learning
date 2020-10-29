package com.j.java.week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyComparableTest {
    MyComparable m;

    @Test
    public void compareTo() {
        News news1 = new News(1001,"大事件",1000);
        News news2 = new News(1002,"树洞",100);
        m = news1;
        int result = m.compareTo(news2);
        System.out.println(result);
        assertEquals(900,result);

        System.out.println("----------------------");
        Student s1 = new Student("ada",20);
        Student s2 = new Student("aba",21);
        m = s1;
        result = m.compareTo(s2);
        System.out.println(result);
        assertEquals(2,result);
    }
}