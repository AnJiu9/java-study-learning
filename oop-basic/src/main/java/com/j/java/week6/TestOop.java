package com.j.java.week6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TestOop
 * @Description TODO
 * @Author orange
 * @Date 15.10.20
 **/

public class TestOop {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id("10001101")
                .studentName("Amy")
                .gender("female")
                .phone(Phone.builder().brand("iPhone").price("5699").build())
                .build();
        Book[] books = new Book[]{
                Book.builder().bookName("Java").build(),
                Book.builder().bookName("JavaWeb").build(),
                Book.builder().bookName("JavaScript").build()
        };
        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        student.setBookList(bookList);
        for (Book book : student.getBookList()) {
            System.out.println(book.getBookName());
        }


    }
}
