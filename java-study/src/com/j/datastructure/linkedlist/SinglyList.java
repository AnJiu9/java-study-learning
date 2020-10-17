package com.j.datastructure.linkedlist;

/**
 * @ClassName SinglyList
 * @Description TODO
 * @Author orange
 * @Date 13.10.20
 **/

public class SinglyList<T extends Comparable> extends Object {
    public Node<T> head;

    public SinglyList(){

        this.head = new Node<T>();
    }

    public SinglyList(T[] values){
        this();
        Node<T> rear = this.head;
        //遍历单链表数组
        for (T value : values) {
            if (value != null) {
                rear.next = new Node<T>(value, null);
                rear = rear.next;
            }
        }
    }



    public boolean isEmpty(){
        return this.head.next==null;
    }

    public T get(int i){
        Node<T> p = this.head.next;
        for(int j =0; p!=null && j<i; j++){
            p = p.next;
        }
        return (i>=0 && p!=null) ? p.data : null;
    }

    public void set(int i, T x){
        if(x == null) {
            throw new NullPointerException("x == null");
        }
        else {
            Node<T> p = this.head.next;
            for(int j =0; p!=null && j<i; j++){
                p = p.next;
            }
            p.data = x;
        }
    }

    /**
     * 返回单链表长度
     * @return
     */
    public int size(){
        int size=0;
        Node<T> p=head.next;
        while(p!=null){
            p=p.next;
            size++;
        }
        return size;
    }


    public Node<T> insert(int i, T x){
        if(x==null) {
            return null;
        }
        Node<T> front = this.head;
        for(int j=0; front.next!=null && j<i; j++) {
            front = front.next;
        }
        front.next = new Node<T>(x, front.next);
        return front.next;
    }

    public Node<T> insert(T x){

        return insert(Integer.MAX_VALUE, x);
    }

    public T remove(int i){
        Node<T> front = this.head;
        for(int j=0; front.next!=null && j<i; j++) {
            front = front.next;
        }
        if(i>=0 && front.next!=null){
            T x = front.next.data;
            front.next = front.next.next;
            return x;
        }
        return null;
    }

    public void clear(){
        this.head.next = null;
    }

    public int search(T key){
        Node<T> p = this.head;
        //标志是否找到待删除元素
        int count = 0;
        while (p!=null) {
            //已经到单链表的末尾
            if (p.data == key) {
                return count;
            }
            p = p.next;
            count++;
        }
        return -1;
    }

    public void remove(T key){
        Node<T> p = this.head;
        //标志是否找到待删除元素
        boolean flag = false;
        while (true) {
            //已经到单链表的末尾
            if (p.next == null){
                break;
            }
            if (p.next.data == key){
                //找到待删除元素的前一个元素
                flag = true;
                break;
            }
            //p后移，遍历
            p = p.next;
        }
        if(flag){
            p.next = p.next.next;
        }
        else{
            System.out.println("要删除的元素不存在");
        }
    }

    public  void reverse(SinglyList<T> lists){
        Node<T> p = lists.head.next,succ=null,front=null;

        while (p!=null){
            succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        lists.head.next = front;
    }

    /*public static void reverse(SinglyList<String> lists){
        Node<String> p = lists.head.next,q;
        lists.head.next=null;
        while (p!=null){
            q=p.next;
            p.next = lists.head.next;
            lists.head.next=p;
            p=q;
        }

    }*/

    public Node<T> merge(SinglyList<T> list2) {
        Node<T> t, p, q, s;
        t = this.head;
        p = this.head.next;
        q = list2.head.next;
        s = q.next;

        if (p == null) {
            return list2.head;
        }
        while (p != null && q != null){
            if(p.data.equals(q.data)){
                p = p.next;
                t = t.next;
                q = q.next;
                if(s == null){
                    break;
                }else {
                    s = s.next;
                }
            }else if(p.data.compareTo(q.data) > 0){
                q.next = t.next;
                t.next = q;
                t = t.next;
                q = s;
                if(s == null){
                    break;
                }else {
                    s = s.next;
                }
            }else if(p.data.compareTo(q.data) < 0){
                p = p.next;
                t = t.next;
            }

        }
        return p;
    }




    public void print(){

        //输出单链表中所有结点
        Node<T> p = this.head.next;
        while(p!=null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Integer[] l1 = {1,2,3,5};
        Integer[] l2 = {4,5,6};

        SinglyList<Integer> lists = new SinglyList<Integer>(l1);
        SinglyList<Integer> list2 = new SinglyList<Integer>(l2);


//        Node<Integer> merge = lists.merge(list2);
//        SinglyList<Integer> singlyList = new SinglyList<Integer>(merge);
//        System.out.println("合并");
//        lists.print();

        lists.merge(list2);
        lists.print();
        


//        System.out.println("单链表所有节点");
//        lists.print();
//        System.out.println(" \n" + "单链表长度："  + lists.size());
//        System.out.println("获取指定元素：" + lists.get(3));
//
//        System.out.println("修改指定下标元素");
//        lists.set(2, 3);
//        lists.print();
//
//        System.out.println("\n" + "删除指定下标元素");
//        lists.remove(3);
//        lists.print();
//
//        System.out.println("\n" + "查找的元素下标：");
//        System.out.println(lists.search(1));
//
//        System.out.println("\n" + "根据关键字删除");
//        lists.remove(5);
//        lists.print();
//
//        System.out.println("\n" + "末尾添加");
//        lists.insert(6);
//        lists.print();
//
//        System.out.println("\n" + "在指定位置插入数据");
//        lists.insert(2,3);
//        lists.print();
//
//        System.out.println("\n" + "逆置单链表");
//        lists.reverse(lists);
//        lists.print();

    }
}


