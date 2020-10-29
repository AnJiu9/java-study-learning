package com.j.java.week8;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * @ClassName FileCopy
 * @Description 使用IO流实现文件的复制
 * @Author orange
 * @Date 2020-10-29 08:55
 **/

public class FileCopy {
    public static void main(String[] args) throws IOException {
//        //1. 将源文件读入内存数组
//        File file1 = new File("/Users/orange/Movies/鬼怪/01. Stay With Me.mp4");
//        InputStream is = new FileInputStream(file1);
//        byte[] b = new byte[(int) file1.length()];
//        int readResult = is.read(b);
//        System.out.println(Arrays.toString(b));
//        System.out.println(readResult);
//
//        //2. 将内存数组中的值写入目标文件
//        File file2 = new File("/Users/orange/Pictures/" + UUID.randomUUID().toString() + ".mp4");
//        OutputStream os = new FileOutputStream(file2);
//        os.write(b);
//        os.close();
//        is.close();


        File file3 = new File("/Users/orange/Desktop/1.rtf");
        Reader read = new FileReader(file3);
        char[] b2= new char[(int) file3.length()];
        int readResult2 = read.read(b2);
        System.out.println(Arrays.toString(b2));
        System.out.println(readResult2);

        File file4 = new File("/Users/orange/Desktop/2.rtf");
        Writer write = new FileWriter(file4);
        write.write(b2);
        write.close();
        read.close();

    }
}
