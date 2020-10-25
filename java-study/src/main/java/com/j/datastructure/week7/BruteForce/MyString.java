package com.j.datastructure.week7.BruteForce;

/**
 * @ClassName MyString
 * @Description 常量字符串类，最终类，实现可比较接口和序列化接口
 * @Author orange
 * @Date 25.10.20
 **/

public final class MyString implements Comparable<MyString>, java.io.Serializable {

    /**
     * 字符数组，私有最终变量，只能赋值一次
     */
    private final char[] value;

    /**
     * 构造空串""，串长度为0
     */
    public MyString() {
        this.value = new char[0];
    }

    /**
     * 由字符串常量构造串
     *
     * @param s
     */
    public MyString(java.lang.String s) {
        //申请字符数组并复制s串的所有字符
        this.value = new char[s.length()];
        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = s.charAt(i);
        }
    }

    /**
     * 以value数组从i开始的n个字符构造串，i>=0, n>=0, i+n<=value.length
     * 若i或n指定序号越界，则抛出字符串序号越界异常
     */
    public MyString(char[] value, int i, int n) {
        if (i >= 0 && n >= 0 && i + n <= value.length) {
            //申请字符数组并复制所有字符
            this.value = new char[n];
            for (int j = 0; j < n; j++) {
                this.value[j] = value[i];
            }
        } else {
            throw new StringIndexOutOfBoundsException("i=" + i + ",n=" + n + ",i+n=" + (i + n));
        }
    }

    /**
     * 以字符数组构造串
     *
     * @param value
     */
    public MyString(char[] value) {
        this(value, 0, value.length);
    }

    /**
     * 拷贝构造方法，深度拷贝，复制字符
     *
     * @param s
     */
    public MyString(MyString s) {
        this(s.value);
    }

    /**
     * 返回串长度，即字符数组容量
     *
     * @return
     */
    public int length() {
        return this.value.length;
    }

    @Override
    public java.lang.String toString() {
        return new String(this.value);
    }

    /**
     * 返回第i个字符串，0<=i<length()，若i越界，则抛出字符串序号越界异常
     *
     * @param i
     * @return
     */
    public char charAt(int i) {
        if (i >= 0 && i < this.value.length) {
            return this.value[i];
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    /**
     * 比较this与s串的大小，返回两者差值
     *
     * @param s
     * @return
     */
    @Override
    public int compareTo(MyString s) {
        for (int i = 0; i < this.value.length && i < s.value.length; i++) {
            if (this.value[i] != s.value[i]) {
                //返回两串第一个不同字符的差值
                return this.value[i] - s.value[i];
            }
        }
        //前缀子串，返回两串长度的差值
        return this.value.length - s.value.length;
    }

    /**
     * 返回序号从begin至end-1的子串，0<=begin<length(), 0<=end<=length, begin<end
     *
     * @param begin
     * @param end
     * @return
     */
    public MyString substring(int begin, int end) {
        if (begin == 0 && end == this.value.length) {
            return this;
        }
        //以字符数组构造串，若begin、end越界、则抛出异常
        return new MyString(this.value, begin, end - begin);
    }

    /**
     * 返回序号从begin至串尾的子串
     *
     * @param begin
     * @return
     */
    public MyString substring(int begin) {
        return substring(begin, this.value.length);
    }

    /**
     * 返回this与s串连接生成的串，若s==null或""，则返回深拷贝的this
     *
     * @param s
     * @return
     */
    public MyString concat(MyString s) {
        if (s == null || s.equals(" ")) {
            //深拷贝this
            s = new MyString(this.value);
        }
        char[] buffer = new char[this.value.length + s.length()];
        int i;
        //复制this
        for (i = 0; i < this.value.length; i++) {
            buffer[i] = this.value[i];
        }
        //复制指定串s
        for (int j = 0; j < s.value.length; j++) {
            buffer[i + j] = s.value[j];
        }
        //以字符数组构造串对象
        return new MyString(buffer);
    }

    /**
     * 在this串（目标串）中查找首个与模式串pattern匹配的子串并返回序号，匹配失败时返回-1
     *
     * @param pattern
     * @return
     */
    public int indexOf(MyString pattern) {
        return this.indexOf(pattern, 0);
    }

    //返回this串（目标串）从begin开始首个与模式串pattern匹配的子串序号int ，匹配失败返回-1
    //0<=begin<this.length(). 对begin容错，若begin<0,则从0开始；若begin序号越界，则查找不成功
    //若pattern==null，则抛出空对象异常
    public int indexOf(MyString pattern, int begin) {
        int n = this.length(), m = pattern.length();
        //对begin容错，若begin<0,则从0开始
        if (begin < 0) {
            begin = 0;
        }
        //若目标串空，较短或begin越界，则不需比较
        if (n == 0 || n < m || begin >= n) {
            return -1;
        }
        //i、j分别为目标串和模式串this字符下标
        int i = begin, j = 0;
        while (i < n && j < m) {
            //若this两字符相等，则继续比较后续字符
            if (this.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } //否则i、j回溯，进行下次匹配
            else {
                //目标串下标i，退回到下个待匹配子串序号
                i = i - j + 1;
                //模式串下标j，退回到0
                j = 0;
                //若目标串剩余子串的长度不够，则不再比较
                if (i > n - m) {
                    break;
                }
            }
        }
        //若匹配成功，则返回匹配子串序号，否则返回-1
        return j == m ? i - m : -1;
    }

    public static void main(String[] args) {
        //构造空串
        MyString s1 = new MyString();
        //以java.lang.String字符串常量构造串对象
        MyString s2 = new MyString("abc");
        //字符数组，只能在声明时赋值，不能赋值为"abcd"
        char[] letters = {'a', 'b', 'c', 'd'};
        //以字符数组构造串对象
        MyString s3 = new MyString(letters);
        //拷贝构造方法
        MyString s4 = new MyString(s3);

        //插入串
        //没有增加'\0'
        String s5 = "abcdef", s6 = "xyz";
        int i = 3;
        //返回在s5串的i处插入s6后的串
        String s7 = s5.substring(0, i) + s6 + s5.substring(i);

        //删除串
        int begin = 3, end = 6;
        //删除s串中从begin到end-1处的子串
        String s8 = s7.substring(0, begin) + s7.substring(end);


        MyString target = new MyString("aababcd"),  pattern = new MyString("abcd");
        System.out.println("\""+target+"\".indexOf(\""+pattern+"\")="+target.indexOf(pattern));
    }
}
