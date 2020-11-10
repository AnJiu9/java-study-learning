package com.j.datastructure.graph;

import com.j.datastructure.seq.SeqList;

/**
 * @ClassName AbstractGraph
 * @Description
 * @Author orange
 * @Date 2020-11-10 15:40
 **/

public abstract class AbstractGraph<T> implements Graph<T> {
    protected static final int MAX_WEIGHT = 0x0000fffff;
    protected SeqList<T> vertexlist;

    public AbstractGraph() {
        this.vertexlist = new SeqList<T>();
    }

    @Override
    public int vertexCount() {
        return this.vertexlist.size();
    }

    @Override
    public String toString() {
        return "顶点集合："+this.vertexlist.toString()+"\n";
    }

    @Override
    public T get(int i) {
        return this.vertexlist.get(i);
    }

    @Override
    public void set(int i, T x) {
        this.vertexlist.set(i,x);
    }

    @Override
    public int search(T key) {
        return this.vertexlist.search(key);
    }

    @Override
    public T remove(T key) {
        return this.remove(this.search(key));
    }

    protected abstract int next(int i,int j);
}
