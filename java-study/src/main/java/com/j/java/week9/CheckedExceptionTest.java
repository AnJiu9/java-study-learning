package com.j.java.week9;

import org.omg.DynamicAny._DynAnyFactoryStub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.SimpleTimeZone;

/**
 * @ClassName CheckedExceptionTest
 * @Description 编译时（可检查的）异常练习
 * @Author orange
 * @Date 2020-11-05 09:06
 **/


public class CheckedExceptionTest {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(new Date().getTime());
        System.out.println("begin:" + formatTimeByDate(System.currentTimeMillis()));
//        //long类型的时间戳
//
//        //------使用Date和SimpleDateFormat实现:线程不安全---------
//        long timeStamp = System.currentTimeMillis();
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(timeStamp);
//        String str = df.format(date);
//        System.out.println(str);
//
//        System.out.println("******************");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("中断异常");
        }
        System.out.println("end:" + formatTimeByLocalDateTime(System.currentTimeMillis()));


    }

    public static String formatTimeByDate(long timeStamp){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timeStamp);
        return df.format(date);
    }

    public static String formatTimeByLocalDateTime(long timeStamp){
        Instant instant = Instant.ofEpochMilli(timeStamp);
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localDateTime.format(formatter);
    }
//        //------使用LocalDatetime和DateTime实现:线程安全----------
//        Instant instant = Instant.ofEpochMilli(timeStamp);
//        ZoneId zone = ZoneId.systemDefault();
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String result = localDateTime.format(formatter);
//        System.out.println(result);





        //1.InterruptedException
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.err.println("中断异常");
//        }
//        System.out.println(System.currentTimeMillis());


//        while (true) {
//            int i = (int) (Math.random() * 100);
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                System.err.println("中断异常");
//            }
//            System.out.println(i);
//        }

}
