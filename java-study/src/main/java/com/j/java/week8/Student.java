package com.j.java.week8;

/**
 * @ClassName Student
 * @Description
 * @Author orange
 * @Date 2020-10-29 11:35
 **/


public class Student implements MyComparable{
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    @Override
    public int compareTo(Object obj) {
        Student other = (Student) obj;
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + "\'" +
                ",age = " + age +
                "}";
    }
}

