package com.ff.javaexception;

import java.io.PrintWriter;

public class FinallyDemo1 {
    public static void main(String[] args) {
        FinallyDemo1 f = new FinallyDemo1();
        System.out.println(f.Test(10,0));
    }

    public int Test(int x , int y){
/**
         try{
           可能出现异常的代码
        }catch (异常类型(只捕获指定类型的异常)){
            处理异常
        }finally {
            无论try,catch 中出现异常,也会先执行finally中的内容
        }


         try{
         可能出现异常的代码
         }finally {
         try+finally,没有进行异常处理,try中一旦出现问题,后面的代码就结束运行
         }
         System.out.println("后面的代码");
 */

        try{
           return x/y;
        }catch (Exception e){
            return -1;
        }finally {
            /*
            即使try,catch 中出现异常,也会先执行finally中的内容
             */
            System.out.println("Finally 中的代码");
        }
    }
}

