package com.j.java.week9;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @ClassName RuntimeExceptionTest
 * @Description 运行时异常练习
 * @Author orange
 * @Date 2020-11-05 08:33
 **/

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        //1.ArithmeticException 算术异常
        //try-catch中放入可能产生异常的代码段
//        try {
//            System.out.println(3 / 0);
//        } catch (ArithmeticException e) {
//            System.err.println("除数不能为0！");
////            System.err.println(e.getMessage());
////            System.err.println(e.getCause());
////            System.err.println(e);
////            e.printStackTrace();
//            //界面弹出框
////            JOptionPane.showMessageDialog(null,"除数不能为0！");
//        }

        //2.从键盘输入一串字符，将其转为整型输出：NumberFormatException
        System.out.println("Please input:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("数字格式化异常");
        } finally {
            //应用场景：关闭数据库连接；线程资源的释放；流的关闭
            System.out.println("finish");
            scanner.close();
        }
        System.out.println(result);
        System.out.println("其他代码段");

//        //3.ArrayIndexOutOfBoundsException
//        int[] i = {1, 2, 3, 4, 5, 6};
//        try {
//            System.out.println(i[6]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("数组越界异常");
//
//        //4.空指针异常
//        String s = "";
//        if (s == null || "".equals(s)) {
//            System.out.println("账号不能为空");
//        }


//        if ("admin".equals(s)) {
//            System.out.println("success");
//        } else {
//            System.out.println("false");
//        }



    }
}
