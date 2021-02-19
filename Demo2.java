package com.ff.javaexception;

public class Demo2 {
    public static void main(String[] args) {
       /* try{
            可能异常的代码;
        }catch (异常类型(只捕获指定类型的异常)){
            处理异常的代码;
        }*/
    try {
        String s1=null;
        s1.length();
      /*  try {
            String[] s = new String[]{"1", "2", "3"};
            s[3] = "3";
        }catch (ArrayIndexOutOfBoundsException s){
            System.out.println("溢出异常");
        }*/
        String[] s = new String[]{"1", "2", "3"};
        s[3] = "3";

        int x=10;
        int y =0;
        int t = x/y;
        System.out.println("可能异常后面的代码");
    }catch (ArithmeticException s){
        s.printStackTrace();
        System.out.println("算数异常");
    }catch (ArrayIndexOutOfBoundsException s){
        System.out.println("溢出异常");
    }catch (Exception e){
        System.out.println("有异常,不知道啥异常");
    }
        System.out.println("后面的代码");
    }
}

