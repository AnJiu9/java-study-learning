package com.j.java.week6.oopBasic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author orange
 * @Date 17.10.20
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {
    private String bookName;
    private Integer price;
    private Date publishDate;


}
