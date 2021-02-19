package com.ff.javaexception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Demo4 {
    /**
     * throws:作为方法的声明,声明此方法中可能出现的某种异常,调用时,需要注意
     */
    public static void main(String[] args) {
        Demo4 d4 = new Demo4();
        try {
            d4.Meth1();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public void Meth1() throws UnsupportedEncodingException, FileNotFoundException {
        Meth2();
    }

    //声明此方法可能会出现异常,可以声明多个,一般多为编译期异常
    public void Meth2() throws UnsupportedEncodingException, FileNotFoundException {
        try {
            "abc".getBytes("utf-8");
        } finally {
            System.out.println("需要执行的代码");
        }
    }

}
