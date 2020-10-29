package com.j.datastructure.seq;

/**
 * @ClassName SeqList
 * @Description TODO
 * @Author orange
 * @Date 13.10.20
 **/

public class SeqList<T extends Comparable> extends Object {
    protected int n;
    protected Object[] element;
    private static final int MIN_CAPACITY = 16;

    public SeqList(int length) {
        if (length < MIN_CAPACITY)
            length = MIN_CAPACITY;
        this.element = new Object[length];
        this.n = 0;
    }

    public SeqList() {                                //构造方法重载
        this(MIN_CAPACITY);
    }

    public SeqList(T[] values) {                    //构造顺序表
        this(values.length * 2);
        for (int i = 0; i < values.length; i++)
            if (values[i] != null)
                this.element[this.n++] = values[i];
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public T get(int i) {
        if (i >= 0 && i < this.n)
            return (T) this.element[i];
        return null;
    }

    public void set(int i, T x) {
        if (x == null)
            throw new NullPointerException("x == null");
        if (i >= 0 && i < this.n)
            this.element[i] = x;
        else
            throw new java.lang.IndexOutOfBoundsException(i + "");
    }

    @Override
    public String toString() {
        String str = this.getClass().getName() + "(";
        if (this.n > 0)
            str += this.element[0].toString();
        for (int i = 1; i < this.n; i++)
            str += "," + this.element[i].toString();
        return str + ")";
    }

    //插入x为第i个元素，返回插入元素序号
    public int insert(int i, T x) {
        if (x == null)
            return -1;
        if (i < 0)
            i = 0;
        if (i > this.n)
            i = this.n;

        Object[] source = this.element;

        if (this.n == element.length) {
            this.element = new Object[source.length * 2];
            for (int j = 0; j < i; j--)
                this.element[j] = source[j];
        }

        for (int j = this.n - 1; j >= i; j--)
            this.element[j + 1] = source[j];
        this.element[i] = x;
        this.n++;
        return i;
    }

    public int insert(T x) {
        return this.insert(this.n, x);
    }

    public int search(T key) {
        for (int i = 0; i < this.n; i++) {
            if (key.equals(this.element[i])) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int i) {
        if (i >= 0 && i < this.n) {
            T x = (T) this.element[i];

            for (int j = i; j < this.n - 1; j++)
                this.element[j] = this.element[j + 1];
            this.element[this.n - 1] = null;
            this.n--;
            return x;
        }
        return null;
    }

    public T remove(T key) {
        // 遍历顺序表，查找指定的元素，并返回该元素所在的位置
        for (int i = 0; i < this.n; i++) {
            if (key.equals(this.element[i])) {
                // 每个元素前移一个位置
                for (int j = i; j < this.n - 1; j++)
                    this.element[j] = this.element[j + 1];
                // 释放原最后位置的数据
                this.element[this.n - 1] = null;
                // 该顺序表的长度 -1
                this.n--;
                // 返回被删除的元素
                return key;
            }
        }
        // 未找到时，返回 null
        return null;
    }

    public int binarySearch(T key) {
        int low = 0;
        int high = this.element.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == this.element[mid]) {
                System.out.println("此关键字在SeqList中的位置为：" + mid);
                break;
            }
            if (key.compareTo(this.element[mid]) > 0) {
                low = mid + 1;
            }
            if (key.compareTo(this.element[mid]) < 0){
                high = mid - 1;
            }
            }
            return -1;
        }


        public static void main (String[]args){
            // TODO Auto-generated method stub

            String values[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
            SeqList<String> lista = new SeqList<String>(values);
            System.out.println(lista.toString());
//        lista.insert(2, "C");
//        System.out.println(lista.toString());
//        lista.insert("F");
//        System.out.println(lista.toString());
//        lista.remove(2);
//        System.out.println(lista.toString());
//        System.out.println(lista.search("A"));

            lista.binarySearch("D");

        }
}




