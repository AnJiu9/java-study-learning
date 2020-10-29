package com.j.datastructure.seq;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.Soundbank;

/**
 * @ClassName SeqList
 * @Description TODO
 * @Author orange
 * @Date 13.10.20
 **/

public class SeqList<T> {
    protected int n;
    protected Object[] element;
    private static final int MIN_CAPACITY = 16;

    public SeqList(int length) {
        if (length < MIN_CAPACITY) {
            length = MIN_CAPACITY;
        }
        this.element = new Object[length];
        this.n = 0;
    }

    public SeqList() {                                //构造方法重载
        this(MIN_CAPACITY);
    }

    public SeqList(T[] values) {                    //构造顺序表
        this(values.length * 2);
        for (int i = 0; i < values.length; i++)
            if (values[i] != null) {
                this.element[this.n++] = values[i];
            }
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
        if (x == null) {
            throw new NullPointerException("x == null");
        }
        if (i >= 0 && i < this.n) {
            this.element[i] = x;
        } else {
            throw new IndexOutOfBoundsException(i + "");
        }
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

    public int binarySearch(Integer key) {
        int low = 0;
        int high = n - 1;
        int mid = (int) Math.floor(low + (high - low) / 2);

        if ((int) this.element[low] > key) {
            System.out.println("不存在该值");
            return -1;
        } else if ((int) this.element[high] < key) {
            System.out.println("不存在该值");
            return -1;
        }

        while (low <= high) {
            if (key == (int) this.element[mid]) {
                System.out.println("此数在该数组的位置为：" + mid);
                break;
            } else if (key > (int) this.element[mid]) {
                low = mid + 1;
                mid = (int) Math.floor(low + (high - low) / 2);
            } else if (key < (int) this.element[mid]) {
                high = mid - 1;
                mid = (int) Math.floor(low + (high - low) / 2);
            }
        }

        return mid;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Integer values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SeqList<Integer> lista = new SeqList<Integer>(values);
        System.out.println(lista.toString());
        lista.binarySearch(4);

    }
}




