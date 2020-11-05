package com.j.java.week9;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description 图书类
 * @Author orange
 * @Date 2020-11-05 10:27
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {
    private String ISBN;
    private String name;
    private Double price;
}
