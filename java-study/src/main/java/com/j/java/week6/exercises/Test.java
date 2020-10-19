package com.j.java.week6.exercises;

/**
 * @ClassName Test
 * @Description TODO
 * @Author orange
 * @Date 19.10.20
 **/

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);

        HardDisk disk = new HardDisk();
        disk.setAmount(200);

        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
