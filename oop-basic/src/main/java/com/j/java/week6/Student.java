package com.j.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author orange
 * @Date 15.10.20
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {
    private  String id;
    private String studentName;
    private String gender;
    private Phone phone;
    private List<Book> bookList;


}
