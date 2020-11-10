package com.j.datastructure.binarytree;

import java.util.Scanner;

/**
 * @ClassName Grade
 * @Description
 * @Author orange
 * @Date 2020-11-09 18:37
 **/

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩：");
        double score = input.nextDouble();
        if (score > 70 && score <= 79) {
            System.out.println("中");
        } else {
            if (score > 80 && score <= 89) {
                System.out.println("良");
            } else {
                if (score >= 90) {
                    System.out.println("优");
                } else {
                    if (score < 60) {
                        System.out.println("不及格");
                    } else {
                        System.out.println("及格");
                    }
                }
            }
        }
    }
}
