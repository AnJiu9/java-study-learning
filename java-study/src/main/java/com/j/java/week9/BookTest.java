package com.j.java.week9;

/**
 * @ClassName BookTest
 * @Description
 * @Author orange
 * @Date 2020-11-05 10:41
 **/

public class BookTest {
    public static void main(String[] args) {
        Book book1 = Book.builder().ISBN("KPN12333").name("java").price(99.9).build();
        Book book2 = Book.builder().ISBN("1901234567890").name("暴力沟通法").price(105.5).build();

        BookService bs = new BookServiceImpl();
        boolean flag = false;
        try {
            flag = bs.uploadBook(book2);
        } catch (ISBNException | NameException | PriceException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("finish");
        }
        System.out.println(flag);
    }
}
