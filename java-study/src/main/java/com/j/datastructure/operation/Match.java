package com.j.datastructure.operation;

/**
 * @ClassName Match
 * @Description TODO
 * @Author orange
 * @Date 18.10.20
 **/

public class Match {
    public static String check(String target, String left, String right){
        Stack<String> stack = new SeqStack<String >();
        int i = 0;
        char ch =' ';
        while(i < target.length()){
            while(i<target.length() && (ch=target.charAt(i))!=left.charAt(0) && ch!=right.charAt(0)) {
                i++;
            }
            if(target.indexOf(left, i) == i){
                stack.push(left);
                i+=left.length();
            }else if(target.startsWith(right, i)){
                if(stack.isEmpty() || !stack.pop().equals(left)){
                    return "语法错误, i=" +i+ ", 多余" +right;
                }
                i+= right.length();
            }
        }
        return (stack.isEmpty())?"匹配" : "语法错误，i=" +i+ ",缺少" + right;
    }

    public static void main(String[] args) {
        String target="((1+2)*3+4)(",left="(",right=")";
        System.out.println("\""+target+"\","+Match.check(target,left,right));
    }
}
