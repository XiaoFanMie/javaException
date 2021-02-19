package com.ff.javaexception;

import java.io.UnsupportedEncodingException;

public class day1 {
    public static void main(String[] args) {
        /*
        1.数组索引越界 java.lang.ArrayIndexOutOfBoundsException
         */
        /*int [] a = new int[2];
        a[2]=5 ;*/

        /*
        2.空指针异常 java.lang.NullPointerException
         */
        /*String S=null;
        System.out.println(S.length());*/


        /*
        3.类型转换异常java.lang.ClassCastException
         */
        /*Object obj = "abc";
        Integer in = (Integer) obj;*/


        /*
        4.数字格式化异常  java.lang.NumberFormatException
         */
        /*new Integer("abc");*/


        /*
        5.算数异常
        java.lang.ArithmeticException / by zero
         */
        //int x=10/0;

        //异常处理机制,有的异常不强制处理,有的需要强制处理
        try{
            String s = "utf-8";
            byte [] b = "abc".getBytes(s);
        }catch (UnsupportedEncodingException s){
            System.out.println("编译错误");
        }
        System.out.println("代码");
    }
}
