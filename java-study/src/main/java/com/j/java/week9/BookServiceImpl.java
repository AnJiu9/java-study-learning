package com.j.java.week9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author orange
 * @Date 2020-11-05 10:33
 **/

public class BookServiceImpl implements BookService {
    @Override
    public boolean uploadBook(Book book) throws ISBNException, NameException, PriceException {
        Pattern pattern = compile("\\d{13}");
        Matcher matcher = pattern.matcher(book.getISBN());
        if (!matcher.matches()) {
            throw new ISBNException("ISBN不是13位数字组成");
        } else if (book.getName().contains("暴力") || book.getName().contains("恐怖")) {
            throw new NameException("书名中含有禁词！");
        }
        if (book.getPrice() > 100) {
            throw new PriceException("价格超过100！");
        }
        return true;
    }
}
