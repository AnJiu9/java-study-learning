package com.j.java.week6;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author orange
 * @Date 15.10.20
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Phone {

    /**
     * 品牌
     */
    private String brand;
    /**
     * 价格
     */
    private String price;
}
