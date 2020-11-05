package com.j.java.week9;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author orange
 * @Date 5.11.20
 **/

public interface BookService {
    boolean uploadBook(Book book) throws ISBNException, NameException, PriceException;
}
