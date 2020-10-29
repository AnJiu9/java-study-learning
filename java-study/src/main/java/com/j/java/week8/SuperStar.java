package com.j.java.week8;

/**
 * @ClassName SuperStar
 * @Description
 * @Author orange
 * @Date 2020-10-29 11:02
 **/

public class SuperStar implements Filmable, Singable, TVable{
    private String name;

    public SuperStar() {
        super();
    }

    public SuperStar(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void actFilm() {
        System.out.println(this.name  + "演电影");
    }

    @Override
    public void sing() {
        System.out.println(this.name  + "会唱歌");
    }

    @Override
    public void showTV() {
        System.out.println(this.name  + "演电视");
    }

    public void introduce(){
        System.out.println(name + "是三栖明星");
    }
}
