package com.j.datastructure.graph;

/**
 * @ClassName Triple
 * @Description
 * @Author orange
 * @Date 2020-11-10 15:47
 **/

public class Triple implements Comparable<Triple>{
    int row,column,value;

    public Triple(int row,int column,int value){
        this.row = row;
        this.column = column;
        this.value = value;
    }
    @Override
    public int compareTo(Triple tri) {
        return 0;
    }
}
