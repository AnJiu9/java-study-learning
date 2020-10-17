package com.j.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName 图书实体类
 * @Description TODO
 * @Author orange
 * @Date 15.10.20
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
