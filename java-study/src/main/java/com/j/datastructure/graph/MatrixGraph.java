package com.j.datastructure.graph;

import com.sun.org.apache.regexp.internal.RE;

import javax.sound.midi.Soundbank;
import java.security.PublicKey;

/**
 * @ClassName MatrixGraph
 * @Description
 * @Author orange
 * @Date 2020-11-10 15:50
 **/

public class MatrixGraph<T> extends AbstractGraph<T> {
    protected Matrix matrix;

    public MatrixGraph() {
        super();
        this.matrix = new Matrix(0, 0);
    }

    public MatrixGraph(T[] vertexes) {
        this();
        for (int i = 0; i < vertexes.length; i++) {
            this.insert(vertexes[i]);
        }
    }

    public MatrixGraph(T[] vertexes, Triple[] edges) {
        this(vertexes);
        for (int j = 0; j < edges.length; j++) {
            this.insert(edges[j]);
        }
    }

    @Override
    public String toString() {
        String str = super.toString() + "邻接矩阵：\n";
        int n = this.vertexCount();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matrix.get(i, j) == MAX_WEIGHT) {
                    str += "      ∞";
                } else {
                    str += String.format("%6d", this.matrix.get(i, j));
                }
            }
            str += "\n";
        }
        return str;
    }

    @Override
    protected int next(int i, int j) {
        return 0;
    }

    @Override
    public int insert(T x) {
        this.vertexlist.insert(x);
        int i = this.vertexlist.size() - 1;
        if (i >= this.matrix.getRows()) {
            this.matrix.setRowsColumns(i + 1, i + 1);
        }
        for (int j = 0; j < i; j++) {
            this.matrix.set(i, j, MAX_WEIGHT);
            this.matrix.set(j, i, MAX_WEIGHT);
        }
        return i;
    }

    @Override
    public void insert(int i, int j, int w) {
        if (i != j) {
            if (w <= 0 || w > MAX_WEIGHT) {
                w = MAX_WEIGHT;
            }
            this.matrix.set(i, j, w);
        } else {
            throw new IllegalArgumentException("不能插入自身环，i=" + i + ",j=" + j);
        }
    }

    public void insert(Triple edge) {
        this.insert(edge.row, edge.column, edge.value);
    }

    public int degree(String value, String[] vertexes) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < vertexes.length; i++) {
            if (vertexes[i].equals(value)) {
                index = i;
            }
        }
        for (int i = 0; i < matrix.getColumns(); i++) {
            if (matrix.get(index, i) < MAX_WEIGHT && matrix.get(index, i) != 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public T remove(int i) {
        return null;
    }

    @Override
    public void remove(int i, int j) {

    }

    @Override
    public int weight(int i, int j) {
        return 0;
    }

    @Override
    public void DFSTraverse(int i) {

    }

    @Override
    public void BFSTraverse(int i) {

    }

    @Override
    public void minSpanTree() {

    }

    @Override
    public void shortestPath(int i) {

    }

    @Override
    public void shortestPath() {

    }


    public static void main(String[] args) {
        String[] vertexes = {"A", "B", "C", "D", "E", "F"};
        Triple[] edges = {new Triple(0, 1, 45),
                new Triple(0, 2, 28),
                new Triple(0, 3, 10),
                new Triple(1, 0, 45),
                new Triple(1, 2, 12),
                new Triple(1, 4, 21),
                new Triple(2, 0, 28),
                new Triple(2, 1, 12),
                new Triple(2, 3, 17),
                new Triple(2, 4, 26),
                new Triple(3, 0, 10),
                new Triple(3, 2, 17),
                new Triple(3, 4, 15),
                new Triple(3, 5, 13),
                new Triple(4, 1, 21),
                new Triple(4, 2, 26),
                new Triple(4, 3, 15),
                new Triple(4, 5, 11),
                new Triple(5, 3, 13),
                new Triple(5, 4, 11)};
        MatrixGraph<String> graph = new MatrixGraph<String>(vertexes, edges);
        System.out.println("带权无向图G3，" + graph.toString());

        for (int i = 0; i < vertexes.length; i++) {
            System.out.println(vertexes[i] + "的度为："+ graph.degree(vertexes[i],vertexes));
        }
    }
}
