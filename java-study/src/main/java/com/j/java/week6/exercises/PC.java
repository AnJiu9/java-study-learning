package com.j.java.week6.exercises;

/**
 * @ClassName PC
 * @Description TODO
 * @Author orange
 * @Date 19.10.20
 **/

public class PC {
    CPU cpu;
    HardDisk HD;

    public void setCpu(CPU c){
        cpu = c;
    }

    public void setHardDisk(HardDisk h){
        HD = h;
    }

    public void show(){
        System.out.println("CPU的速度："+cpu.getSpeed()+",HD的容量："+HD.getAmount());

    }}
