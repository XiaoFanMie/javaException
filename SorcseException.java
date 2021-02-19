package com.ff.javaexception;

/*
自定义异常类:根据业务逻辑的需要,来指定一种场景下的异常类
 */
public class SorcseException extends Exception{

    public SorcseException(String message) {
        super(message);
    }
}
