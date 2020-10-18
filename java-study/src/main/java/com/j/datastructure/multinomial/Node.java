package com.j.datastructure.multinomial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Node
 * @Description TODO
 * @Author orange
 * @Date 17.10.20
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Node {
    /**
     * 数据域，存储数据元素，coefficient:系数;exponent:指数
     */
    public int coef, expo;


    /**
     * 地址域，next指向后驱结点
     */

    public Node next;


    public Node(int coef, int expo) {
        this.coef = coef;
        this.expo = expo;
    }


}
