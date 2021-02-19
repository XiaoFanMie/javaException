package com.ff.javaexception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo3 {
    public static void main(String[] args) throws FileNotFoundException {
       /* try{
            可能异常的代码;
        }catch (异常类型(只捕获指定类型的异常)){
            处理异常的代码;
        }*/
    try {

        int x=10;
        int y =0;
        int t = x/y;
        System.out.println("可能异常后面的代码");
    }catch (Exception e){
        //e.printStackTrace(); 将异常信息打印在控制台
        //处理2:打印输出异常的信息,记录日志:异常的信息记录在文件中,通过日志组件打印在指定文件
        //System.out.println(e.getMessage()); 直接将异常打印在控制台
        PrintWriter p = new PrintWriter("E:\\log.txt");
        e.printStackTrace(p);
        p.flush();
        p.close();

        //System.out.println("有异常,不知道啥异常");//异常处理1.给用户提醒
    }
        System.out.println("后面的代码");
    }
}

