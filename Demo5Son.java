package com.ff.javaexception;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public abstract class Demo5Son extends Demo5{

    /**
    子类中重写方法,声明的异常类型小于或等于父类的异常类型
     */
    @Override
    public void test() throws UnsupportedEncodingException {

    }
}
