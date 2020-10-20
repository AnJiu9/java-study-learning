package com.j.datastructure.operation;

import com.j.datastructure.seq.SeqList;

/**
 * @ClassName Operators
 * @Description TODO
 * @Author orange
 * @Date 18.10.20
 **/

public class Operators implements java.util.Comparator<String>{
    private String[] operator={"*","/","%","+","-","&","^","|"};
    private int[] priority={3,3,3,4,4,8,9,10};
    private SeqList<String> operlist;

    public Operators(){
        this.operlist = new SeqList<String>(this.operator);
    }

    @Override
    public int compare(String oper1, String oper2){
        int i = operlist.search(oper1);
        int j = operlist.search(oper2);
        return this.priority[i] - this.priority[j];
    }

    public int operate(int x, int y, String oper){
        int value = 0;
        switch (oper){
            case "+": value = x+y;  break;
            case "-": value = x-y; break;
            case "*": value = x*y; break;
            case "/": value = x/y; break;
            case "%": value = x%y; break;
            case "&": value = x&y; break;
            case "^": value = x^y; break;
            case "|": value = x|y; break;
            default: break;
        }
        return value;
    }


}
