package com.j.java.week8;

/**
 * @ClassName News
 * @Description
 * @Author orange
 * @Date 2020-10-29 12:39
 **/

public class News implements  MyComparable{
    private Integer id;
    private String title;
    private Integer readCount;

    public News() {

    }

    public News(Integer id, String title, Integer readCount) {
        this.id = id;
        this.title = title;
        this.readCount = readCount;
    }

    @Override
    public int compareTo(Object obj) {
        News other = (News) obj;
        return this.readCount - other.readCount;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", readCount=" + readCount +
                '}';
    }
}
