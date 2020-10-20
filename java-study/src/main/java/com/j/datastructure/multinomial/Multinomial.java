package com.j.datastructure.multinomial;

import java.io.FileReader;
import java.sql.SQLOutput;
import java.time.temporal.ValueRange;

/**
 * @ClassName Multinomial
 * @Description TODO
 * @Author orange
 * @Date 17.10.20
 **/

public class Multinomial {
    public Node head;


    public Multinomial(){
        this.head = new Node();

    }

    public Node isEmpty(){

        return this.head.next = null;
    }



    public Multinomial(String[] values){
        //初始化头结点
        this();
        //初始化尾指针
        Node rear = this.head;
        //遍历
        for (int i = 0; i < values.length; i++) {
            //split()方法拆分字符串
            //以逗号分离系数、指数
            String[] polyInfo = values[i].split(",");
            //返回用十进制参数表示的整数值，将字符串转为int（整型对象Integer转换为int基本数据类型
            int coef = Integer.parseInt(polyInfo[0]);
            int expo = Integer.parseInt(polyInfo[1]);
            //生成多项式结点
            Node node = new Node(coef, expo);
            rear.setNext(node);
            rear = rear.next;
        }
    }

    /**
     * 合并
     */
    public Node merge(Multinomial list2){
        Node t, p, q, s;
        t  = this.head;
        p = t.next;
        q = list2.head.next;
        s = q.next;

        if(p == null){
            return list2.head;
        }
        if(q == null){
            return this.head;
        }
        while(p != null && q!= null){
            if(p.expo < q.expo){
                if(s == null){
                    p.next = q;
                    q = s;
                }else{
                    p = p.next;
                    t = t.next;
                }
            }else if(p.expo > q.expo){
                q.next = p;
                t.next = q;
                t = t.next;
                q = s;
                if(s == null){
                    break;
                }else {
                    s = s.next;
                }
            }else if(p.expo == q.expo){
                p.coef += q.coef;
//                p = p.next;
//                t = t.next;
                q = s;
                if(s == null){
                    break;
                }else {
                    s = s.next;
                }
            }
        }

        return p;
    }

    /**
     * 打印
     */
    public void print(){
        Node p = this.head.next;

        while(p != null){
            System.out.print(p.coef + "x^" + p.expo);
            if(p.next != null){
                System.out.print("+");
            }else{
                System.out.print(".");
            }
            p = p.next;
        }
    }

    public static void main(String[] args) {

        String[] l1 = {"1,0", "2,1", "5,3", "6,4", "10,7"};
        String[] l2 = {"6,2", "1,3", "6,5", "10,7","11,10"};

        Multinomial list1 = new Multinomial(l1);
        System.out.print("f1(x):");
        list1.print();

        Multinomial list2 = new Multinomial(l2);
        System.out.println("\n");
        System.out.print("f2(x):");
        list2.print();

        System.out.println("\n");
        System.out.println("相加：");
        list1.merge(list2);
        list1.print();


    }
}


